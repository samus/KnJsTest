# KnJsTest
A small proof of concept using Kotlin/Native and JavaScriptCore together on iOS.

JavaScriptCore is the embeddable JavaScript engine that powers Safari and ReactNative.  Native objects can be exposed 
to the JavaScript context and interacted with via JavaScript code.  This small project is a test to see if it is possible to
expose native objects written in Kotlin/Native to the JavaScriptCore engine.  

The tl;dr; is that it is possible but requiressome care and workarounds.

## JavaScriptCore ##

Almost all of the iOS platform libraries are exposed to Kotlin code via the `cinterop` tool and defined in `.def` files.
Unfortunately JavaScriptCore is not one of those. The bindings generator does not produce proper Kotlin code when run
against the JavaScriptCore framework since `JSValue` has a `toString()` method in it.  Copying the generated file and making
the necessary changes to fix the syntax error doesn't solve a second compilation error.

Objects being added to the JSContext need to inherit from the `JSExport` protocol and since there isn't a good way to make 
this happen in Kotlin for the time being, it is easier to do this in Swift by defining a protocol and then using a class
extension to make the Kotlin objects conform to it.

```
@objc protocol MyClassExports: JSExport {
}

extension MyClass: MyClassExports {
    static func create() -> MyClass { 
        return MyClass()
    }
}
```

Note that `MyClass` defines a static method to instantiate the `MyClass` object.  This is because the exports protocol cannot
define a constructor.  See the excellent [JavaScriptCore](https://nshipster.com/javascriptcore/) article on NSHipster for
more information.

## The Garbage Collector ##

Objects that live inside of the JavaScriptCore engine will invariably be garbage collected.  This poses a problem to 
Kotlin/Native objects as the garbage collector runs on another thread.  Mutable Kotlin/Native objects should only be accessed
on the thread in which they are created.  To get around this an object can be frozen.  Unfortunately trying to mutate a
frozen object will throw an exception.

## Semi-frozen Objects ##

It is possible for an object to have some mutable state while it is frozen through the use of a `StableRef`.  The stable 
reference must only be accessed from the thread which created the Kotlin object.  This works fine with JavaScriptCore as it is
single threaded and the JavaScript code only ever runs in the dispatch queue the `JSContext` was created in.  In this example
all instance variable state is stored inside of a `HashMap` contained in a `StableRef`.  Properties use this for their backing
storage instead of instead.
```
    private val stateRef = StableRef.create(HashMap<String, Any>())
    actual var platform: String
        get() = stateRef.get()["platform"] as? String ?: ""
        set(value) { stateRef.get()["platform"] = value }
```

## Conclusion ##
It is possible to embedd Kotlin/Native objects inside of JavaScriptCore on iOS.  It may even be possible to do the same
in a JavaScriptCore compiled for Android and share the same code.  The workarounds required make it awkward to just 
embedd objects that may already exist in a codebase.  Instead wrappers that wrap the ojbect instance in a `StableRef` and 
have properties and methods that delegate down to the instance might make more sense.  Such an idea would look like:

```
data class MyClass(var foo: String)
class MyClassWrapper(myClass: MyClass) {
    private val ref = StableRef.create(myClass)
    var foo: String
        get() = ref.get().foo
        set(value) { ref.get().foo = value }
}
```
