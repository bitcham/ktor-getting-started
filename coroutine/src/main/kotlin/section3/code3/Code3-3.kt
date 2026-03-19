package section3.code3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.IO){
        launch{
            println("Running in thread: [${Thread.currentThread().name}]")
        }

        launch{
            println("Running in thread: [${Thread.currentThread().name}]")
        }

        launch{
            println("Running in thread: [${Thread.currentThread().name}]")
        }
    }
}