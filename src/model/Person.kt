package model

import java.util.ArrayList

fun main() {

    val people = listOf(
            Person("Azriel", 18),
            Person("Ervan", 19),
            Person("Ipul", 19),
            Person("Rizal", 20),
            Person("Nando", 22),
            Person("Rizki", 25)
    )
    val selectedPerson = people.maxBy { person
        -> person.age}
    println(selectedPerson)
    println("name : ${selectedPerson?.name}")
    println("age : ${selectedPerson?.age}")
    
}

data class Person(
        val name: String,
        val age: Int)


