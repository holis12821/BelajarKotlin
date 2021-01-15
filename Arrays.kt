package belajar_kotlin

fun main() {

    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")

    for (i in members)
        println(i)


    val name: Array<String?> = arrayOfNulls(5)
    name[0]

    val name1: String? = null
    println(name1?.length) //jadi compiler kotlin mengizinkan menerima nilai null
    //asalkan menggunakan operator elvis, jadi walau nilai yg diterima oleh receiver (variabel name1 bertipe data reverence
    //String otomatis dia bisa menerima nilai yg didapatkan dari hasil pemanggilan sebuah atribut atau method dari tipe data reference string
    //walaupun nilai yg diterima itu null tetap akan ditampilan di standart output stream dan tdk akan ada error kotlin null pointer kaarna aman


}