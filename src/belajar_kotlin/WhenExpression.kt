package belajar_kotlin

fun main() {


}    print("Put a Exam Value : ")
when(readLine()){
    "A" -> println("Amazing")
    "B" -> println("Good")
    "C" -> println("Not Bad")
    "D" -> println("Bad")
    "E" -> println("Try Again Next Year")

    else -> println("Ups ") //by default
}

println("When Expression Multiple Option")

print("Put a Exam Value : ")
when(readLine()){
    "A", "B", "C" -> {println("Passed")} /*Grouping when expression*/
    else -> {
        println("Sory you've not passed!!")}
}


/*the when use of operation in or !in*/
println("the when use of operation in or !in")
val passValue = arrayOf("A", "B", "C") //array  using an iterator
print("Put a Exam Value : ")
when(readLine()){
    in passValue /*variabel array*/ -> println("Passed")
    !in passValue -> println("Try again") //same the else condition
}

/*The name has been check of data type string or whatever */
println("""The name has been check of 
        |data type string or whatever""".trimMargin())
val name = "Eko"
when(name){
    is String -> println("This is String")
    !is String -> println("This is not String")
}

/*When expression as if else condition*/

println("When expression as if else condition")


val examValue = readLine()!!.toInt()
print("Input a Exam : ")
when {
    examValue > 90 -> println("Amazing")
    examValue > 80 -> println("Good Job")
    examValue > 60 -> println("Not Bad")
    else -> println("Try again next year")
}
