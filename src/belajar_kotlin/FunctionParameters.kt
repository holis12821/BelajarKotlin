package belajar_kotlin

fun sayHello(firstName: String, lastName: String?) {

    /*Conditional if */
    if (lastName == null){
        println("Hello : $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main(){
    sayHello("Budi", "Doremi" )
    sayHello("Joko" , "Budidarma")
    sayHello("Jodi", null)


    val number: Number = 12L
    if (number is Long){
        println("Dia merupakan instance of Double")
    } else {
        println("Bukan Instance of Double")
    }
 }

