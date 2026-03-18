package section1.code2

import java.util.concurrent.Executors.newFixedThreadPool
import kotlin.concurrent.thread


//fun main() {
//    println("[${Thread.currentThread().name}] start")
//    thread {
//        println("[${Thread.currentThread().name}] start")
//        Thread.sleep(2000L)
//        println("[${Thread.currentThread().name}] end")
//    }
//    Thread.sleep(1000L)
//    println("[${Thread.currentThread().name}] end")
//}



fun main(){
    val executorService = newFixedThreadPool(2)

    executorService.submit {
        println("[${Thread.currentThread().name}] (1) start")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] (1) end")
    }

    executorService.submit {
        println("[${Thread.currentThread().name}] (2) start")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] (2) end")
    }

    executorService.submit {
        println("[${Thread.currentThread().name}] (3) start")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] (3) end")
    }

    executorService.shutdown()
}