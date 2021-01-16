package function

fun main(args: Array<String>) {
    val function = Function()

    println("Number of value : ${function.addNumber(12.00, 12.00)}")


    println()

    println()

    val number = 4
    val result = Function.factorial(number)

    println("Factorial of $number = $result")


    val helloWorld = Function()
    helloWorld.helloWorld()

    println("Welcome to Kotlin language : ${helloWorld.getHelloWorldKt()}")

}