package generics



fun main() {
    BelajarGenerics(1)
    BelajarGenerics(10.00)


}

class BelajarGenerics<T> (
        input : T) /*Constructor primer*/ {
    init {
        println("Isi object adalah : $input")
    }
}
