package belajar_kotlin.unitreturningfunction

fun printHello(name: String? = null) {
    if (name == null){
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello("Eko")
    printHello()
}