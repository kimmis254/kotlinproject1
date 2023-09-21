package classes

class cars (var brand:String,var model:String,var year:Int)

fun main(args: Array<String>) {
    val cl = cars("Ford","Mustang",2001)
    val cl1 = cars("Toyota","Corolla",2031)
    val cl2 = cars("Vw","Punda",2021)
    println(cl1.brand)
    println(cl2.brand)
}