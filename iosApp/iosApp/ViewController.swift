import UIKit
import JavaScriptCore
import app

class ViewController: UIViewController {

    let context = JSContext()!

    override func viewDidLoad() {
        super.viewDidLoad()
        setupJS()
        label.text = callSecretTeller()
    }

    @IBOutlet weak var label: UILabel!

    func setupJS() {
        context.exceptionHandler = { context, exception in
            print(exception!.toString())
        }
        context.setObject(SecretTeller.self, forKeyedSubscript: "SecretTeller" as NSString)
    }

    func callSecretTeller() -> String {
        let script = """
            var teller = SecretTeller.create()
            teller.tell()
        """
        return context.evaluateScript(script)?.toString() ?? "Nothing returned"
    }
}

@objc protocol SecretTellerExports: JSExport {
    var platform: String { get }
    func tell() -> String
    static func create() -> SecretTeller
}

extension SecretTeller: SecretTellerExports {
    static func create() -> SecretTeller {
        return SecretTeller()
    }
}
