fun main() {
    println("===========Lamda And high level function===========")
    val myLamda = {a: Int -> println(a) }
    add(5,5, myLamda)
    println("Declearing the lamda function")

    upperCase("hello",{s: String, -> s.uppercase()})
//    if we have only one parameter we can use it
    upperCase("rahat", {it.uppercase()})

}

//lamda functions=================

fun add (a: Int, b: Int, action: (Int)-> Unit){
    action(a+b)
}

fun upperCase(str: String, myFunction: (String)-> String){
    val uppercasedWord = myFunction(str)

    println(uppercasedWord)
}