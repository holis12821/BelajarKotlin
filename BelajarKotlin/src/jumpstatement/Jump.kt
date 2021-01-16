package jumpstatement

import kotlin.math.sqrt

fun main(args: Array<String>) {

    for (i in 1..5 step 2){
        for (j in 1..3 step 1){
            if (i in 2..4){
                break
            }
            println("i = $i; j = $j")
        }
    }

    println()
   here@ for (i in 1..5){
       for (j in 1..4){
           if (i == 3 || j== 2)
               continue@here
           println("i = $i; j = $j")
       }
   }

    println()
    val number = 5.5
    print("Result = ${sqrt(number)}")

    println()
    println("Continue Berlebel")

    here@ for (i in 1..5){
        for (j in 1..4){
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }
}