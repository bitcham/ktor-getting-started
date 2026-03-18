package section2.code2

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>(CoroutineName("runBlockingCoroutine")) {
    println("[${Thread.currentThread().name}] runBlocking coroutine start")

    launch(CoroutineName("launchCoroutine")) {
        println("[${Thread.currentThread().name}] launch coroutine start")
    }
}