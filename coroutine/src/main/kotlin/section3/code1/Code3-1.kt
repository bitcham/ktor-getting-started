package section3.code1

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

val singleThreadDispatcher:
        CoroutineDispatcher = newSingleThreadContext("SingleThread")

fun main() = runBlocking<Unit>{
    launch (singleThreadDispatcher) {
        println("Running in thread: [${Thread.currentThread().name}]")
    }

}