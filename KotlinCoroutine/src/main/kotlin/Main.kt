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
//        println("fake work starts: ${Thread.currentThread().name}")
//        delay(2000)
//        println("fake work ends: ${Thread.currentThread().name}")

       val job1 = launch {
          val result1 = getDetail(Thread.currentThread().name)
           println("form coroutine 1:  $result1")
       }
//       if we want to run the job in sequential not parallel order
//       we will call join
       job1.join()
       val job2 = launch {
           val result2 = getData2(Thread.currentThread().name)
           println("form coroutine 2: $result2")
       }
    }
    runBlocking {
        parentJob.join()
    }




    println("Main program ends: ${Thread.currentThread().name}")
}

private  suspend fun getDetail(threadName: String): String{
    println("Fake work1 starts: $threadName")
    delay(2000)
    println("Fake work1 ends: $threadName")
    return  "Result 1"
}

private suspend fun getData2(threadName: String): String{
    println("Fake work 2 starts : $threadName")
    delay(2000)
    println("Fake work 2 ends : $threadName")
    return "Fake Work 2"
}