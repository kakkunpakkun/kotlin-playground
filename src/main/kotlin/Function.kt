/**
 * Created by kakkunpakkun on 2016/07/16.
 */
package sample.function

fun succ(i: Int): Int = i + 1

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    val sum = sum(arrayOf(1, 2, 3))
    println(sum)
}