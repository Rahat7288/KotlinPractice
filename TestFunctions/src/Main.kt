fun main() {
    println("===========Functions===============")

    sayHello("Rahat")

    println(getMax(4,5))
//    over loading function
    println(getMax(a = 5.6, b = 6.1))
}

fun sayHello(name: String){
    println("hello $name");
}

//return type function============
fun getMax(valeOne: Int, valueTwo: Int): Int{
    val max = if (valeOne > valueTwo) valeOne else valueTwo
    return  max
}

//function overloading

fun getMax(a: Double, b: Double): Double{
    val max = if(a > b) a else b

    return max
}