package section3.code5

import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Default.limitedParallelism(2)
    repeat(10) {
        launch(imageProcessingDispatcher) {
            Thread.sleep(1000L)
            println("Running in thread: [${Thread.currentThread().name}]")
        }
    }

}