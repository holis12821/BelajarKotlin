package belajar_kotlin

fun sayHello(firstName: String, lastName: String?) {

    /*Conditional if */
    if (lastName == null){
        println("Hello : $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun stringKata(){

    println("Menggunakan Method trimMargin")
    println("""Kita adalah suat hal yang berbeda tetapi perbedaan
        | itu tidak akan mempengaruhi kita untuk menjalin sebuah asmara
    """.trimMargin())

    println("Menggunakan Method trimIndent()")
    println("""Kita adalah suat hal yang berbeda tetapi perbedaan
        | itu tidak akan mempengaruhi kita untuk menjalin sebuah asmara
    """.trimIndent())

    println("Menggunakan Method trimEnd()")
    println("""Kita adalah suat hal yang berbeda tetapi perbedaan
        | itu tidak akan mempengaruhi kita untuk menjalin sebuah asmara
    """.trimEnd())

    println("Menggunakan Method trimStart()")
    println("""Kita adalah suat hal yang berbeda tetapi perbedaan
        | itu tidak akan mempengaruhi kita untuk menjalin sebuah asmara
    """.trimStart())
}

fun main(){
    sayHello("Budi", "Doremi" )
    sayHello("Joko" , "Budidarma")
    sayHello("Jodi", null)

    println()
    stringKata()


    val number: Number = 12L
    if (number is Long){
        println("Number merupakan instance of dari Long")
    } else {
        println("Bukan Instance of Double")
    }
 }

