/**
 * Created by kakkunpakkun on 2016/07/16.
 */
class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

fun main(args: Array<String>) {
    val greeter = Greeter()
    greeter.greet(name = "Kotlin")
}