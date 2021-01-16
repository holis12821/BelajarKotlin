package tailrecursion

fun main(args: Array<String>) {
     val n = 100
    val first = 4
    val second = 6

    println(taileRecursion(n, first, second))
    println()
    println("Heigher Order Fuction")
   println(  callMe { getnumberPlus()})


}

tailrec fun taileRecursion(n: Int, a: Int, b: Int): Int{
        return if ( n== 0) b else taileRecursion(n-1, a+b, a)
}

fun getnumberPlus() : Double {
    return 12.0 * 12.0
}


fun callMe(greeting: () -> Double) : Double{
println("Higher order function")
   return greeting()
}
