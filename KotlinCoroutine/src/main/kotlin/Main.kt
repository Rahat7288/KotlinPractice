package org.example

import com.sun.tools.javac.Main
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {
    println("========learning about coroutine============")

    println("Main program starts:  ${Thread.currentThread().name}")

//    pretending to do something =======
//    this is the example of thread
//    thread {
//        println("fake work starts  : ${Thread.currentThread().name}")
//        Thread.sleep(3000)
//        println("fake work finishd : ${Thread.currentThread().name}")
//    }
   val parentJob =  CoroutineScope(Default).launch{
        println("fake work starts: ${Thread.currentThread().name}")
        delay(2000)
        println("fake work ends: ${Thread.currentThread().name}")
    }
    runBlocking {
        parentJob.join()
    }




    println("Main program ends: ${Thread.currentThread().name}")
}