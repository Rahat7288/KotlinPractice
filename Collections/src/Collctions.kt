class collections{
    //this is a immutable type list we can not add or remove elements to this list
//    val names = listOf<String>("Rahat", "Akash", "Asad", "Ritesh")
//
//    println(names[2])
////    this mutable list we can add or remove elements tto this list
//
//    val namess = mutableListOf<String>("name 1", "name 2", "name 3")
//    namess.add("name 4")
//    namess.removeAt(0)
//    for (name in namess){
//        println(name)
//    }
//
//    println("maps =============")
//
//    val user = mapOf<Int, String>(1 to "Rahat", 2 to "Islam", 3 to "Akash")
//    println(user[3])



}

//generic type parameter ===================
//type definition

/*
* upperbound
* class Team<T: Player>(val name: String, val players: MutableList<T>
here the team class knows that this class will get only palyer type
* then we don't need any cast to implement
* */

class Team<T>(val name: String, val players: MutableList<T>){
    fun addPlayer(player: T){
        if (players.contains(player)){
            println("Playre: ${(player as Player).name} is already in the team ${this.name}")
        }else{
            players.add(player)
            println("Player : ${(player as Player).name}  is added to the list ${this.name}")

        }
    }
}


open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class  BaseballPlayer(name: String): Player(name)