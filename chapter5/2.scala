class BankAccount {
  private var value = 0
  def deposit(a: Int) = {
    value += a 
  }
  def withdraw(a: Int) = {
    value -= a
  }
  def balance = value
}

val myAcct = new BankAccount()

println("My balance is: " + myAcct.balance)

