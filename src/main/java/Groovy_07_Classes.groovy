import groovy.transform.ToString

// Default way of declaring a class - members are public by default
class Account {
    def number

    def plus(a) {
        return number + a
    }

    def plus(Account a) {
        return number + a.number
    }
}

// You can access member fields with get/set without needing to explicitly declare.
// Some member fields exist without needing to declare them.
def test = new Account(number: 5)
println test.getClass() // class Account
println test.class // class Account
println test.getNumber() // 5
println test.number // 5
test.setNumber(6)
println test.number // 6
test.number = 7
println test.number // 7

// Adding the plus method overrides the + operator
println test + 7 // 14
println test + new Account(number: 9) // 16

// You can declare access-levels for your variables and still have static methods/variables
class Bill {
    private number
    protected number2
    public number3
    static number4 = 5

    static def staticMethod() { println "static" }
}

// Private variables still appear to be public. Research says this is not intended behavior and must be a groovy defect.
println "------------------------"
def test2 = new Bill(number: 9)
println test2.number // 9
test2.number = 10

// Classes composed with objects of classes - where does the chain end?
class AccountComposition {
    Account account
}

// Tired of doing a null check at each stage? Just use the ?. operator
def ComposedAccount = new AccountComposition(account : null)
//println ComposedAccount.account.number
println ComposedAccount?.account?.number // null