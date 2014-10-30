// Default method declaration - no typing is enforced
def params(a, b, c) {
    return a + b + c
}

println params(1, 2, 3) // 6
println params("a string", 56, 244.56) // a string56244.56

// You can enforce certain inputs in your method
def typeParams(int a, int b, int c) {
    return a + b + c
}

println typeParams(1, 2, 3) // 6
//println typeParams("1", "2", "3")

// Default params are a thing. Also note that without a return statement the return result is the result of the last executed statement
def defaultParams(a, b=2, c=3) {
    a + b + c
}

println defaultParams(1) // 6
println "${defaultParams(100)}" // 105
//println defaultParams

// Mind your scope
def variableName = ""
//def stringVarParams(a = "$variableName") <-- This doesn't work because variableName is out of scope