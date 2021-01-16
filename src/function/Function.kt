package function

class Function {

    companion object {
        /*Rekursif fungsi*/
        fun factorial(n: Int): Long {
            return if (n == 1) n.toLong() else n * factorial(n - 1)
        }
    }

    fun addNumber(n1 : Double, n2: Double) : Int{
           val sum = n1 + n2

        return sum.toInt()

    }

    fun helloWorld(){
        println("Hello World")
        println("Programmer Zaman Now")
    }


    fun getHelloWorldKt() : String = "Hello World Kotlin"

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName")
    }

    fun sayHelloKt(lastName: String, firstName: String): String{
        return "$lastName $firstName"
    }

}