package belajar_kotlin

fun main(args: Array<String>) {
    println("__________Data Dosen______________")
    println()
    /*Array List menampung Data class*/
    val list: ArrayList<Dosen> = arrayListOf(
            Dosen(  "12110900",
                    "Ira Diana Sholihati",
                    37,
                    "Aljabar Liniear"
            ),
            Dosen(
                    "1332211",
                    "Agung Triayudi",
                    39,
                    "Big Data"
            ))

    for (i in list.indices) {
        println("NIP : ${list[i].getNIP()}")
        println("Name : ${list[i].getName()}")
        println("Age : ${list[i].getAge()}")
        println("Studying : ${list[i].getStudying()}")
        println()
    }
}

class Dosen (
        private val NIP: String,
        private val name: String,
        private val age: Int,
        private val studying: String
        ){

    fun getNIP(): String = this.NIP
    fun getName(): String = this.name
    fun getAge(): Int = this.age
    fun getStudying(): String = this.studying
}