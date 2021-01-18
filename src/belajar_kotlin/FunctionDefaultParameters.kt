package belajar_kotlin


fun hello(firstName: String, lastName: String = ""){ /*karena  parameter variabel dari lastname tidak wajib diisi
kita maka kita menggunakan default argument atau variabel parameter*/

    println("Hello $firstName $lastName")
}

fun main() {
    hello("Eko") //jadi bisa diisi bisa tdk jika ada sebuah variabel parameter yg sekiranya tidak wajib diisi
    hello("Eko", "Khannedy")
}