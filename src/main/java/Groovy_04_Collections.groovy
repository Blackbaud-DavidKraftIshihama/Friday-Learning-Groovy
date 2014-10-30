//Lists

// Groovy's way of initializing a list
def a = [1, 2, 3, 4, 5]
println a.getClass() // class java.util.ArrayList

// You can specify ArrayList or LinkedList and still have it work fine
ArrayList b = 1..5
println b // [1, 2, 3, 4, 5]
println a == b // true
println b.getClass() // class java.util.ArrayList

LinkedList c = 1..<6
println c.getClass() // class java.util.LinkedList
println c == b // true
println c == a // true

// Some sample list operators
c << 6
println c // [1, 2, 3, 4, 5, 6]
println c + [7, 8] // [1, 2, 3, 4, 5, 6, 7, 8]
println c - 6 // [1, 2, 3, 4, 5]

// You don't have to declare the variable a linked list to get a linked list
def d = [1, 2, 3, 4, 5] as LinkedList
println d.getClass() // class java.util.LinkedList

// Dynamic string execution
println "${1..5}" // [1, 2, 3, 4, 5]

// Maps
def emptyMap = [:]
println emptyMap.getClass() // class java.util.LinkedHashMap
println emptyMap.size() // 0

// Defining a method here for use in key/value mapping later
def method() { return 20 }

// When inserting keys, expressions more complicated than literals must be surrounded in parentheses
def map2 = [     "a" : 5,
                   b : 5,
                   6 : "flip",
        ( method() ) : method() ]

println map2 // [a:5, b:5, 6:flip, 20:20]
println map2[20] // 20
println map2.b // 5

// BEWARE when interacting with Java generics:
ArrayList<Integer> intList = ["27", new Object(), 56.788]
println(intList) // [27, java.lang.Object@2d3379b4, 56.788]