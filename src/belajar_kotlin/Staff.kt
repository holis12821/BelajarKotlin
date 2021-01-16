package belajar_kotlin

fun main() {

    val list: ArrayList<Staff> = arrayListOf(
            Staff("14334555",
                    "Hawari Tendo",
                    "Staf Bagian Keuangan"
            ))
    for (staff in list){
        println("NIM : ${staff.getNim()}")
        println("Nama : ${staff.getName()}")
        println("Working : ${staff.getWorking()}")
    }

}

class Staff(
        private val nim: String,
        private val name: String,
        private val working: String
    ) {

    fun getNim(): String = this.nim
    fun getName(): String = this.name
    fun getWorking(): String = this.working
}