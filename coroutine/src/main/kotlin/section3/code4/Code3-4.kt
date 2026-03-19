package section3.code4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Default) {

        launch{
            println("Running in thread: [${Thread.currentThread().name}]")
        }

        launch{
            println("Running in thread: [${Thread.currentThread().name}]")
        }
    }

}