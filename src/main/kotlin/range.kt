fun main(args: Array<String>) {
    println("Number ranges")

        for(num in 2 .. 10) {
            println("The range numbers : $num")

    }
    for(char in 'a' .. 'f'){
        println("The range of characters : $char[")
    }
    println(3+3)
    println(12E4)
  val x=20
    val greetings = if(x>18){
        println("Good morning")
    }
    else{
        println("Good evening")
    }
    var z=0
    while(z<20){
        if(z==5){
            z++
            continue
        }
        println(z)
        z++
        }
    var cars = arrayOf("Volvo","BMW","Toyota")
    if ("Volvo" in cars)
    {
        println("It exists")
    }
    else{
        println("FAKE")
    }
    for (nums in 5..15) {
        if (nums == 10) {
            continue
        } else {
            println(nums)
        }
    }
    }