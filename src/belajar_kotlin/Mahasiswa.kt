package belajar_kotlin

fun main() {
    val mhs = Mahasiswa("Nurholis", "Sistem Informasi", 21)
    println("Nama : ${mhs.getName()} , ${mhs.getMajor()}, ${mhs.getAge()}")
}


class Mahasiswa (
        private val name: String,
        private val major: String,
        private val age: Int
        ) {

    fun getName() : String {
        return this.name
    }

    fun getMajor(): String {
        return this.major
    }

    fun getAge(): Int {
        return this.age
    }
}