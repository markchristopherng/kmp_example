package au.com.auspost.feature.base

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = """ { "firstName" : "Mark", "lastName" : "Ng"} """
        val person = JsonParser.json.parse(Person.serializer(), json)
        val greeting = Greeting(person, Platform())

        val textView = findViewById<TextView>(R.id.greeting)
        textView.text = greeting.hello()
    }
}