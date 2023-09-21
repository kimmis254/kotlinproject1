package classes

open class MobileMoneyAccount(val accountnumber:String, var balance:Double){
    fun deposit(amount:Double){
        balance +=amount
    }
    open fun withdraw(amount:Double){
        if(balance>=amount){
            balance-=amount
        }else{
            println("Insufficient balance")
        }
    }
    fun checkbalance():Double{
        return balance
    }
}

class MpesaAccount(accountnumber: String,balance: Double,val phoneNumber:String):MobileMoneyAccount(accountnumber,balance){
    fun sendmoney(recipient:MpesaAccount,amount:Double){
        if(balance>=amount){
            balance-=amount
            recipient.deposit(amount)
            println("sent $amount KES to ${recipient.phoneNumber}")
        }else{
            println("Insufficient amount")
        }
    }

    override fun withdraw(amount: Double) {
        if(balance>=amount+10.0){
            balance-=amount+10.0
            println("Withdraw $amount KES (Charges 10 KES Fee")
        }else{
            println("Insufficient balance")
        }
    }
}

fun main(args: Array<String>) {
    val erick=MpesaAccount("123456",1000.0,"254745738345")
    val joan=MpesaAccount("789101",500.0,"254745738211")
    erick.sendmoney(joan,200.0)
    println("Erick balance : ${erick.checkbalance()} KES")
    println("Joan balance : ${joan.checkbalance()} KES")

    erick.withdraw(300.0)
    println("Erick balance : ${erick.checkbalance()} KES")
}