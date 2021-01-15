package belajar_kotlin

fun main() {

    println("Looping for")
    val names = arrayOf("Eko", "Kurniawan", "Khannedy") //looping for defined to iterator
    /*Iterator before the first data*/

    var total = 0

    for (i in names){
        println(i)
        total++
    }
    println("Total : $total")


    println("Looping for Range Data")
    for (i in 0..100){
        println(i)
    }

    println("Looping for by step")
    for (i in 1000 downTo 0 step 5){
        println(i)
    }

    println("Short Loop using index")

    for (i in names.indices){
        println("Index $i = ${names[i]}" )
    }

    println("Long looping using index for combination the range data ")
    val index = names.size - 1 /*her the  same of index array representation = n -1 - > array length - 1*/
    /*return length of array*/
    /*result = 3-1 = 2 -> 2 the result has been representation in length for array*/
    for (i in 0..index){
        println("Index $i = ${names[i]}")
    }

    println("Looping with keyword break and continue")
    var i = 0

    while (true){
       println("Break me to $i")

        if (i > 4){
            break
        }
        i++
    }



    println("Do While Loops")
    var j = 0
    println()
    do {
        //min first run the program of the do while loops

            println("While Loops ke  $j")
            j++
    } while (i< 10) //cek the condition
}