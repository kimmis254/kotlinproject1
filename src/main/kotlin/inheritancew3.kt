open class Myparentclass {
    val x=5
}

class Mychildclass:Myparentclass(){
    fun Myfunction(){
        println(x)
    }
}

fun main(args: Array<String>) {
    val Myobj = Mychildclass()
    Myobj.Myfunction()
}