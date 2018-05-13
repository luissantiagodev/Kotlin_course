

fun main(args : Array<String>){
    fortuneCookie()
}

fun fortuneCookie() : String{
    val phrases = arrayOf("You will have a great day!" , "Things will go well for you today." , "Enjoy a wonderful day of success." , "Today is a good day for exercising restraint." , "Take it easy and enjoy life!" , "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday")
    val birthday = readLine()
    val number : Int? = birthday!!.toIntOrNull()
    println(number)
    if (number != null){
        println(phrases[number / phrases.size])
        return phrases[number / phrases.size]
    }
    return ""
}