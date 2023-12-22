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

class User ( firstName: String, var lastName: String, var age: Int){
    var firstName: String
    lateinit var middleName: String

    init {
        if (firstName.lowercase().startsWith(prefix = "a")){
            this.firstName = firstName
        }else{
            this.firstName = "User"
            println("The first name doesn't start with A or a")
        }
    }
}

//lateinit ======================


//inner Class ============

/*
* we can define a class inside another class
* */


class ListView (val items: Array<String>){

    //    inner class can access the outer class
    inner class ListViewItems(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}

//inner class ======================




//companion object
/*
with the help of companion object we don't need to create an object to access of the
specific class.
companion object itself a property of the specific class

/
 */

class Calculator(){
    companion object{
        fun sum (a: Int, b: Int): Int{
            return  a+ b;
        }
    }

}
//companion object =========================

//Singleton
/*
* if we don't want to create multiple instance of a class we will use Singleton

*
*
* with a singleton one operation will execute only one time
* it will not do the same work multiple time
* */

//class Database private  constructor (){
//
//
//    companion object{
//        private var instance: Database? = null
//        fun getInstance(): Database?{
//            if (instance == null){
//                instance = Database()
//            }
//            return  instance
//        }
//    }
//}

object  Database {
    init {
        println("Database created")
    }
}
//singleton =======================

//inheritance ==============
/*
* inheritance can have the propertise or variables form it's parent class
* */

open class Vehicle(val name: String, val color: String){
    open fun start(){
        println("$name has started")
    }

    open fun stop(){
        println("$name has stop")
    }
}

class Cars(name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color){

}

class  Plane (name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color){
    override fun start() {
        flying()
        super.start()
    }

    fun flying(){
        println("The plane is flying ")
    }
}

//inheritance ===========================
