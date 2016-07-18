/**
 * Created by kakkunpakkun on 2016/07/16.
 */
package sample

class Rational(val numerator: Int, val denominator: Int)

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.denominator)
}
