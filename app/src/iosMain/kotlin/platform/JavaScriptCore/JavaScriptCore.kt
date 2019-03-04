@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION", "DEPRECATION_ERROR")
package platform.JavaScriptCore

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import cnames.structs.OpaqueJSClass
import cnames.structs.OpaqueJSContext
import cnames.structs.OpaqueJSContextGroup
import cnames.structs.OpaqueJSPropertyNameAccumulator
import cnames.structs.OpaqueJSPropertyNameArray
import cnames.structs.OpaqueJSString
import cnames.structs.OpaqueJSValue
import cnames.structs._NSZone
import cnames.structs.__CFString
import kotlin.collections.List
import kotlin.collections.Map
import platform.CoreFoundation.CFAllocatorRef
import platform.CoreFoundation.CFStringRef
import platform.CoreGraphics.CGPoint
import platform.CoreGraphics.CGRect
import platform.CoreGraphics.CGSize
import platform.Foundation.NSDate
import platform.Foundation.NSNumber
import platform.Foundation.NSRange
import platform.Foundation.NSURL
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSUInteger
import platform.posix.int32_t
import platform.posix.size_t
import platform.posix.uint32_t

// NOTE THIS FILE IS AUTO-GENERATED

fun JSEvaluateScript(ctx: JSContextRef?, script: JSStringRef?, thisObject: JSObjectRef?, sourceURL: JSStringRef?, startingLineNumber: Int, exception: CValuesRef<JSValueRefVar>?): JSValueRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge0(ctx.rawValue, script.rawValue, thisObject.rawValue, sourceURL.rawValue, startingLineNumber, exception?.getPointer(memScope).rawValue))
    }
}

fun JSCheckScriptSyntax(ctx: JSContextRef?, script: JSStringRef?, sourceURL: JSStringRef?, startingLineNumber: Int, exception: CValuesRef<JSValueRefVar>?): Boolean {
    memScoped {
        return kniBridge1(ctx.rawValue, script.rawValue, sourceURL.rawValue, startingLineNumber, exception?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSGarbageCollect(ctx: JSContextRef?): Unit {
    return kniBridge2(ctx.rawValue)
}

fun JSValueGetType(ctx: JSContextRef?, value: JSValueRef?): JSType {
    return JSType.byValue(kniBridge3(ctx.rawValue, value.rawValue))
}

fun JSValueIsUndefined(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge4(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsNull(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge5(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsBoolean(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge6(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsNumber(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge7(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsString(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge8(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsObject(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge9(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsObjectOfClass(ctx: JSContextRef?, value: JSValueRef?, jsClass: JSClassRef?): Boolean {
    return kniBridge10(ctx.rawValue, value.rawValue, jsClass.rawValue).toBoolean()
}

fun JSValueIsArray(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge11(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueIsDate(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge12(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueGetTypedArrayType(ctx: JSContextRef?, value: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): JSTypedArrayType {
    memScoped {
        return JSTypedArrayType.byValue(kniBridge13(ctx.rawValue, value.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSValueIsEqual(ctx: JSContextRef?, a: JSValueRef?, b: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): Boolean {
    memScoped {
        return kniBridge14(ctx.rawValue, a.rawValue, b.rawValue, exception?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSValueIsStrictEqual(ctx: JSContextRef?, a: JSValueRef?, b: JSValueRef?): Boolean {
    return kniBridge15(ctx.rawValue, a.rawValue, b.rawValue).toBoolean()
}

fun JSValueIsInstanceOfConstructor(ctx: JSContextRef?, value: JSValueRef?, constructor: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): Boolean {
    memScoped {
        return kniBridge16(ctx.rawValue, value.rawValue, constructor.rawValue, exception?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSValueMakeUndefined(ctx: JSContextRef?): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge17(ctx.rawValue))
}

fun JSValueMakeNull(ctx: JSContextRef?): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge18(ctx.rawValue))
}

fun JSValueMakeBoolean(ctx: JSContextRef?, boolean: Boolean): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge19(ctx.rawValue, boolean.toByte()))
}

fun JSValueMakeNumber(ctx: JSContextRef?, number: Double): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge20(ctx.rawValue, number))
}

fun JSValueMakeString(ctx: JSContextRef?, string: JSStringRef?): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge21(ctx.rawValue, string.rawValue))
}

fun JSValueMakeFromJSONString(ctx: JSContextRef?, string: JSStringRef?): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge22(ctx.rawValue, string.rawValue))
}

fun JSValueCreateJSONString(ctx: JSContextRef?, value: JSValueRef?, indent: UInt, exception: CValuesRef<JSValueRefVar>?): JSStringRef? {
    memScoped {
        return interpretCPointer<OpaqueJSString>(kniBridge23(ctx.rawValue, value.rawValue, indent, exception?.getPointer(memScope).rawValue))
    }
}

fun JSValueToBoolean(ctx: JSContextRef?, value: JSValueRef?): Boolean {
    return kniBridge24(ctx.rawValue, value.rawValue).toBoolean()
}

fun JSValueToNumber(ctx: JSContextRef?, value: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): Double {
    memScoped {
        return kniBridge25(ctx.rawValue, value.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSValueToStringCopy(ctx: JSContextRef?, value: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): JSStringRef? {
    memScoped {
        return interpretCPointer<OpaqueJSString>(kniBridge26(ctx.rawValue, value.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSValueToObject(ctx: JSContextRef?, value: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge27(ctx.rawValue, value.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSValueProtect(ctx: JSContextRef?, value: JSValueRef?): Unit {
    return kniBridge28(ctx.rawValue, value.rawValue)
}

fun JSValueUnprotect(ctx: JSContextRef?, value: JSValueRef?): Unit {
    return kniBridge29(ctx.rawValue, value.rawValue)
}

fun JSClassCreate(definition: CValuesRef<JSClassDefinition>?): JSClassRef? {
    memScoped {
        return interpretCPointer<OpaqueJSClass>(kniBridge30(definition?.getPointer(memScope).rawValue))
    }
}

fun JSClassRetain(jsClass: JSClassRef?): JSClassRef? {
    return interpretCPointer<OpaqueJSClass>(kniBridge31(jsClass.rawValue))
}

fun JSClassRelease(jsClass: JSClassRef?): Unit {
    return kniBridge32(jsClass.rawValue)
}

fun JSObjectMake(ctx: JSContextRef?, jsClass: JSClassRef?, data: CValuesRef<*>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge33(ctx.rawValue, jsClass.rawValue, data?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeFunctionWithCallback(ctx: JSContextRef?, name: JSStringRef?, callAsFunction: JSObjectCallAsFunctionCallback?): JSObjectRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge34(ctx.rawValue, name.rawValue, callAsFunction.rawValue))
}

fun JSObjectMakeConstructor(ctx: JSContextRef?, jsClass: JSClassRef?, callAsConstructor: JSObjectCallAsConstructorCallback?): JSObjectRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge35(ctx.rawValue, jsClass.rawValue, callAsConstructor.rawValue))
}

fun JSObjectMakeArray(ctx: JSContextRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge36(ctx.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeDate(ctx: JSContextRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge37(ctx.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeError(ctx: JSContextRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge38(ctx.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeRegExp(ctx: JSContextRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge39(ctx.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeFunction(ctx: JSContextRef?, name: JSStringRef?, parameterCount: UInt, parameterNames: CValuesRef<JSStringRefVar>?, body: JSStringRef?, sourceURL: JSStringRef?, startingLineNumber: Int, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge40(ctx.rawValue, name.rawValue, parameterCount, parameterNames?.getPointer(memScope).rawValue, body.rawValue, sourceURL.rawValue, startingLineNumber, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectGetPrototype(ctx: JSContextRef?, `object`: JSObjectRef?): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge41(ctx.rawValue, `object`.rawValue))
}

fun JSObjectSetPrototype(ctx: JSContextRef?, `object`: JSObjectRef?, value: JSValueRef?): Unit {
    return kniBridge42(ctx.rawValue, `object`.rawValue, value.rawValue)
}

fun JSObjectHasProperty(ctx: JSContextRef?, `object`: JSObjectRef?, propertyName: JSStringRef?): Boolean {
    return kniBridge43(ctx.rawValue, `object`.rawValue, propertyName.rawValue).toBoolean()
}

fun JSObjectGetProperty(ctx: JSContextRef?, `object`: JSObjectRef?, propertyName: JSStringRef?, exception: CValuesRef<JSValueRefVar>?): JSValueRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge44(ctx.rawValue, `object`.rawValue, propertyName.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectSetProperty(ctx: JSContextRef?, `object`: JSObjectRef?, propertyName: JSStringRef?, value: JSValueRef?, attributes: JSPropertyAttributes, exception: CValuesRef<JSValueRefVar>?): Unit {
    memScoped {
        return kniBridge45(ctx.rawValue, `object`.rawValue, propertyName.rawValue, value.rawValue, attributes, exception?.getPointer(memScope).rawValue)
    }
}

fun JSObjectDeleteProperty(ctx: JSContextRef?, `object`: JSObjectRef?, propertyName: JSStringRef?, exception: CValuesRef<JSValueRefVar>?): Boolean {
    memScoped {
        return kniBridge46(ctx.rawValue, `object`.rawValue, propertyName.rawValue, exception?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSObjectGetPropertyAtIndex(ctx: JSContextRef?, `object`: JSObjectRef?, propertyIndex: UInt, exception: CValuesRef<JSValueRefVar>?): JSValueRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge47(ctx.rawValue, `object`.rawValue, propertyIndex, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectSetPropertyAtIndex(ctx: JSContextRef?, `object`: JSObjectRef?, propertyIndex: UInt, value: JSValueRef?, exception: CValuesRef<JSValueRefVar>?): Unit {
    memScoped {
        return kniBridge48(ctx.rawValue, `object`.rawValue, propertyIndex, value.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSObjectGetPrivate(`object`: JSObjectRef?): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge49(`object`.rawValue))
}

fun JSObjectSetPrivate(`object`: JSObjectRef?, data: CValuesRef<*>?): Boolean {
    memScoped {
        return kniBridge50(`object`.rawValue, data?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSObjectIsFunction(ctx: JSContextRef?, `object`: JSObjectRef?): Boolean {
    return kniBridge51(ctx.rawValue, `object`.rawValue).toBoolean()
}

fun JSObjectCallAsFunction(ctx: JSContextRef?, `object`: JSObjectRef?, thisObject: JSObjectRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSValueRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge52(ctx.rawValue, `object`.rawValue, thisObject.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectIsConstructor(ctx: JSContextRef?, `object`: JSObjectRef?): Boolean {
    return kniBridge53(ctx.rawValue, `object`.rawValue).toBoolean()
}

fun JSObjectCallAsConstructor(ctx: JSContextRef?, `object`: JSObjectRef?, argumentCount: size_t, arguments: CValuesRef<JSValueRefVar>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge54(ctx.rawValue, `object`.rawValue, argumentCount, arguments?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectCopyPropertyNames(ctx: JSContextRef?, `object`: JSObjectRef?): JSPropertyNameArrayRef? {
    return interpretCPointer<OpaqueJSPropertyNameArray>(kniBridge55(ctx.rawValue, `object`.rawValue))
}

fun JSPropertyNameArrayRetain(array: JSPropertyNameArrayRef?): JSPropertyNameArrayRef? {
    return interpretCPointer<OpaqueJSPropertyNameArray>(kniBridge56(array.rawValue))
}

fun JSPropertyNameArrayRelease(array: JSPropertyNameArrayRef?): Unit {
    return kniBridge57(array.rawValue)
}

fun JSPropertyNameArrayGetCount(array: JSPropertyNameArrayRef?): size_t {
    return kniBridge58(array.rawValue)
}

fun JSPropertyNameArrayGetNameAtIndex(array: JSPropertyNameArrayRef?, index: size_t): JSStringRef? {
    return interpretCPointer<OpaqueJSString>(kniBridge59(array.rawValue, index))
}

fun JSPropertyNameAccumulatorAddName(accumulator: JSPropertyNameAccumulatorRef?, propertyName: JSStringRef?): Unit {
    return kniBridge60(accumulator.rawValue, propertyName.rawValue)
}

fun JSContextGroupCreate(): JSContextGroupRef? {
    return interpretCPointer<OpaqueJSContextGroup>(kniBridge61())
}

fun JSContextGroupRetain(group: JSContextGroupRef?): JSContextGroupRef? {
    return interpretCPointer<OpaqueJSContextGroup>(kniBridge62(group.rawValue))
}

fun JSContextGroupRelease(group: JSContextGroupRef?): Unit {
    return kniBridge63(group.rawValue)
}

fun JSGlobalContextCreate(globalObjectClass: JSClassRef?): JSGlobalContextRef? {
    return interpretCPointer<OpaqueJSContext>(kniBridge64(globalObjectClass.rawValue))
}

fun JSGlobalContextCreateInGroup(group: JSContextGroupRef?, globalObjectClass: JSClassRef?): JSGlobalContextRef? {
    return interpretCPointer<OpaqueJSContext>(kniBridge65(group.rawValue, globalObjectClass.rawValue))
}

fun JSGlobalContextRetain(ctx: JSGlobalContextRef?): JSGlobalContextRef? {
    return interpretCPointer<OpaqueJSContext>(kniBridge66(ctx.rawValue))
}

fun JSGlobalContextRelease(ctx: JSGlobalContextRef?): Unit {
    return kniBridge67(ctx.rawValue)
}

fun JSContextGetGlobalObject(ctx: JSContextRef?): JSObjectRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge68(ctx.rawValue))
}

fun JSContextGetGroup(ctx: JSContextRef?): JSContextGroupRef? {
    return interpretCPointer<OpaqueJSContextGroup>(kniBridge69(ctx.rawValue))
}

fun JSContextGetGlobalContext(ctx: JSContextRef?): JSGlobalContextRef? {
    return interpretCPointer<OpaqueJSContext>(kniBridge70(ctx.rawValue))
}

fun JSGlobalContextCopyName(ctx: JSGlobalContextRef?): JSStringRef? {
    return interpretCPointer<OpaqueJSString>(kniBridge71(ctx.rawValue))
}

fun JSGlobalContextSetName(ctx: JSGlobalContextRef?, name: JSStringRef?): Unit {
    return kniBridge72(ctx.rawValue, name.rawValue)
}

fun JSStringCreateWithCharacters(chars: CValuesRef<JSCharVar>?, numChars: size_t): JSStringRef? {
    memScoped {
        return interpretCPointer<OpaqueJSString>(kniBridge73(chars?.getPointer(memScope).rawValue, numChars))
    }
}

fun JSStringCreateWithUTF8CString(@CCall.CString string: String?): JSStringRef? {
    memScoped {
        return interpretCPointer<OpaqueJSString>(kniBridge74(string?.cstr?.getPointer(memScope).rawValue))
    }
}

fun JSStringRetain(string: JSStringRef?): JSStringRef? {
    return interpretCPointer<OpaqueJSString>(kniBridge75(string.rawValue))
}

fun JSStringRelease(string: JSStringRef?): Unit {
    return kniBridge76(string.rawValue)
}

fun JSStringGetLength(string: JSStringRef?): size_t {
    return kniBridge77(string.rawValue)
}

fun JSStringGetCharactersPtr(string: JSStringRef?): CPointer<JSCharVar>? {
    return interpretCPointer<JSCharVar>(kniBridge78(string.rawValue))
}

fun JSStringGetMaximumUTF8CStringSize(string: JSStringRef?): size_t {
    return kniBridge79(string.rawValue)
}

fun JSStringGetUTF8CString(string: JSStringRef?, buffer: CValuesRef<ByteVar>?, bufferSize: size_t): size_t {
    memScoped {
        return kniBridge80(string.rawValue, buffer?.getPointer(memScope).rawValue, bufferSize)
    }
}

fun JSStringIsEqual(a: JSStringRef?, b: JSStringRef?): Boolean {
    return kniBridge81(a.rawValue, b.rawValue).toBoolean()
}

fun JSStringIsEqualToUTF8CString(a: JSStringRef?, @CCall.CString b: String?): Boolean {
    memScoped {
        return kniBridge82(a.rawValue, b?.cstr?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun JSObjectMakeTypedArray(ctx: JSContextRef?, arrayType: JSTypedArrayType, length: size_t, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge83(ctx.rawValue, arrayType.value, length, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeTypedArrayWithBytesNoCopy(ctx: JSContextRef?, arrayType: JSTypedArrayType, bytes: CValuesRef<*>?, byteLength: size_t, bytesDeallocator: JSTypedArrayBytesDeallocator?, deallocatorContext: CValuesRef<*>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge84(ctx.rawValue, arrayType.value, bytes?.getPointer(memScope).rawValue, byteLength, bytesDeallocator.rawValue, deallocatorContext?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeTypedArrayWithArrayBuffer(ctx: JSContextRef?, arrayType: JSTypedArrayType, buffer: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge85(ctx.rawValue, arrayType.value, buffer.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeTypedArrayWithArrayBufferAndOffset(ctx: JSContextRef?, arrayType: JSTypedArrayType, buffer: JSObjectRef?, byteOffset: size_t, length: size_t, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge86(ctx.rawValue, arrayType.value, buffer.rawValue, byteOffset, length, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectGetTypedArrayBytesPtr(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge87(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectGetTypedArrayLength(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): size_t {
    memScoped {
        return kniBridge88(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSObjectGetTypedArrayByteLength(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): size_t {
    memScoped {
        return kniBridge89(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSObjectGetTypedArrayByteOffset(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): size_t {
    memScoped {
        return kniBridge90(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSObjectGetTypedArrayBuffer(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge91(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectMakeArrayBufferWithBytesNoCopy(ctx: JSContextRef?, bytes: CValuesRef<*>?, byteLength: size_t, bytesDeallocator: JSTypedArrayBytesDeallocator?, deallocatorContext: CValuesRef<*>?, exception: CValuesRef<JSValueRefVar>?): JSObjectRef? {
    memScoped {
        return interpretCPointer<OpaqueJSValue>(kniBridge92(ctx.rawValue, bytes?.getPointer(memScope).rawValue, byteLength, bytesDeallocator.rawValue, deallocatorContext?.getPointer(memScope).rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectGetArrayBufferBytesPtr(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge93(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue))
    }
}

fun JSObjectGetArrayBufferByteLength(ctx: JSContextRef?, `object`: JSObjectRef?, exception: CValuesRef<JSValueRefVar>?): size_t {
    memScoped {
        return kniBridge94(ctx.rawValue, `object`.rawValue, exception?.getPointer(memScope).rawValue)
    }
}

fun JSStringCreateWithCFString(string: CFStringRef?): JSStringRef? {
    return interpretCPointer<OpaqueJSString>(kniBridge95(string.rawValue))
}

fun JSStringCopyCFString(alloc: CFAllocatorRef?, string: JSStringRef?): CFStringRef? {
    return interpretCPointer<__CFString>(kniBridge96(alloc.rawValue, string.rawValue))
}

@ExternalObjCClass("kniprot_platform_JavaScriptCore0") interface JSExportProtocolMeta : ObjCObjectMeta {
}

@ExternalObjCClass("kniprot_platform_JavaScriptCore0") interface JSExportProtocol : ObjCObject {
}

@ExternalObjCClass open class JSContextMeta : NSObjectMeta {
    
    @ObjCMethod("currentContext", "objcKniBridge1")
    external open fun currentContext(): JSContext?
    
    @ObjCMethod("currentCallee", "objcKniBridge2")
    external open fun currentCallee(): JSValue?
    
    @ObjCMethod("currentThis", "objcKniBridge3")
    external open fun currentThis(): JSValue?
    
    @ObjCMethod("currentArguments", "objcKniBridge4")
    external open fun currentArguments(): List<*>?
    
    @ObjCMethod("new", "objcKniBridge5")
    @CCall.ReturnsRetained
    external override fun new(): JSContext?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge6")
    @CCall.ReturnsRetained
    external override fun allocWithZone(zone: CPointer<_NSZone>?): JSContext?
    
    @ObjCMethod("alloc", "objcKniBridge7")
    @CCall.ReturnsRetained
    external override fun alloc(): JSContext?
    
    protected constructor() {}
}

@ExternalObjCClass open class JSContext : NSObject {
    companion object : JSContextMeta(), ObjCClassOf<JSContext> {}
    
    val globalObject: JSValue?
        get() = objcKniBridge12(nativeNullPtr, this.objcPtr())
    
    var exception: JSValue?
        get() = objcKniBridge13(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge14(nativeNullPtr, this.objcPtr(), value)
    
    var exceptionHandler: ((JSContext?, JSValue?) -> Unit)?
        get() = objcKniBridge16(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge18(nativeNullPtr, this.objcPtr(), value)
    
    val virtualMachine: JSVirtualMachine?
        get() = objcKniBridge19(nativeNullPtr, this.objcPtr())
    
    var name: String?
        get() = objcKniBridge20(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge21(nativeNullPtr, this.objcPtr(), value)
    
    @Deprecated("Use constructor instead", ReplaceWith("JSContext()"), DeprecationLevel.ERROR)
    @ObjCMethod("init", "objcKniBridge8")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external override fun init(): JSContext?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @Deprecated("Use constructor instead", ReplaceWith("JSContext(virtualMachine)"), DeprecationLevel.ERROR)
    @ObjCMethod("initWithVirtualMachine:", "objcKniBridge9")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external open fun initWithVirtualMachine(virtualMachine: JSVirtualMachine?): JSContext?
    
    @ObjCConstructor("initWithVirtualMachine:", true)
    constructor(virtualMachine: JSVirtualMachine?) {}
    
    @ObjCMethod("evaluateScript:", "objcKniBridge10")
    external open fun evaluateScript(script: String?): JSValue?
    
    @ObjCMethod("evaluateScript:withSourceURL:", "objcKniBridge11")
    external open fun evaluateScript(script: String?, withSourceURL: NSURL?): JSValue?
    
    @ObjCMethod("globalObject", "objcKniBridge12")
    external open fun globalObject(): JSValue?
    
    @ObjCMethod("exception", "objcKniBridge13")
    external open fun exception(): JSValue?
    
    @ObjCMethod("setException:", "objcKniBridge14")
    external open fun setException(exception: JSValue?): Unit
    
    @ObjCMethod("exceptionHandler", "objcKniBridge16")
    external open fun exceptionHandler(): ((JSContext?, JSValue?) -> Unit)?
    
    @ObjCMethod("setExceptionHandler:", "objcKniBridge18")
    external open fun setExceptionHandler(exceptionHandler: ((JSContext?, JSValue?) -> Unit)?): Unit
    
    @ObjCMethod("virtualMachine", "objcKniBridge19")
    external open fun virtualMachine(): JSVirtualMachine?
    
    @ObjCMethod("name", "objcKniBridge20")
    external open fun name(): String?
    
    @ObjCMethod("setName:", "objcKniBridge21")
    external open fun setName(name: String?): Unit
}

@ExternalObjCClass open class JSVirtualMachineMeta : NSObjectMeta {
    
    @ObjCMethod("new", "objcKniBridge22")
    @CCall.ReturnsRetained
    external override fun new(): JSVirtualMachine?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge23")
    @CCall.ReturnsRetained
    external override fun allocWithZone(zone: CPointer<_NSZone>?): JSVirtualMachine?
    
    @ObjCMethod("alloc", "objcKniBridge24")
    @CCall.ReturnsRetained
    external override fun alloc(): JSVirtualMachine?
    
    protected constructor() {}
}

@ExternalObjCClass open class JSVirtualMachine : NSObject {
    companion object : JSVirtualMachineMeta(), ObjCClassOf<JSVirtualMachine> {}
    
    @Deprecated("Use constructor instead", ReplaceWith("JSVirtualMachine()"), DeprecationLevel.ERROR)
    @ObjCMethod("init", "objcKniBridge25")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external override fun init(): JSVirtualMachine?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("addManagedReference:withOwner:", "objcKniBridge26")
    external open fun addManagedReference(`object`: Any?, withOwner: Any?): Unit
    
    @ObjCMethod("removeManagedReference:withOwner:", "objcKniBridge27")
    external open fun removeManagedReference(`object`: Any?, withOwner: Any?): Unit
}

@ExternalObjCClass open class JSValueMeta : NSObjectMeta {
    
    @ObjCMethod("valueWithObject:inContext:", "objcKniBridge28")
    external open fun valueWithObject(value: Any?, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithBool:inContext:", "objcKniBridge29")
    external open fun valueWithBool(value: Boolean, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithDouble:inContext:", "objcKniBridge30")
    external open fun valueWithDouble(value: Double, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithInt32:inContext:", "objcKniBridge31")
    external open fun valueWithInt32(value: int32_t, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithUInt32:inContext:", "objcKniBridge32")
    external open fun valueWithUInt32(value: uint32_t, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithNewObjectInContext:", "objcKniBridge33")
    external open fun valueWithNewObjectInContext(context: JSContext?): JSValue?
    
    @ObjCMethod("valueWithNewArrayInContext:", "objcKniBridge34")
    external open fun valueWithNewArrayInContext(context: JSContext?): JSValue?
    
    @ObjCMethod("valueWithNewRegularExpressionFromPattern:flags:inContext:", "objcKniBridge35")
    external open fun valueWithNewRegularExpressionFromPattern(pattern: String?, flags: String?, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithNewErrorFromMessage:inContext:", "objcKniBridge36")
    external open fun valueWithNewErrorFromMessage(message: String?, inContext: JSContext?): JSValue?
    
    @ObjCMethod("valueWithNullInContext:", "objcKniBridge37")
    external open fun valueWithNullInContext(context: JSContext?): JSValue?
    
    @ObjCMethod("valueWithUndefinedInContext:", "objcKniBridge38")
    external open fun valueWithUndefinedInContext(context: JSContext?): JSValue?
    
    @ObjCMethod("new", "objcKniBridge39")
    @CCall.ReturnsRetained
    external override fun new(): JSValue?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge40")
    @CCall.ReturnsRetained
    external override fun allocWithZone(zone: CPointer<_NSZone>?): JSValue?
    
    @ObjCMethod("alloc", "objcKniBridge41")
    @CCall.ReturnsRetained
    external override fun alloc(): JSValue?
    
    protected constructor() {}
}

@ExternalObjCClass open class JSValue : NSObject {
    companion object : JSValueMeta(), ObjCClassOf<JSValue> {}
    
    val context: JSContext?
        get() = objcKniBridge66(nativeNullPtr, this.objcPtr())
    
    val isUndefined: Boolean
        get() = objcKniBridge67(nativeNullPtr, this.objcPtr())
    
    val isNull: Boolean
        get() = objcKniBridge68(nativeNullPtr, this.objcPtr())
    
    val isBoolean: Boolean
        get() = objcKniBridge69(nativeNullPtr, this.objcPtr())
    
    val isNumber: Boolean
        get() = objcKniBridge70(nativeNullPtr, this.objcPtr())
    
    val isString: Boolean
        get() = objcKniBridge71(nativeNullPtr, this.objcPtr())
    
    val isObject: Boolean
        get() = objcKniBridge72(nativeNullPtr, this.objcPtr())
    
    val isArray: Boolean
        get() = objcKniBridge73(nativeNullPtr, this.objcPtr())
    
    val isDate: Boolean
        get() = objcKniBridge74(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("toObject", "objcKniBridge42")
    external open fun toObject(): Any?
    
    @ObjCMethod("toObjectOfClass:", "objcKniBridge43")
    external open fun toObjectOfClass(expectedClass: ObjCClass?): Any?
    
    @ObjCMethod("toBool", "objcKniBridge44")
    external open fun toBool(): Boolean
    
    @ObjCMethod("toDouble", "objcKniBridge45")
    external open fun toDouble(): Double
    
    @ObjCMethod("toInt32", "objcKniBridge46")
    external open fun toInt32(): int32_t
    
    @ObjCMethod("toUInt32", "objcKniBridge47")
    external open fun toUInt32(): uint32_t
    
    @ObjCMethod("toNumber", "objcKniBridge48")
    external open fun toNumber(): NSNumber?
    
    @ObjCMethod("toString", "objcKniBridge49")
    external open override fun toString(): String?
    
    @ObjCMethod("toDate", "objcKniBridge50")
    external open fun toDate(): NSDate?
    
    @ObjCMethod("toArray", "objcKniBridge51")
    external open fun toArray(): List<*>?
    
    @ObjCMethod("toDictionary", "objcKniBridge52")
    external open fun toDictionary(): Map<Any?, *>?
    
    @ObjCMethod("valueForProperty:", "objcKniBridge53")
    external open fun valueForProperty(property: String?): JSValue?
    
    @ObjCMethod("setValue:forProperty:", "objcKniBridge54")
    external open fun setValue(value: Any?, forProperty: String?): Unit
    
    @ObjCMethod("deleteProperty:", "objcKniBridge55")
    external open fun deleteProperty(property: String?): Boolean
    
    @ObjCMethod("hasProperty:", "objcKniBridge56")
    external open fun hasProperty(property: String?): Boolean
    
    @ObjCMethod("defineProperty:descriptor:", "objcKniBridge57")
    external open fun defineProperty(property: String?, descriptor: Any?): Unit
    
    @ObjCMethod("valueAtIndex:", "objcKniBridge58")
    external open fun valueAtIndex(index: NSUInteger): JSValue?
    
    @ObjCMethod("setValue:atIndex:", "objcKniBridge59")
    external open fun setValue(value: Any?, atIndex: NSUInteger): Unit
    
    @ObjCMethod("isEqualToObject:", "objcKniBridge60")
    external open fun isEqualToObject(value: Any?): Boolean
    
    @ObjCMethod("isEqualWithTypeCoercionToObject:", "objcKniBridge61")
    external open fun isEqualWithTypeCoercionToObject(value: Any?): Boolean
    
    @ObjCMethod("isInstanceOf:", "objcKniBridge62")
    external open fun isInstanceOf(value: Any?): Boolean
    
    @ObjCMethod("callWithArguments:", "objcKniBridge63")
    external open fun callWithArguments(arguments: List<*>?): JSValue?
    
    @ObjCMethod("constructWithArguments:", "objcKniBridge64")
    external open fun constructWithArguments(arguments: List<*>?): JSValue?
    
    @ObjCMethod("invokeMethod:withArguments:", "objcKniBridge65")
    external open fun invokeMethod(method: String?, withArguments: List<*>?): JSValue?
    
    @ObjCMethod("context", "objcKniBridge66")
    external open fun context(): JSContext?
    
    @ObjCMethod("isUndefined", "objcKniBridge67")
    external open fun isUndefined(): Boolean
    
    @ObjCMethod("isNull", "objcKniBridge68")
    external open fun isNull(): Boolean
    
    @ObjCMethod("isBoolean", "objcKniBridge69")
    external open fun isBoolean(): Boolean
    
    @ObjCMethod("isNumber", "objcKniBridge70")
    external open fun isNumber(): Boolean
    
    @ObjCMethod("isString", "objcKniBridge71")
    external open fun isString(): Boolean
    
    @ObjCMethod("isObject", "objcKniBridge72")
    external open fun isObject(): Boolean
    
    @ObjCMethod("isArray", "objcKniBridge73")
    external open fun isArray(): Boolean
    
    @ObjCMethod("isDate", "objcKniBridge74")
    external open fun isDate(): Boolean
    
    @Deprecated("Use constructor instead", ReplaceWith("JSValue()"), DeprecationLevel.ERROR)
    @ObjCMethod("init", "objcKniBridge75")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external override fun init(): JSValue?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

@ExternalObjCClass open class JSManagedValueMeta : NSObjectMeta {
    
    @ObjCMethod("managedValueWithValue:", "objcKniBridge76")
    external open fun managedValueWithValue(value: JSValue?): JSManagedValue?
    
    @ObjCMethod("managedValueWithValue:andOwner:", "objcKniBridge77")
    external open fun managedValueWithValue(value: JSValue?, andOwner: Any?): JSManagedValue?
    
    @ObjCMethod("new", "objcKniBridge78")
    @CCall.ReturnsRetained
    external override fun new(): JSManagedValue?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge79")
    @CCall.ReturnsRetained
    external override fun allocWithZone(zone: CPointer<_NSZone>?): JSManagedValue?
    
    @ObjCMethod("alloc", "objcKniBridge80")
    @CCall.ReturnsRetained
    external override fun alloc(): JSManagedValue?
    
    protected constructor() {}
}

@ExternalObjCClass open class JSManagedValue : NSObject {
    companion object : JSManagedValueMeta(), ObjCClassOf<JSManagedValue> {}
    
    val value: JSValue?
        get() = objcKniBridge82(nativeNullPtr, this.objcPtr())
    
    @Deprecated("Use constructor instead", ReplaceWith("JSManagedValue(value)"), DeprecationLevel.ERROR)
    @ObjCMethod("initWithValue:", "objcKniBridge81")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external open fun initWithValue(value: JSValue?): JSManagedValue?
    
    @ObjCConstructor("initWithValue:", true)
    constructor(value: JSValue?) {}
    
    @ObjCMethod("value", "objcKniBridge82")
    external open fun value(): JSValue?
    
    @Deprecated("Use constructor instead", ReplaceWith("JSManagedValue()"), DeprecationLevel.ERROR)
    @ObjCMethod("init", "objcKniBridge83")
    @CCall.ConsumesReceiver
    @CCall.ReturnsRetained
    external override fun init(): JSManagedValue?
    
    @ObjCConstructor("init", true)
    constructor() {}
}

// @interface JSContext (SubscriptSupport)

@ObjCMethod("objectForKeyedSubscript:", "objcKniBridge84")
external fun JSContext.objectForKeyedSubscript(key: Any?): JSValue?

@ObjCMethod("setObject:forKeyedSubscript:", "objcKniBridge85")
external fun JSContext.setObject(`object`: Any?, forKeyedSubscript: NSObject?): Unit
// @end; // JSContext (SubscriptSupport)

// @interface JSContext (JSContextRefSupport)

val JSContext.JSGlobalContextRef: JSGlobalContextRef?
    get() = objcKniBridge87(nativeNullPtr, this.objcPtr())

@ObjCMethod("contextWithJSGlobalContextRef:", "objcKniBridge86")
external fun JSContextMeta.contextWithJSGlobalContextRef(jsGlobalContextRef: JSGlobalContextRef?): JSContext?

@ObjCMethod("JSGlobalContextRef", "objcKniBridge87")
external fun JSContext.JSGlobalContextRef(): JSGlobalContextRef?
// @end; // JSContext (JSContextRefSupport)

// @interface JSValue (StructSupport)

@ObjCMethod("valueWithPoint:inContext:", "objcKniBridge88")
external fun JSValueMeta.valueWithPoint(point: CValue<CGPoint>, inContext: JSContext?): JSValue?

@ObjCMethod("valueWithRange:inContext:", "objcKniBridge89")
external fun JSValueMeta.valueWithRange(range: CValue<NSRange>, inContext: JSContext?): JSValue?

@ObjCMethod("valueWithRect:inContext:", "objcKniBridge90")
external fun JSValueMeta.valueWithRect(rect: CValue<CGRect>, inContext: JSContext?): JSValue?

@ObjCMethod("valueWithSize:inContext:", "objcKniBridge91")
external fun JSValueMeta.valueWithSize(size: CValue<CGSize>, inContext: JSContext?): JSValue?

@ObjCMethod("toPoint", "objcKniBridge92")
external fun JSValue.toPoint(): CValue<CGPoint>

@ObjCMethod("toRange", "objcKniBridge93")
external fun JSValue.toRange(): CValue<NSRange>

@ObjCMethod("toRect", "objcKniBridge94")
external fun JSValue.toRect(): CValue<CGRect>

@ObjCMethod("toSize", "objcKniBridge95")
external fun JSValue.toSize(): CValue<CGSize>
// @end; // JSValue (StructSupport)

// @interface JSValue (SubscriptSupport)

@ObjCMethod("objectForKeyedSubscript:", "objcKniBridge96")
external fun JSValue.objectForKeyedSubscript(key: Any?): JSValue?

@ObjCMethod("objectAtIndexedSubscript:", "objcKniBridge97")
external fun JSValue.objectAtIndexedSubscript(index: NSUInteger): JSValue?

@ObjCMethod("setObject:forKeyedSubscript:", "objcKniBridge98")
external fun JSValue.setObject(`object`: Any?, forKeyedSubscript: NSObject?): Unit

@ObjCMethod("setObject:atIndexedSubscript:", "objcKniBridge99")
external fun JSValue.setObject(`object`: Any?, atIndexedSubscript: NSUInteger): Unit
// @end; // JSValue (SubscriptSupport)

// @interface JSValue (JSValueRefSupport)

val JSValue.JSValueRef: JSValueRef?
    get() = objcKniBridge101(nativeNullPtr, this.objcPtr())

@ObjCMethod("valueWithJSValueRef:inContext:", "objcKniBridge100")
external fun JSValueMeta.valueWithJSValueRef(value: JSValueRef?, inContext: JSContext?): JSValue?

@ObjCMethod("JSValueRef", "objcKniBridge101")
external fun JSValue.JSValueRef(): JSValueRef?
// @end; // JSValue (JSValueRefSupport)

const val JSC_OBJC_API_ENABLED: Int = 1

val kJSClassDefinitionEmpty: JSClassDefinition
    get() = interpretPointed<JSClassDefinition>(kniBridge202())

val JSPropertyDescriptorWritableKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge203())

val JSPropertyDescriptorEnumerableKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge204())

val JSPropertyDescriptorConfigurableKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge205())

val JSPropertyDescriptorValueKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge206())

val JSPropertyDescriptorGetKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge207())

val JSPropertyDescriptorSetKey: String?
    get() = interpretObjCPointerOrNull<String>(kniBridge208())








@CStruct("struct { void* p0; void* p1; void* p2; unsigned int p3; }")
class JSStaticValue(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var getProperty: JSObjectGetPropertyCallback?
        get() = memberAt<JSObjectGetPropertyCallbackVar>(8).value
        set(value) { memberAt<JSObjectGetPropertyCallbackVar>(8).value = value }
    
    var setProperty: JSObjectSetPropertyCallback?
        get() = memberAt<JSObjectSetPropertyCallbackVar>(16).value
        set(value) { memberAt<JSObjectSetPropertyCallbackVar>(16).value = value }
    
    var attributes: JSPropertyAttributes
        get() = memberAt<JSPropertyAttributesVar>(24).value
        set(value) { memberAt<JSPropertyAttributesVar>(24).value = value }
    
}

@CStruct("struct { void* p0; void* p1; unsigned int p2; }")
class JSStaticFunction(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var callAsFunction: JSObjectCallAsFunctionCallback?
        get() = memberAt<JSObjectCallAsFunctionCallbackVar>(8).value
        set(value) { memberAt<JSObjectCallAsFunctionCallbackVar>(8).value = value }
    
    var attributes: JSPropertyAttributes
        get() = memberAt<JSPropertyAttributesVar>(16).value
        set(value) { memberAt<JSPropertyAttributesVar>(16).value = value }
    
}

@CStruct("struct { int p0; unsigned int p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; void* p11; void* p12; void* p13; void* p14; void* p15; void* p16; }")
class JSClassDefinition(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var version: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var attributes: JSClassAttributes
        get() = memberAt<JSClassAttributesVar>(4).value
        set(value) { memberAt<JSClassAttributesVar>(4).value = value }
    
    var className: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var parentClass: JSClassRef?
        get() = memberAt<JSClassRefVar>(16).value
        set(value) { memberAt<JSClassRefVar>(16).value = value }
    
    var staticValues: CPointer<JSStaticValue>?
        get() = memberAt<CPointerVar<JSStaticValue>>(24).value
        set(value) { memberAt<CPointerVar<JSStaticValue>>(24).value = value }
    
    var staticFunctions: CPointer<JSStaticFunction>?
        get() = memberAt<CPointerVar<JSStaticFunction>>(32).value
        set(value) { memberAt<CPointerVar<JSStaticFunction>>(32).value = value }
    
    var initialize: JSObjectInitializeCallback?
        get() = memberAt<JSObjectInitializeCallbackVar>(40).value
        set(value) { memberAt<JSObjectInitializeCallbackVar>(40).value = value }
    
    var finalize: JSObjectFinalizeCallback?
        get() = memberAt<JSObjectFinalizeCallbackVar>(48).value
        set(value) { memberAt<JSObjectFinalizeCallbackVar>(48).value = value }
    
    var hasProperty: JSObjectHasPropertyCallback?
        get() = memberAt<JSObjectHasPropertyCallbackVar>(56).value
        set(value) { memberAt<JSObjectHasPropertyCallbackVar>(56).value = value }
    
    var getProperty: JSObjectGetPropertyCallback?
        get() = memberAt<JSObjectGetPropertyCallbackVar>(64).value
        set(value) { memberAt<JSObjectGetPropertyCallbackVar>(64).value = value }
    
    var setProperty: JSObjectSetPropertyCallback?
        get() = memberAt<JSObjectSetPropertyCallbackVar>(72).value
        set(value) { memberAt<JSObjectSetPropertyCallbackVar>(72).value = value }
    
    var deleteProperty: JSObjectDeletePropertyCallback?
        get() = memberAt<JSObjectDeletePropertyCallbackVar>(80).value
        set(value) { memberAt<JSObjectDeletePropertyCallbackVar>(80).value = value }
    
    var getPropertyNames: JSObjectGetPropertyNamesCallback?
        get() = memberAt<JSObjectGetPropertyNamesCallbackVar>(88).value
        set(value) { memberAt<JSObjectGetPropertyNamesCallbackVar>(88).value = value }
    
    var callAsFunction: JSObjectCallAsFunctionCallback?
        get() = memberAt<JSObjectCallAsFunctionCallbackVar>(96).value
        set(value) { memberAt<JSObjectCallAsFunctionCallbackVar>(96).value = value }
    
    var callAsConstructor: JSObjectCallAsConstructorCallback?
        get() = memberAt<JSObjectCallAsConstructorCallbackVar>(104).value
        set(value) { memberAt<JSObjectCallAsConstructorCallbackVar>(104).value = value }
    
    var hasInstance: JSObjectHasInstanceCallback?
        get() = memberAt<JSObjectHasInstanceCallbackVar>(112).value
        set(value) { memberAt<JSObjectHasInstanceCallbackVar>(112).value = value }
    
    var convertToType: JSObjectConvertToTypeCallback?
        get() = memberAt<JSObjectConvertToTypeCallbackVar>(120).value
        set(value) { memberAt<JSObjectConvertToTypeCallbackVar>(120).value = value }
    
}

enum class JSType(override val value: UInt) : CEnum {
    kJSTypeUndefined(0u),
    kJSTypeNull(1u),
    kJSTypeBoolean(2u),
    kJSTypeNumber(3u),
    kJSTypeString(4u),
    kJSTypeObject(5u),
    ;
    
    companion object {
        fun byValue(value: UInt) = JSType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: JSType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class JSTypedArrayType(override val value: UInt) : CEnum {
    kJSTypedArrayTypeInt8Array(0u),
    kJSTypedArrayTypeInt16Array(1u),
    kJSTypedArrayTypeInt32Array(2u),
    kJSTypedArrayTypeUint8Array(3u),
    kJSTypedArrayTypeUint8ClampedArray(4u),
    kJSTypedArrayTypeUint16Array(5u),
    kJSTypedArrayTypeUint32Array(6u),
    kJSTypedArrayTypeFloat32Array(7u),
    kJSTypedArrayTypeFloat64Array(8u),
    kJSTypedArrayTypeArrayBuffer(9u),
    kJSTypedArrayTypeNone(10u),
    ;
    
    companion object {
        fun byValue(value: UInt) = JSTypedArrayType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: JSTypedArrayType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

// enum (anonymous at /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator12.1.sdk/System/Library/Frameworks/JavaScriptCore.framework/Headers/JSObjectRef.h:50:1):
val kJSPropertyAttributeNone: UInt get() = 0u
val kJSPropertyAttributeReadOnly: UInt get() = 2u
val kJSPropertyAttributeDontEnum: UInt get() = 4u
val kJSPropertyAttributeDontDelete: UInt get() = 8u

// enum (anonymous at /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator12.1.sdk/System/Library/Frameworks/JavaScriptCore.framework/Headers/JSObjectRef.h:68:1):
val kJSClassAttributeNone: UInt get() = 0u
val kJSClassAttributeNoAutomaticPrototype: UInt get() = 2u

typealias JSContextGroupRefVar = CPointerVarOf<JSContextGroupRef>
typealias JSContextGroupRef = CPointer<OpaqueJSContextGroup>

typealias JSContextRefVar = CPointerVarOf<JSContextRef>
typealias JSContextRef = CPointer<OpaqueJSContext>

typealias JSGlobalContextRefVar = CPointerVarOf<JSGlobalContextRef>
typealias JSGlobalContextRef = CPointer<OpaqueJSContext>

typealias JSStringRefVar = CPointerVarOf<JSStringRef>
typealias JSStringRef = CPointer<OpaqueJSString>

typealias JSClassRefVar = CPointerVarOf<JSClassRef>
typealias JSClassRef = CPointer<OpaqueJSClass>

typealias JSPropertyNameArrayRefVar = CPointerVarOf<JSPropertyNameArrayRef>
typealias JSPropertyNameArrayRef = CPointer<OpaqueJSPropertyNameArray>

typealias JSPropertyNameAccumulatorRefVar = CPointerVarOf<JSPropertyNameAccumulatorRef>
typealias JSPropertyNameAccumulatorRef = CPointer<OpaqueJSPropertyNameAccumulator>

typealias JSTypedArrayBytesDeallocatorVar = CPointerVarOf<JSTypedArrayBytesDeallocator>
typealias JSTypedArrayBytesDeallocator = CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>

typealias JSValueRefVar = CPointerVarOf<JSValueRef>
typealias JSValueRef = CPointer<OpaqueJSValue>

typealias JSObjectRefVar = CPointerVarOf<JSObjectRef>
typealias JSObjectRef = CPointer<OpaqueJSValue>

typealias JSPropertyAttributesVar = UIntVarOf<JSPropertyAttributes>
typealias JSPropertyAttributes = UInt

typealias JSClassAttributesVar = UIntVarOf<JSClassAttributes>
typealias JSClassAttributes = UInt

typealias JSObjectInitializeCallbackVar = CPointerVarOf<JSObjectInitializeCallback>
typealias JSObjectInitializeCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?) -> Unit>>

typealias JSObjectFinalizeCallbackVar = CPointerVarOf<JSObjectFinalizeCallback>
typealias JSObjectFinalizeCallback = CPointer<CFunction<(JSObjectRef?) -> Unit>>

typealias JSObjectHasPropertyCallbackVar = CPointerVarOf<JSObjectHasPropertyCallback>
typealias JSObjectHasPropertyCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSStringRef?) -> Boolean>>

typealias JSObjectGetPropertyCallbackVar = CPointerVarOf<JSObjectGetPropertyCallback>
typealias JSObjectGetPropertyCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSStringRef?, CPointer<JSValueRefVar>?) -> JSValueRef?>>

typealias JSObjectSetPropertyCallbackVar = CPointerVarOf<JSObjectSetPropertyCallback>
typealias JSObjectSetPropertyCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSStringRef?, JSValueRef?, CPointer<JSValueRefVar>?) -> Boolean>>

typealias JSObjectDeletePropertyCallbackVar = CPointerVarOf<JSObjectDeletePropertyCallback>
typealias JSObjectDeletePropertyCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSStringRef?, CPointer<JSValueRefVar>?) -> Boolean>>

typealias JSObjectGetPropertyNamesCallbackVar = CPointerVarOf<JSObjectGetPropertyNamesCallback>
typealias JSObjectGetPropertyNamesCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSPropertyNameAccumulatorRef?) -> Unit>>

typealias JSObjectCallAsFunctionCallbackVar = CPointerVarOf<JSObjectCallAsFunctionCallback>
typealias JSObjectCallAsFunctionCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSObjectRef?, size_t, CArrayPointer<JSValueRefVar>?, CPointer<JSValueRefVar>?) -> JSValueRef?>>

typealias JSObjectCallAsConstructorCallbackVar = CPointerVarOf<JSObjectCallAsConstructorCallback>
typealias JSObjectCallAsConstructorCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, size_t, CArrayPointer<JSValueRefVar>?, CPointer<JSValueRefVar>?) -> JSObjectRef?>>

typealias JSObjectHasInstanceCallbackVar = CPointerVarOf<JSObjectHasInstanceCallback>
typealias JSObjectHasInstanceCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSValueRef?, CPointer<JSValueRefVar>?) -> Boolean>>

typealias JSObjectConvertToTypeCallbackVar = CPointerVarOf<JSObjectConvertToTypeCallback>
typealias JSObjectConvertToTypeCallback = CPointer<CFunction<(JSContextRef?, JSObjectRef?, JSType, CPointer<JSValueRefVar>?) -> JSValueRef?>>

typealias JSCharVar = UShortVarOf<JSChar>
typealias JSChar = UShort

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("currentContext", "@16@0:8")
internal fun objcKniBridge1(kniSC: NativePtr, kniR: NativePtr): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge97(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("currentCallee", "@16@0:8")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge98(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("currentThis", "@16@0:8")
internal fun objcKniBridge3(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge99(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("currentArguments", "@16@0:8")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr): List<*>? {
    return interpretObjCPointerOrNull<List<*>>(kniBridge100(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8")
internal fun objcKniBridge5(kniSC: NativePtr, kniR: NativePtr): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge101(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16")
internal fun objcKniBridge6(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge102(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8")
internal fun objcKniBridge7(kniSC: NativePtr, kniR: NativePtr): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge103(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8")
internal fun objcKniBridge8(kniSC: NativePtr, kniR: NativePtr): JSContext? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSContext>(kniBridge104(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithVirtualMachine:", "@24@0:8@16")
internal fun objcKniBridge9(kniSC: NativePtr, kniR: NativePtr, virtualMachine: JSVirtualMachine?): JSContext? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSContext>(kniBridge105(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, virtualMachine.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("evaluateScript:", "@24@0:8@16")
internal fun objcKniBridge10(kniSC: NativePtr, kniR: NativePtr, script: String?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge106(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, script.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("evaluateScript:withSourceURL:", "@32@0:8@16@24")
internal fun objcKniBridge11(kniSC: NativePtr, kniR: NativePtr, script: String?, withSourceURL: NSURL?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge107(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, script.objcPtr(), withSourceURL.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("globalObject", "@16@0:8")
internal fun objcKniBridge12(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge108(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("exception", "@16@0:8")
internal fun objcKniBridge13(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge109(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setException:", "v24@0:8@16")
internal fun objcKniBridge14(kniSC: NativePtr, kniR: NativePtr, exception: JSValue?): Unit {
    return kniBridge110(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, exception.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("exceptionHandler", "@\u003F16@0:8", "knimi_platform_JavaScriptCore15")
internal fun objcKniBridge16(kniSC: NativePtr, kniR: NativePtr): ((JSContext?, JSValue?) -> Unit)? {
    return kniBridge111(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: JSContext?, p1: JSValue?): Unit {
return kniBridge112(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setExceptionHandler:", "v24@0:8@\u003F16", "knimi_platform_JavaScriptCore17")
internal fun objcKniBridge18(kniSC: NativePtr, kniR: NativePtr, exceptionHandler: ((JSContext?, JSValue?) -> Unit)?): Unit {
    return kniBridge115(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(exceptionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("virtualMachine", "@16@0:8")
internal fun objcKniBridge19(kniSC: NativePtr, kniR: NativePtr): JSVirtualMachine? {
    return interpretObjCPointerOrNull<JSVirtualMachine>(kniBridge119(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("name", "@16@0:8")
internal fun objcKniBridge20(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge120(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setName:", "v24@0:8@16")
internal fun objcKniBridge21(kniSC: NativePtr, kniR: NativePtr, name: String?): Unit {
    return kniBridge121(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, name.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8")
internal fun objcKniBridge22(kniSC: NativePtr, kniR: NativePtr): JSVirtualMachine? {
    return interpretObjCPointerOrNull<JSVirtualMachine>(kniBridge122(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16")
internal fun objcKniBridge23(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): JSVirtualMachine? {
    return interpretObjCPointerOrNull<JSVirtualMachine>(kniBridge123(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8")
internal fun objcKniBridge24(kniSC: NativePtr, kniR: NativePtr): JSVirtualMachine? {
    return interpretObjCPointerOrNull<JSVirtualMachine>(kniBridge124(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8")
internal fun objcKniBridge25(kniSC: NativePtr, kniR: NativePtr): JSVirtualMachine? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSVirtualMachine>(kniBridge125(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("addManagedReference:withOwner:", "v32@0:8@16@24")
internal fun objcKniBridge26(kniSC: NativePtr, kniR: NativePtr, `object`: Any?, withOwner: Any?): Unit {
    return kniBridge126(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr(), withOwner.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("removeManagedReference:withOwner:", "v32@0:8@16@24")
internal fun objcKniBridge27(kniSC: NativePtr, kniR: NativePtr, `object`: Any?, withOwner: Any?): Unit {
    return kniBridge127(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr(), withOwner.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithObject:inContext:", "@32@0:8@16@24")
internal fun objcKniBridge28(kniSC: NativePtr, kniR: NativePtr, value: Any?, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge128(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithBool:inContext:", "@28@0:8B16@20")
internal fun objcKniBridge29(kniSC: NativePtr, kniR: NativePtr, value: Boolean, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge129(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.toByte(), inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithDouble:inContext:", "@32@0:8d16@24")
internal fun objcKniBridge30(kniSC: NativePtr, kniR: NativePtr, value: Double, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge130(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value, inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithInt32:inContext:", "@28@0:8i16@20")
internal fun objcKniBridge31(kniSC: NativePtr, kniR: NativePtr, value: int32_t, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge131(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value, inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithUInt32:inContext:", "@28@0:8I16@20")
internal fun objcKniBridge32(kniSC: NativePtr, kniR: NativePtr, value: uint32_t, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge132(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value, inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithNewObjectInContext:", "@24@0:8@16")
internal fun objcKniBridge33(kniSC: NativePtr, kniR: NativePtr, context: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge133(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, context.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithNewArrayInContext:", "@24@0:8@16")
internal fun objcKniBridge34(kniSC: NativePtr, kniR: NativePtr, context: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge134(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, context.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithNewRegularExpressionFromPattern:flags:inContext:", "@40@0:8@16@24@32")
internal fun objcKniBridge35(kniSC: NativePtr, kniR: NativePtr, pattern: String?, flags: String?, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge135(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pattern.objcPtr(), flags.objcPtr(), inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithNewErrorFromMessage:inContext:", "@32@0:8@16@24")
internal fun objcKniBridge36(kniSC: NativePtr, kniR: NativePtr, message: String?, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge136(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, message.objcPtr(), inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithNullInContext:", "@24@0:8@16")
internal fun objcKniBridge37(kniSC: NativePtr, kniR: NativePtr, context: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge137(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, context.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithUndefinedInContext:", "@24@0:8@16")
internal fun objcKniBridge38(kniSC: NativePtr, kniR: NativePtr, context: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge138(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, context.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8")
internal fun objcKniBridge39(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge139(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16")
internal fun objcKniBridge40(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge140(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8")
internal fun objcKniBridge41(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge141(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toObject", "@16@0:8")
internal fun objcKniBridge42(kniSC: NativePtr, kniR: NativePtr): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge142(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toObjectOfClass:", "@24@0:8#16")
internal fun objcKniBridge43(kniSC: NativePtr, kniR: NativePtr, expectedClass: ObjCClass?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge143(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, expectedClass.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toBool", "B16@0:8")
internal fun objcKniBridge44(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge144(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toDouble", "d16@0:8")
internal fun objcKniBridge45(kniSC: NativePtr, kniR: NativePtr): Double {
    return kniBridge145(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toInt32", "i16@0:8")
internal fun objcKniBridge46(kniSC: NativePtr, kniR: NativePtr): int32_t {
    return kniBridge146(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toUInt32", "I16@0:8")
internal fun objcKniBridge47(kniSC: NativePtr, kniR: NativePtr): uint32_t {
    return kniBridge147(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toNumber", "@16@0:8")
internal fun objcKniBridge48(kniSC: NativePtr, kniR: NativePtr): NSNumber? {
    return interpretObjCPointerOrNull<NSNumber>(kniBridge148(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toString", "@16@0:8")
internal fun objcKniBridge49(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge149(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toDate", "@16@0:8")
internal fun objcKniBridge50(kniSC: NativePtr, kniR: NativePtr): NSDate? {
    return interpretObjCPointerOrNull<NSDate>(kniBridge150(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toArray", "@16@0:8")
internal fun objcKniBridge51(kniSC: NativePtr, kniR: NativePtr): List<*>? {
    return interpretObjCPointerOrNull<List<*>>(kniBridge151(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toDictionary", "@16@0:8")
internal fun objcKniBridge52(kniSC: NativePtr, kniR: NativePtr): Map<Any?, *>? {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge152(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueForProperty:", "@24@0:8@16")
internal fun objcKniBridge53(kniSC: NativePtr, kniR: NativePtr, property: String?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge153(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, property.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValue:forProperty:", "v32@0:8@16@24")
internal fun objcKniBridge54(kniSC: NativePtr, kniR: NativePtr, value: Any?, forProperty: String?): Unit {
    return kniBridge154(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), forProperty.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("deleteProperty:", "B24@0:8@16")
internal fun objcKniBridge55(kniSC: NativePtr, kniR: NativePtr, property: String?): Boolean {
    return kniBridge155(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, property.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hasProperty:", "B24@0:8@16")
internal fun objcKniBridge56(kniSC: NativePtr, kniR: NativePtr, property: String?): Boolean {
    return kniBridge156(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, property.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("defineProperty:descriptor:", "v32@0:8@16@24")
internal fun objcKniBridge57(kniSC: NativePtr, kniR: NativePtr, property: String?, descriptor: Any?): Unit {
    return kniBridge157(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, property.objcPtr(), descriptor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueAtIndex:", "@24@0:8Q16")
internal fun objcKniBridge58(kniSC: NativePtr, kniR: NativePtr, index: NSUInteger): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge158(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, index))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValue:atIndex:", "v32@0:8@16Q24")
internal fun objcKniBridge59(kniSC: NativePtr, kniR: NativePtr, value: Any?, atIndex: NSUInteger): Unit {
    return kniBridge159(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), atIndex)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqualToObject:", "B24@0:8@16")
internal fun objcKniBridge60(kniSC: NativePtr, kniR: NativePtr, value: Any?): Boolean {
    return kniBridge160(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqualWithTypeCoercionToObject:", "B24@0:8@16")
internal fun objcKniBridge61(kniSC: NativePtr, kniR: NativePtr, value: Any?): Boolean {
    return kniBridge161(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isInstanceOf:", "B24@0:8@16")
internal fun objcKniBridge62(kniSC: NativePtr, kniR: NativePtr, value: Any?): Boolean {
    return kniBridge162(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("callWithArguments:", "@24@0:8@16")
internal fun objcKniBridge63(kniSC: NativePtr, kniR: NativePtr, arguments: List<*>?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge163(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, arguments.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("constructWithArguments:", "@24@0:8@16")
internal fun objcKniBridge64(kniSC: NativePtr, kniR: NativePtr, arguments: List<*>?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge164(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, arguments.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("invokeMethod:withArguments:", "@32@0:8@16@24")
internal fun objcKniBridge65(kniSC: NativePtr, kniR: NativePtr, method: String?, withArguments: List<*>?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge165(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, method.objcPtr(), withArguments.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("context", "@16@0:8")
internal fun objcKniBridge66(kniSC: NativePtr, kniR: NativePtr): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge166(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isUndefined", "B16@0:8")
internal fun objcKniBridge67(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge167(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isNull", "B16@0:8")
internal fun objcKniBridge68(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge168(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isBoolean", "B16@0:8")
internal fun objcKniBridge69(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge169(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isNumber", "B16@0:8")
internal fun objcKniBridge70(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge170(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isString", "B16@0:8")
internal fun objcKniBridge71(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge171(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isObject", "B16@0:8")
internal fun objcKniBridge72(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge172(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isArray", "B16@0:8")
internal fun objcKniBridge73(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge173(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isDate", "B16@0:8")
internal fun objcKniBridge74(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge174(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8")
internal fun objcKniBridge75(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSValue>(kniBridge175(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managedValueWithValue:", "@24@0:8@16")
internal fun objcKniBridge76(kniSC: NativePtr, kniR: NativePtr, value: JSValue?): JSManagedValue? {
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge176(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managedValueWithValue:andOwner:", "@32@0:8@16@24")
internal fun objcKniBridge77(kniSC: NativePtr, kniR: NativePtr, value: JSValue?, andOwner: Any?): JSManagedValue? {
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge177(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), andOwner.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8")
internal fun objcKniBridge78(kniSC: NativePtr, kniR: NativePtr): JSManagedValue? {
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge178(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16")
internal fun objcKniBridge79(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): JSManagedValue? {
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge179(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8")
internal fun objcKniBridge80(kniSC: NativePtr, kniR: NativePtr): JSManagedValue? {
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge180(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithValue:", "@24@0:8@16")
internal fun objcKniBridge81(kniSC: NativePtr, kniR: NativePtr, value: JSValue?): JSManagedValue? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge181(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("value", "@16@0:8")
internal fun objcKniBridge82(kniSC: NativePtr, kniR: NativePtr): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge182(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8")
internal fun objcKniBridge83(kniSC: NativePtr, kniR: NativePtr): JSManagedValue? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<JSManagedValue>(kniBridge183(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("objectForKeyedSubscript:", "@24@0:8@16")
internal fun objcKniBridge84(kniSC: NativePtr, kniR: NativePtr, key: Any?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge184(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, key.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setObject:forKeyedSubscript:", "v32@0:8@16@24")
internal fun objcKniBridge85(kniSC: NativePtr, kniR: NativePtr, `object`: Any?, forKeyedSubscript: NSObject?): Unit {
    return kniBridge185(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr(), forKeyedSubscript.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("contextWithJSGlobalContextRef:", "@24@0:8^{OpaqueJSContext=}16")
internal fun objcKniBridge86(kniSC: NativePtr, kniR: NativePtr, jsGlobalContextRef: JSGlobalContextRef?): JSContext? {
    return interpretObjCPointerOrNull<JSContext>(kniBridge186(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, jsGlobalContextRef.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("JSGlobalContextRef", "^{OpaqueJSContext=}16@0:8")
internal fun objcKniBridge87(kniSC: NativePtr, kniR: NativePtr): JSGlobalContextRef? {
    return interpretCPointer<OpaqueJSContext>(kniBridge187(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithPoint:inContext:", "@40@0:8{CGPoint=dd}16@32")
internal fun objcKniBridge88(kniSC: NativePtr, kniR: NativePtr, point: CValue<CGPoint>, inContext: JSContext?): JSValue? {
    memScoped {
        return interpretObjCPointerOrNull<JSValue>(kniBridge188(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, point.getPointer(memScope).rawValue, inContext.objcPtr()))
    }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithRange:inContext:", "@40@0:8{_NSRange=QQ}16@32")
internal fun objcKniBridge89(kniSC: NativePtr, kniR: NativePtr, range: CValue<NSRange>, inContext: JSContext?): JSValue? {
    memScoped {
        return interpretObjCPointerOrNull<JSValue>(kniBridge189(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, range.getPointer(memScope).rawValue, inContext.objcPtr()))
    }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithRect:inContext:", "@56@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16@48")
internal fun objcKniBridge90(kniSC: NativePtr, kniR: NativePtr, rect: CValue<CGRect>, inContext: JSContext?): JSValue? {
    memScoped {
        return interpretObjCPointerOrNull<JSValue>(kniBridge190(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, rect.getPointer(memScope).rawValue, inContext.objcPtr()))
    }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithSize:inContext:", "@40@0:8{CGSize=dd}16@32")
internal fun objcKniBridge91(kniSC: NativePtr, kniR: NativePtr, size: CValue<CGSize>, inContext: JSContext?): JSValue? {
    memScoped {
        return interpretObjCPointerOrNull<JSValue>(kniBridge191(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, size.getPointer(memScope).rawValue, inContext.objcPtr()))
    }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toPoint", "{CGPoint=dd}16@0:8")
internal fun objcKniBridge92(kniSC: NativePtr, kniR: NativePtr): CValue<CGPoint> {
    val kniRetVal = nativeHeap.alloc<CGPoint>()
    try {
        kniBridge192(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toRange", "{_NSRange=QQ}16@0:8")
internal fun objcKniBridge93(kniSC: NativePtr, kniR: NativePtr): CValue<NSRange> {
    val kniRetVal = nativeHeap.alloc<NSRange>()
    try {
        kniBridge193(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toRect", "{CGRect={CGPoint=dd}{CGSize=dd}}16@0:8")
internal fun objcKniBridge94(kniSC: NativePtr, kniR: NativePtr): CValue<CGRect> {
    val kniRetVal = nativeHeap.alloc<CGRect>()
    try {
        kniBridge194(getMessengerStret(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("toSize", "{CGSize=dd}16@0:8")
internal fun objcKniBridge95(kniSC: NativePtr, kniR: NativePtr): CValue<CGSize> {
    val kniRetVal = nativeHeap.alloc<CGSize>()
    try {
        kniBridge195(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("objectForKeyedSubscript:", "@24@0:8@16")
internal fun objcKniBridge96(kniSC: NativePtr, kniR: NativePtr, key: Any?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge196(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, key.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("objectAtIndexedSubscript:", "@24@0:8Q16")
internal fun objcKniBridge97(kniSC: NativePtr, kniR: NativePtr, index: NSUInteger): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge197(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, index))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setObject:forKeyedSubscript:", "v32@0:8@16@24")
internal fun objcKniBridge98(kniSC: NativePtr, kniR: NativePtr, `object`: Any?, forKeyedSubscript: NSObject?): Unit {
    return kniBridge198(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr(), forKeyedSubscript.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setObject:atIndexedSubscript:", "v32@0:8@16Q24")
internal fun objcKniBridge99(kniSC: NativePtr, kniR: NativePtr, `object`: Any?, atIndexedSubscript: NSUInteger): Unit {
    return kniBridge199(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr(), atIndexedSubscript)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueWithJSValueRef:inContext:", "@32@0:8^{OpaqueJSValue=}16@24")
internal fun objcKniBridge100(kniSC: NativePtr, kniR: NativePtr, value: JSValueRef?, inContext: JSContext?): JSValue? {
    return interpretObjCPointerOrNull<JSValue>(kniBridge200(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.rawValue, inContext.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("JSValueRef", "^{OpaqueJSValue=}16@0:8")
internal fun objcKniBridge101(kniSC: NativePtr, kniR: NativePtr): JSValueRef? {
    return interpretCPointer<OpaqueJSValue>(kniBridge201(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@SymbolName("platform_JavaScriptCore_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Int, p5: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge1")
private external fun kniBridge1(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge2")
private external fun kniBridge2(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("platform_JavaScriptCore_kniBridge4")
private external fun kniBridge4(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr, p2: NativePtr): UInt
@SymbolName("platform_JavaScriptCore_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge17")
private external fun kniBridge17(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge18")
private external fun kniBridge18(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: Byte): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: Double): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr, p2: NativePtr): Double
@SymbolName("platform_JavaScriptCore_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge30")
private external fun kniBridge30(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge31")
private external fun kniBridge31(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge32")
private external fun kniBridge32(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: ULong, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: Int, p7: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: UInt, p5: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge49")
private external fun kniBridge49(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge56")
private external fun kniBridge56(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge57")
private external fun kniBridge57(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge58")
private external fun kniBridge58(p0: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge61")
private external fun kniBridge61(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge62")
private external fun kniBridge62(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge63")
private external fun kniBridge63(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge64")
private external fun kniBridge64(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge66")
private external fun kniBridge66(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge67")
private external fun kniBridge67(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge68")
private external fun kniBridge68(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge69")
private external fun kniBridge69(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge70")
private external fun kniBridge70(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge71")
private external fun kniBridge71(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge74")
private external fun kniBridge74(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge75")
private external fun kniBridge75(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge76")
private external fun kniBridge76(p0: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge77")
private external fun kniBridge77(p0: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge78")
private external fun kniBridge78(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge79")
private external fun kniBridge79(p0: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: ULong): ULong
@SymbolName("platform_JavaScriptCore_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: UInt, p2: ULong, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: UInt, p2: NativePtr, p3: ULong, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: UInt, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: UInt, p2: NativePtr, p3: ULong, p4: ULong, p5: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr, p2: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: NativePtr, p2: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr, p2: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge91")
private external fun kniBridge91(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: NativePtr): ULong
@SymbolName("platform_JavaScriptCore_kniBridge95")
private external fun kniBridge95(p0: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge105")
private external fun kniBridge105(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("platform_JavaScriptCore_kniBridge113")
private fun kniBridge113(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(createKotlinObjectHolder(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<JSContext>().exceptionHandler()))
}
@kotlin.native.internal.ExportForCppRuntime("platform_JavaScriptCore_kniBridge114")
private fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(JSContext?, JSValue?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<JSContext>(p0), interpretObjCPointerOrNull<JSValue>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("platform_JavaScriptCore_kniBridge116")
private fun kniBridge116(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(JSContext?, JSValue?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<JSContext>(p0), interpretObjCPointerOrNull<JSValue>(p1))
}
@SymbolName("platform_JavaScriptCore_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("platform_JavaScriptCore_kniBridge117")
private fun kniBridge117(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<JSContext>().setExceptionHandler(exceptionHandler = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: JSContext?, p1: JSValue?): Unit {
return kniBridge118(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("platform_JavaScriptCore_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge121")
private external fun kniBridge121(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge123")
private external fun kniBridge123(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: Byte, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr, p2: Double, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge139")
private external fun kniBridge139(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge141")
private external fun kniBridge141(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: NativePtr): Double
@SymbolName("platform_JavaScriptCore_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr): Int
@SymbolName("platform_JavaScriptCore_kniBridge147")
private external fun kniBridge147(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("platform_JavaScriptCore_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge153")
private external fun kniBridge153(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge155")
private external fun kniBridge155(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("platform_JavaScriptCore_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge161")
private external fun kniBridge161(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge165")
private external fun kniBridge165(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge169")
private external fun kniBridge169(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge171")
private external fun kniBridge171(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("platform_JavaScriptCore_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge177")
private external fun kniBridge177(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge181")
private external fun kniBridge181(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge182")
private external fun kniBridge182(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge183")
private external fun kniBridge183(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge185")
private external fun kniBridge185(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge189")
private external fun kniBridge189(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge191")
private external fun kniBridge191(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge193")
private external fun kniBridge193(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("platform_JavaScriptCore_kniBridge199")
private external fun kniBridge199(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("platform_JavaScriptCore_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge201")
private external fun kniBridge201(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge202")
private external fun kniBridge202(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge203")
private external fun kniBridge203(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge204")
private external fun kniBridge204(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge205")
private external fun kniBridge205(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge206")
private external fun kniBridge206(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge207")
private external fun kniBridge207(): NativePtr
@SymbolName("platform_JavaScriptCore_kniBridge208")
private external fun kniBridge208(): NativePtr
