fun main(args: Array<String>) {
//    println("==========Control Flow=================");
//
////    if else statements=================
//
//    val isActive = false;
//
//    if (isActive ){
//        println("this line is active!");
//    }
//    else{
//        println("THis line is inActive");
//    }
//
////    null value
//
//    var text: String? = "Rahat";

//    calling function
    println("Function calling");

sayHello();
    sayBye();
    withName("Rahat");

//    var result: Int = getMax(a = 5, b = 3);
//    println(" the Result is $result");



}

fun sayHello(){
    println("Hello world!");
}

fun sayBye(){
    println("Say Bye");
}
//passing data to function
fun  withName(name: String){
    println("Hello $name");
}

//return in function
//fun getMax(a: Int, b: Int ): Int{
//    val max = if(b <= a) {
//        a
//    } else  b;
//
//    return max;
//}

