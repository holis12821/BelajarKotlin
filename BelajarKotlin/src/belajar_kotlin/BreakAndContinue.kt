package belajar_kotlin

fun main() {
    println("Looping with keyword break and continue")
    var i = 0

    while (true){
        println("Break me to $i")

        if (i > 4){
            break
        }
      i++
    }
    println()

    println("Do While Loops")
    var j = 0
    println()
    do {
        //min first run the program of the do while loop

        println("While Loops ke  $j")
        j++
    } while (j in 1..10 /*j < 10*/) //cek the condition or the range iterate


    println("Continue keyword for loops")

    /*loop for type range*/
    for (index in 1..1000){
        if (index % 2 == 0){
            continue
        }
        println("Range : $index")
    }

    for (index1 in 1..30){
        if (index1 % 4 == 0){
            continue
        }
        println("Range :  $index1")
    }

}