
def a = 5
def b = 5.0

println a.getClass() // class java.lang.Integer
println b.getClass() // class java.math.BigDecimal

println 5 + 3     // 8
println 5.plus(3) // 8
println a.div(b)  // 1


Integer c1 = new Integer(7)
Integer c2 = new Integer(7)

println c1 == c2 // true
// Because c1 == c2 is equivalent to c1.equals(c2)

def age = 25
def number = age
def number2 = 25

println age.is(number) // true
println age.is(number2) // false

number++
println age
println number
