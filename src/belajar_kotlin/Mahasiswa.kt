package belajar_kotlin

fun main() {
    val mhs = Mahasiswa("17311270067881", "Wahyu Eka", "Sistem informasi", 21)
    println("Nama : ${mhs.getNPM()} , mhs.getName()} , ${mhs.getMajor()}, ${mhs.getAge()}")
}


class Mahasiswa (
        private val npm: String,
        private val name: String,
        private val major: String,
        private val age: Int
        ) {

    fun getNPM(): String  = this.npm

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