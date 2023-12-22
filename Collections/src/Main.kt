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

//generic type parameter ========================
//    val footballPlayer = FootballPlayer("Football player 1")
//    val footballPlayer1 = FootballPlayer("Football player 2")
//    val footballPlayer2 = FootballPlayer("Football player 3")
//    val footballPlayer3 = FootballPlayer("Football player 4")
//
//    println("Baseball players========")
//
//    val  baseballPlayer = BaseballPlayer("Baseball Player")
//    val  baseballPlayer1 = BaseballPlayer("Baseball Player 1")
//
//    val footballTeam = Team<FootballPlayer>("Football Player", mutableListOf(footballPlayer))
//
//    footballTeam.addPlayer(footballPlayer)
//    footballTeam.addPlayer(footballPlayer3)

//    =========================================

//    try and catch ====================================

    val a = 0
    val b = 5

    try {
        println(a/b)
    }catch (error: ArithmeticException){
        println("you can't divide by 0: ${error}")
        0
    }finally {
        print("divided by 5")
    }


//    =======a===========================================

}


