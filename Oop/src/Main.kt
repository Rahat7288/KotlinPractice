fun main() {
    println("=======learning OOP================")
//    defining object of the car
    val car1 = Car()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("Name = ${car1.model}")
    println("Name = ${car1.color}")
    println("Name = ${car1.doors}")

    car1.move()
    car1.stop()


}

//class define==========

class Car{
//    properties==========
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car $name is moving ")

    }
    fun  stop(){
        println("The car $name has stopped")
    }
}