import java.util.*

fun main (args : Array<String> ){
    greeting(10)
}


fun greeting(hour : Int){
    when {
        hour > 24 -> return
        hour < 12 -> println("Good morning kotlin")
        else -> println("Good night kotlin")
    }
}