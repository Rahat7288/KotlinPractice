fun main() {
    println("Integer type in kotlin");
    val number: Int = 26;
    println("The number is $number");
    val maxInteger = Int.MAX_VALUE;
    println("Maximum number of Integer $maxInteger");
    val minNumber = Int.MIN_VALUE;
    println("Minimum number of integer $minNumber");
    println("====================");
    println("Byte, Short and Long");

    val byteMaxValue: Byte = Byte.MAX_VALUE;
    println("Maximum Byte Value: $byteMaxValue");
    val  byteMinimumValue: Byte = Byte.MIN_VALUE;
    println("Minimum Byte Value: $byteMinimumValue");


    println("=========================Short");

    val shortMaxValue: Short = Short.MAX_VALUE;
    println("Max Short Value:  $shortMaxValue");
    val shortMinValue: Short = Short.MIN_VALUE;
    println("Short minimum Value: $shortMinValue");

    println("=====================Long");
    val longMaxValue: Long = Long.MAX_VALUE;
    println("Long maximum Value: $longMaxValue");
    val longMinValue: Long = Long.MIN_VALUE;
    println("Long Minimum Value: $longMinValue");


//    if we don't define then by default it will get integer

}