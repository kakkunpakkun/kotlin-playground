/**
 * Created by kakkunpakkun on 2016/07/16.
 */
fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    val functionObject = ::square
    println(functionObject)
    println(functionObject(3))
}