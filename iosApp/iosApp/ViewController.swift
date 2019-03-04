import UIKit
import JavaScriptCore
import app

class ViewController: UIViewController {

    let context = JSContext()!

    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = Proxy().proxyHello()
    }

    @IBOutlet weak var label: UILabel!

    func setupJS() {
        context.exceptionHandler = { context, exception in
            print(exception!.toString())
        }
        context.setObject(SecretTeller.Companion.self, forKeyedSubscript: "SecretCompanion" as NSString)
    }
}
