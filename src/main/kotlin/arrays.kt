fun main(args: Array<String>){

    val majina= arrayOf("Wayne","joan",78.56,87,true)
    val countries= arrayOf("Kenya","Uganda")
    val myarr= arrayOf<Int>(4,10,77,2,45)

    myarr[1]=5

    println(myarr[1])
    println("My name is ${majina[0]}")

    val myarr2= myarr.sorted()
    println(myarr2)
    println("THe size of the array is ${myarr.size}")
    println("The last item on the array is ${myarr.last()}")
    println("The first item on the array is ${myarr.first()}")
}