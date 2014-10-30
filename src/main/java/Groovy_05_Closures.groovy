// Basic closures
def closure = {a, b, c -> a + b + c}
println closure(1, 2, 3) // 6
println closure.call("1", "2", "3") // 123
println closure.getClass() // class Groovy_05_Closures$_run_closure1

// You can enforce certain inputs on your closure
def closure2 = {String a -> println a}
//closure2(new Object())
closure2("hi") // hi
closure2 "hi" // hi

// Closures are good for certain list methods that take a closure as an argument
[1, 2, 3, 4, 5].each({a -> println a})
/* 1
2
3
4
5 */

def newList = [1, 2, 3, 4, 5].findAll({a -> a % 2 == 1})
println newList // [1, 3, 5]

// Closures can be arguments to closures
def composition = {a, b -> a(b)}
composition(closure2, "hi") // hi

// When a closure is dynamically interpreted in a string, it will be executed"
println "${closure(1, 2, 3)}" // 6
println "${closure2.getClass()}" // class Groovy_05_Closures$_run_closure2
println "${ {a -> a + 5} 13 }" // 18