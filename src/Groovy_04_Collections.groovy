//Lists

def a = [1, 2, 3, 4, 5]
println a.getClass()

ArrayList b = 1..5
println b
println a == b
println b.getClass()

LinkedList c = 1..<6
println c.getClass()
println c == b
println c == a

c << 6
println c
println c+[7, 8]
println c-6

def d = [1, 2, 3, 4, 5] as LinkedList
println d.getClass()


println 1..5
println "${1..5}"

// Maps
def emptyMap = [:]
println emptyMap.getClass()
println emptyMap.size()

def method() { return 20 }
def map2 = [a        : 5,
        "b"          : 5,
        6            : "flip",
        ( method() ) : method() ]
println map2
println map2[20]

//BEWARE when interacting with Java generics:
ArrayList<Integer> intList = ["27", new Object(), 56.788]
println(intList)