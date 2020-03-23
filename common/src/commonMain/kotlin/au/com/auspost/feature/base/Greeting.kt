package au.com.auspost.feature.base

class Greeting(val person: Person, val platform: IPlatform) {

    fun hello(): String {
        Logger.logMessage("Calling Greeting.hello()")
        return "Greetings ${person.firstName} ${person.lastName} on ${platform.getOS()}"
    }
}