class Account {
    def number

    def plus(a) {
        return number + a
    }

    def plus(Account a) {
        return number + a.number
    }
}

def test = new Account(number: 5)
println test.number
println test.getNumber()
test.setNumber(6)
println test.number
test.number = 7
println test.number
println test + 7
println test + new Account(number: 9)

class Bill {
    private number
    protected number2
    public number3
    static number4 = 5
    //def getNumber() { return number }
    //def setNumber(a) { number = a }

    static def staticMethod() { println "static" }
}

println "------------------------"
def test2 = new Bill(number: 9)
println test2.number
test2.number = 10
// NOTE: This does not appear to be intended behavior - there have been open groovy defects on this before


class AccountComposition {
    Account account
}

def ComposedAccount = new AccountComposition(account : null)
//println ComposedAccount.account.number
println ComposedAccount?.account?.number