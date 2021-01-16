

fun main(){


    /*ini untuk char*/
    println("Ini Type Char")
    val key = 'c'
    println("$key")

    println("Ini Type Boolean")
    val keputusan = true
    println("$keputusan")

    println("Ini Type String")
    val company = "Udacoding"
    val greeting = """Hi, $company..
    |Welcome to Kotlin Class !""".trimMargin()
    println(greeting)

    /*Arrays*/
    println("Arrays")
    val numbers: IntArray = intArrayOf(1,2,3,4,5)
    println("Hey i'm Array Example : " + numbers[2])

    /*Collection*/
    println("Collection")
    val numbers2 : MutableList<Int> = mutableListOf(1,2,3)/*List yg bisa diedit*/ /*menggunakan konsep polimorpisme*/
    val readOnly: List<Int > = numbers2
    println("My mutable List-- $numbers2")/*String Template*/ /*Memungkinkan kita memanggil sebuah variabel dan method
    di dlm string*/
    numbers2.add(4) //di mutableList
    println("My Mutable List after Addition $numbers2")
    println("My Immutable List after Addition -- $readOnly")

    println("__________________________________________________")
    println("Ranges looping")
    val i = 2

    for (j in 1..4)
        println(j)

    /*Looping for biasa*/
    val names = arrayOf("Joni, Joko, Jes No Limit")
    for (name in names){
        println(name)
    }

    /*Looping Step*/
    println("Looping for dari atas kebawah dan ditambah 3")
    for (j in 20 downTo 1 step 3 )
        println(j)

    if (i in 1..10){
        println("Number : $i")
    }




}