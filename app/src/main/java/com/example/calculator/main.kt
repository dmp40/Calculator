package com.example.calculator

fun main() {
    println("Hello! It's calculator")

    while (true) {
        println("Enter a number")
        val first = readLine()?.toDoubleOrNull()
        println("Enter one more number")
        val second = readLine()?.toDoubleOrNull()
        println("Enter an operator  +- * /")
        val operator = readLine()

        println("$first $second $operator")

        if (first == null || second == null || operator.isNullOrEmpty()) {
            println("Enter valid data")
        } else {

            println("Result " +
                    "" + calculate(first, second, operator))
        }


    }
}
fun calculate ( fir: Double, sec: Double, op: String): Double {
    var res: Double = 0.0
    when (op) {
        "+" -> res = fir + sec
        "-" -> res = fir - sec
        "*" -> res = fir * sec
        "/" -> res = fir / sec

    }
    return res

}
