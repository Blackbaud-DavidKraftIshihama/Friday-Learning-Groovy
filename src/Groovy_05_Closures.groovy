def closure = {a, b, c -> a + b + c}
println closure(1, 2, 3)
println closure.call(1, 2, 3)
println closure.getMetaClass()
println closure.class

def closure2 = {String a -> println a}
//closure2(new Object())
closure2("hi")
closure2 "hi"

[1, 2, 3, 4, 5].each({a -> println a})
def newList = [1, 2, 3, 4, 5].findAll({a -> a % 2 == 1})
println newList

def composition = {a, b -> a(b)}
composition(closure2, "hi")

println "${closure(1, 2, 3)}"
println "${closure.class}"
println "${closure.getClass()}"


println "${ {a -> a + 5} 13 }"