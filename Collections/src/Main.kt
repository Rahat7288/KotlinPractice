fun main() {
    println("collections operations========")

    val numbers = setOf(1,2,3,4,5)
    println(numbers.map { if( it == 3 ) it * 100 else it * 10})

    val numberMap = mapOf("key 1 "  to 1, "key 2" to 2, "key 3" to 3)
    println(numberMap.mapKeys { it.key.uppercase() })

}