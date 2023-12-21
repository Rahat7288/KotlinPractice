//class define==========
//defining primary constructor
class Car(//    properties==========
    var name: String, var model: String, var color: String, var doors: Int
){

    fun move(){
        println("The car $name is moving ")

    }
    fun  stop(){
        println("The car $name has stopped")
    }
}

//when to use property and when to use constructor
/*
* if we need to do some operations on a property then we will use property other than we will
* use constructor
*
*
* in kotlin we can define multiple constructor known as secondary constructor
* */