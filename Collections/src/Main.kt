fun main() {
    println("collections operations========")

//    val numbers = setOf(1,2,3,4,5)
//    println(numbers.map { if( it == 3 ) it * 100 else it * 10})
//
//    val numberMap = mapOf("key 1 "  to 1, "key 2" to 2, "key 3" to 3)
//    println(numberMap.mapKeys { it.key.uppercase() })
//
////    zipping =================
//    val colors = listOf("red", "green", "yellow")
//    val animals = listOf("fox","bear", "wolf")
//
//    println(colors.zip(animals))


    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer1 = FootballPlayer("Football player 2")
    val footballPlayer2 = FootballPlayer("Football player 3")
    val footballPlayer3 = FootballPlayer("Football player 4")

    println("Baseball players========")

    val  baseballPlayer = BaseballPlayer("Baseball Player")
    val  baseballPlayer1 = BaseballPlayer("Baseball Player 1")

    val footballTeam = Team<FootballPlayer>("Football Player", mutableListOf(footballPlayer))

    footballTeam.addPlayer(footballPlayer)
    footballTeam.addPlayer(footballPlayer3)

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