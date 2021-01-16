package belajar_kotlin

class Variabel(
        private val app : String
)
/*Constructor Primer*/ {

    companion object{ /**/
        const val APPLICATION = "Telegram"
        const val VERSION = 1.1
    }

    fun getApp() : String {
        return this.app
    }
}
fun main() {
    var firstName: String? = "holis"
    firstName = null

    val name : String? = null

    println("First Name : $firstName")
    println("Panjang : ${name?.length}")
    println()
    println("Application :  ${Variabel.APPLICATION}")
    println("Version : ${Variabel.VERSION}")

    val aPP = Variabel("Instagram")
    println(aPP.getApp())


    val suatu = """kkkkkkk
        |jjjjjjjjjjjjjjjjjjjjjjj"""

}
