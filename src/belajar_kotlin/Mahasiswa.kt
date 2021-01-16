package belajar_kotlin

fun main() {
    val mhs = Mahasiswa("Aldi Nugroho", "Sistem Informasi", 23)
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