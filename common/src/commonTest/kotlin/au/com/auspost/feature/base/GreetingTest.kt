package au.com.auspost.feature.base

import kotlin.test.Test
import kotlin.test.assertEquals


class MockPlatform() : IPlatform {
    override fun getOS() = "Windows X"
}

class GreetingTest {

    @Test
    fun testGreetingWithMock() {
        val person = Person("Mark", "Ng")
        val greeting = Greeting(person, MockPlatform())
        assertEquals("Greetings Mark Ng on Windows X", greeting.hello())
    }

    @Test
    fun testGreetingWithInlineInterface() {
        val person = Person("Kim", "Ng")
        val greeting = Greeting(person, object : IPlatform {
            override fun getOS(): String = "Kindle"
        })
        assertEquals("Greetings Kim Ng on Kindle", greeting.hello())
    }
}