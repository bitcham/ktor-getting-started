package section3.code2

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

val multiThreadDispatcher: CoroutineDispatcher
    = newFixedThreadPoolContext(2, "MultiThread")

fun main() = runBlocking<Unit> {
    launch (multiThreadDispatcher) {
        println("Running in thread: [${Thread.currentThread().name}]")
    }

    launch (multiThreadDispatcher) {
        println("Running in thread: [${Thread.currentThread().name}]")
    }
}