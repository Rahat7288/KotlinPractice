fun main() {
    println("=======learning OOP================")

    println("================lazy Initialization============")

    println(Database)

    val listView = ListView(arrayOf("item 1", "item 2","item 3", "item 4"))

    listView.ListViewItems().displayItem(position = 2)


    println("inheritance ============")

    val car = Cars(name = "BMW", color = "Blue",1, 4)
    val  plane = Plane(name = "Boeing", color = "White", 4, 4)

    car.stop()

    plane.start()

}

//==========lazy initialization ============
/*
* what is lazy initialization
* => lazy initialization used when creating an instance or object is expansive
*expensive means it will take some time to due to memory use
* in this scenario it is recommended to use lazy initialization
* */











