package belajar_kotlin

fun main() {
    val examValue = 90

    if (examValue > 90) {
        println("Cool")
    } else if (examValue > 75){
        println("Good Job")
    } else if (examValue > 60){
        println("Not Bad")
    }else {
        println("Trying again the next year")
    }
}