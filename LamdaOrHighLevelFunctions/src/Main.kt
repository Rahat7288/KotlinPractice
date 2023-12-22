fun main() {
    println("===========Lamda And high level function===========")
    val myLamda = {a: Int -> println(a) }
    add(5,5, myLamda)
    println("Declearing the lamda function")

}

fun add (a: Int, b: Int, action: (Int)-> Unit){
    action(a+b)
}