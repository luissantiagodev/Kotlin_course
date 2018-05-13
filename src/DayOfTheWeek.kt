import java.util.*

fun main (args : Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        0 -> println("Monday")
        1 -> println("Tuesday")
        2 -> println("Wednesday")
        3 -> println("Thursday")
        4 -> println("Friday")
        7 -> println("Saturday")
        6 -> println("Sunday")
        else ->{
            println("Cannot find the day")
        }
    }
}