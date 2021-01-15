package belajar_kotlin

fun main() {
    /*di kotlin tdk wajib class*/
    val firstName = "Nur"
    val lastName = "Holis"
    val address = """Jalan Baiduri Bulan
        >No 8a, Rt/ 006 / Rw. 011
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    val desc = "FirstName $firstName,  length : ${firstName.length}"
    println(desc)
}