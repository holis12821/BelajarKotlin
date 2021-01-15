package belajar_kotlin

fun main() {
    val range = 100 downTo 1 step 2 //range itu menyediakan iterator

    println()
    println(range.count())
    println(range.contains(12))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

}