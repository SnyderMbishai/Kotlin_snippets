fun announce(announcement: String, vararg things: String){
    things.forEach{thing ->
        println("$announcement $thing")
    }
}

fun main(){
    //announce
    val things = arrayOf("Snyder", "Chebet", "Mbishai")
    announce("Here goes",*things )

   // val snyder = PersonTwo() // apparently you can call classes in another file just like that!!

    val myArray = arrayOf("one", "two", "three")
    //count
    println(myArray.size)
    //first item
    println(myArray[0])
    //or
    println(myArray.get(0))
    // for loop: each
    println("'for' items start here:")
    myArray.forEach(){arrayItem ->
        println(arrayItem)
    }
    // maintaining item index
    println("indexed: ")
    myArray.forEachIndexed{index, arrayItem ->
        println("$arrayItem is at index $index")
    }
}