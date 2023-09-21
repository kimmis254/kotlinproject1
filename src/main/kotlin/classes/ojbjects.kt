package classes

class objects {
    var brand = ""
    var model = ""
    var number = 0
}

fun main(args: Array<String>) {
    val cl=objects()
    cl.brand="Ford"
    cl.model="Mustang"
    cl.number=2003
    println(cl.brand)
    println(cl.model)
    println(cl.number)
}