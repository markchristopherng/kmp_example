import UIKit
import common

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let json = "{ \"firstName\" : \"Mark\", \"lastName\" : \"Ng\"}"
        let person = JsonParser.init().json.parse(deserializer: Person.Companion.init().serializer(), string: json)  as! Person
        let platform = Platform.init()
        let greeting = Greeting.init(person: person, platform: platform)
        label.text = greeting.hello()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBOutlet weak var label: UILabel!
}

