package section3.code6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val dedicatedDispatcher = Dispatchers.IO.limitedParallelism(2)
    repeat(10) {
        launch(dedicatedDispatcher) {
            Thread.sleep(1000L)
            println("Running in thread: [${Thread.currentThread().name}]")
        }
    }
}