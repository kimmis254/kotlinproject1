fun main(args: Array<String>) {
    val sum={num1:Int,num2:Int -> num1+num2}
    val prod={num3:Int,num4:Int -> num3*num4}
    val diff={num5:Int,num6:Int -> num5-num6}
    println("6+4 = ${sum(6,4)}")
    println("6*4 = ${prod(6,4)}")
    println("6-4 = ${diff(6,4)}")
}