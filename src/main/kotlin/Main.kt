fun main(){
    var account= Account(1234567899,Joan Muthoni,500,000.00)
    account.deposit(100,000)
    println(depo)
    deposit()
    char()
}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)
open class Account(number: Int,name:String,balance:Int {
    fun depositamount(increment: Int)Double {
        depo++
    }

    fun withdrawamount(decrement: Int)Double {
        withdraw--
    }

    fun details() {
        println(details)
    }
}



//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points

class Savings(withdrals:Int)
  for(amount in 1


//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
fun productshopping(name:String,weight:String,price:string){
    when (shopping){
        "Tomatoes","Onions"-> println("Groceries")
        "Sanitizer","Soap","Detegence"-> println("Hygine")
        else->println("other")
    }

//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return “bnn”(2 points)
     fun char(){
         var name = "banana"
         var n = name[0].toString()+ name[2]+ name[4]
         println(n)

