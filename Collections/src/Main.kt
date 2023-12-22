fun main() {
    println("List========")
//this is a immutable type list we can not add or remove elements to this list
    val names = listOf<String>("Rahat", "Akash", "Asad", "Ritesh")

    println(names[2])
//    this mutable list we can add or remove elements tto this list

    val namess = mutableListOf<String>("name 1", "name 2", "name 3")
     namess.add("name 4")
    namess.removeAt(0)
    for (name in namess){
        println(name)
    }

    println("maps =============")

    val user = mapOf<Int, String>(1 to "Rahat", 2 to "Islam", 3 to "Akash")
    println(user[3])
}