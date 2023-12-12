fun main() {
    println("===========Functions===============")

    sayHello("Rahat")

    println(getMax(4,5))
}

fun sayHello(name: String){
    println("hello $name");
}

//return type function============
fun getMax(valeOne: Int, valueTwo: Int): Int{
    val max = if (valeOne > valueTwo) valeOne else valueTwo
    return  max
}