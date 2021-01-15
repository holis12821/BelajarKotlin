package lamda

fun main(args: Array<String>) {
    val product = {a: Int, b: Int -> a * b}
    val result = product(3,2) /*lamda expression*/
    println("Result : $result")
}