fun main(args: Array<String>) {
    println(random("Magical"))
    println(checkPassword(arrayOf("smali4730")))
 findMultiples(arrayOf())
    println(deposit(450.00))
    println(withdraw(650.00))
    println(withdrawals(7))
    println(userDetails(40016352,"Bery Achieng",5000.00))
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(name:String):Any{
return name[0]
    return name[-1]
    return name.length
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun checkPassword(password:Array<Any>):String{
    var j=0
        if(j>=8 && j<=16){
            return("Valid Passowrd")
        }
    else if(j>=0){
        return("Password is valid")
        }
    else{
        return("Invalid password")
        }

}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun findMultiples(number:Array<Int>){
    val i=0
    while(i<=1 && i<=1000){
        if(i%6===0){
            println (i)
        }
        else if(i%8===0){
            println(i)
        }
        else if(i%6===0 && i%8===0){
            println("Bingo")
        }
    }
}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
open class CurrentAccount(var accountnumber:Float,var accountname:String,var balance:Double)
fun deposit(amount:Double):Double{
    var sum = 0.00
    for (num in amount) {
        return sum+=
    }
}
fun withdrawCash(amount:Double){
var balance=0.00
    for(amount in balance){
        return balance-=amount
    }
}
fun userDetails(accountnumber:Int,accountname:String,balance:Double){
println("Account number x with balance y is operated by z")
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
class SavingsAccount(var accountnumber:Int,var accountname: String,var balance: Double,var withdrawals:Int)
    fun withdrawals(amount:Int){
        var k=0
        if(k<=4){
           println("can proceed to withdraw")
        }
        else if(k<=4){
            k++
        }
        }


