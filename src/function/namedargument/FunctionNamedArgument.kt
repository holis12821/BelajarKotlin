package function.namedargument


fun fullName(firstName: String,
             middleName: String,
             lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(
            lastName = "Khannedy",
            firstName = "Eko",
            middleName = "Kurniawan"  /*jadi secara langsung kita bisa memanggil parameter variabel
            dari masing-masing variabel parameter pada parameter actualnya saat kita memanggil function fullName
            jadi memudahkan kita saat nantinya parameternya banyak*/
    )
}