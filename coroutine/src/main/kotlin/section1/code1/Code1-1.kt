package section1.code1

fun main(){
    println("[${Thread.currentThread().name}] start")
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] end")
}