// All variables are objects
def a = 5
def b = 5.0
println a.getClass() // class java.lang.Integer
println b.getClass() // class java.math.BigDecimal

// You can still use your regular old operators on them, but they refer to specific methods
println 5 + 3     // 8
println 5.plus(3) // 8
println a.div(b)  // 1

// Declaring a type for your variable will enforce that typing
Integer c1 = new Integer(7)
Integer c2 = new Integer(7)
//Integer c3 = new Object()

// == refers to .equals. Use is() for identity-checks.
println c1 == c2 // true
println c1.is(c2) // false

// Groovy will try to reuse references when possible
def age = 25
def number = age
def number2 = 25

println age.is(number) // true
println age.is(number2) // true

// ++ operator will make the variable point to a new reference
number++
println age // 25
println number // 26