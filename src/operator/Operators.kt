package operator

class Operators(private var number1: Double, private var number2: Double) {

    fun hasil() {
        var result : Number
        result = this.number1 + this.number2
        println("Number1 + Number2 = $result")

        result = this.number1 - this.number2
        println("Number1 - Number2 = $result")

        result = this.number1 * this.number2
        println("Number1 * Number2 =  $result")

        result = this.number1 / this.number2
        println("Number1 / Number2 = $result")

        result = this.number1 % this.number2
        println("Number1 % Number2 = $result")

        println("Penambahan dengan Function")
        println("__________________________")

        result = this.number1.plus(this.number2)
        println("Number1 + Number 2 =  $result")

        result = this.number1.minus(this.number2)

        println("Number1 - Number2 = $result")


    }

    fun concat(){
        val start = "Nurholis"
        val middle = "No. 8A"
        val end = "Udacoding"

        val result = start + middle + end

        println("Hasil Concatenation : $result")
    }

    /*Operator Unary*/
    fun unary(){
        println("_______Operator Unary_________")
        val a= 1
        val b = true
        var c = 1

        val result1 : Int
        val result2 : Int
        val booleanResult : Boolean


        result1 = -a
        result2 = a.unaryMinus()

        println("-a = $result2")
        println("-a mengggunakan method = $result1")

        booleanResult = !b
        println("!b = $booleanResult")

        --c
        println("--c = $c")

    }

    /*Operator Perbaandingan dan persamaan*/
    fun different(){
        println("Operator Perbaandingan dan persamaan")
        val a = -12
        val b = 12

        /*Model nya itu untuk assigment sebuah variabel dgn kondisi*/
        val max = if (a < b){
            println("a < b. ")
            a
        } else{
            println("b > a. ")
            b
        }

        println("max = $max")

    }

    fun logic(){
        println("______Operator Logika_______")
        val a = 10
        val b = 9
        val c = -1

        val result: Boolean
        result = (a > b) and (a> c)
        println("Nilai : $result")
    }

    fun operatorIn(){
        println("Operator In")
        val numbers = intArrayOf(1,4,42,-3) /*vararg menjadikan parameter sebuah method memiliki banyak signature atau argumen / parameter*/
        if (4 in numbers){
            println("Array of Numbers berisikan 4.")
        } else {
            println("Array of Numbers not element 4 in Array")
        }
    }

    fun indexAccessOperators(){
        println("Index Access Operator")
        val a = intArrayOf(1,2,3,4,-1)
        println(a[1])
        a[1] = 12
        println(a[1])
        for (number in a ){ /*Menggunakan foreach*/
            println("Array of Integer : $number")
        }

    }

    fun ifMultipleExpression() {
        val a = -9
        val b = -11 /*-9 > -11 = true*/

        /*Membuat kondisi if menjadi expresi*/
        /*kondisi else wajib disertakan ketika kita menggunakan kondisi if sebagai expresi*/
        val max = if (a > b){
            println("$a lebih besar dari $b")
            println("val max memiliki value a.")
            a
        } else {
            println("$b lebih besar dari $a")
            println("val max memiliki nilai value b.")
            b
        }

        println("Max : $max")

    }

    fun ifElseIfExpression(){
        val number = 0
        val result = if(number > 0)
          "Positive Number"
         else if (number < 0)
            "Negative Number"
         else
             "Zero"

        println("Number is $result")

    }

    fun nestedIfExpression(){
        val n1 = 3
        val n2 = 5
        val n3 = -2

        val max = if (n1 > n2){
            if (n1 > n3)
                n1
            else
                n3
        } else{
            if (n2 > n3)
                n2
            else
                n3
        }
        println("Max : $max")
    }

    fun whenExpression(){
        val numProvided = when (3){
            1-> "Satu"
            2-> "Dua"
            3-> "Tiga"
            4-> "Empat"
            5-> "Lima"

            else -> "Wrong Number"
        }
        println("NumberProvided : $numProvided")
    }

    fun iteratorRange(){
        /*Macam- macam iterator pada range*/
        println("Macam- macam iterator pada range")

        print("for (i in 1..5) print(i) = ")
        for (i in 1..5) print(i)

        println()

        print("for (i in 5..1) print(1) =")
        for (i in 5 downTo 1) print(i)

        println()

        print("for (i in 5 downTo 1) print(i) =")
        for (i in 5 downTo 1) print(i) /*Konsep Iterator*/
        /*Iterator itu posisinya sblm data pertama*/

        println()

        /*jadi awal varibael i masih kosong
        * ketika looping dijalankan otomatis iterator berjalan dan masuk ke angka dari range 1..4 yaitu angka ke 1
        * dan di cek apakah angka 1 milik sebuah range 1..4, jika dia milik maka terpenuhi dan akan ditambahkan dengan 2
        * menjadi 3 karna step iteratornya 2. saat di print yang muncul angka 1 kenapa karna posisi iteratornya
        * itu masih di angka 1 karena belom looping dan menjalankan fungsi print terlebih dahulu setelah ituu dilooping
        * dan masuk ke iterator selanjutnya karena telah ditambah 2 otomatis posisi iteratornya di angka 3
        * jadi i = 3 yaitu posisi iteratornya di 3 dan begitu seterusnya*/

        print("for ( i in 1..4 step 2) print(i) =")
        for (i in 1..4 step 2) print("$i")

        println()

        print("for ( i in 4 downTo 1 step 2 print(i) =")
        for (i in 4 downTo 0 step 2 ) print(i)

        println()
        print("for ( i in 4 downTo 3 step 3) print(i) = ")

        for (i in 4 downTo 3 step 3) print(i)

        println()

    }

    fun iteratorArray(){
        /*Looping dgn array*/
        println("Looping dengan Array")
        /*Iterator itu bisa digunakan oleh range, array, map, yang berhubungan dengan sebuah iterator.*/
        val language = arrayOf(/*iterator ->*/"Ruby", "Kotlin", "Python", "Java") /*Array direpresentasikaan bukan sebagai tipe
        primitif objek lgi, tapi direpresentasikan menjadi objek collection*/

        for (item in language)
            println(item)

        println()

        println("Looping dengan Array disertai index")

        val language2 = arrayOf("Ruby", "Kotlin", "Python", "Java")

        for (item2 in language2.indices)

            if (item2 % 2  == 0){
                println(language2[item2])
                println(item2)
            }

        println()
        println("Perulangan dengan String")
        val text = "Kotlin"
        for (letter in text)
            println(letter)
    }

    fun whileLoop(){

        println("Looping While")
        println()
        var i = 1
        while (i<=5){
            println("Line : $i") //ditampilkan baru ditambah
            i++ /*Prefik incerament*/ /*i = 1 + 1, i = i + 1*/
        }

        /*for (int i = 0; i<=5; ++i){ ditelusurin terlebih dahulu di body karna ; baru ditambah
        * System.out.println("Line : " + i) format looping for di java
        * }*/
    }

    fun naturalNumbers(){
        var sum = 0
        var sum1 = 0
        var i = 100
        /*Looping while*/
        while (i !=  0){
            sum += i //sum = sum + i
            println("Iteration ke- $i : sum = $sum1 + $i")

            sum1 = sum
            --i //i = 1 - i -> 1 - 99
        }
    }

    fun breakStatement(){
        println("Break Statement")
        println()
        for (i in 1..10) {
            if (i == 5) {
                break
            }
            println(i) //keluar dri looping
        }
    }

    fun inputUser(){
      var sum = 0
      var number: Int

      while (true){
          print("Enter a number : ")
          number = readLine()!!.toInt()

          if (number == 0){
              break
          }
          sum += number
      }
        print("sum = $sum")
        println()

        println("For bersarang")
        println("For dengan label")
     /*ini adalah label*/first@ for (i in 1..4){ /*variabel i dan j berisi angka 1 dan 1, angka ini di dapaat melalui iterator
        tergantung posisi iteratornya dimana maka akan di assigment ke variabel i dan j*/
           second@ for (j in 1..2){
                println("i = $i; j= $j")/*Jika looping for bersarang
                maka akan menyelesaikan looping di dalam nya terlebih dahulu*/
               if (i == 2)
                   break@second
            }
        }
    }

    fun continueStatement(){
        println()
        for (i in 1..5){
            println("$i Always Printed.")
            if (i in 2..4) {
                continue
            }
            println("$i is not always printed")
        }
    }
}
