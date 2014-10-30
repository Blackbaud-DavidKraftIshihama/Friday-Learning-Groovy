def params(a, b, c) {
    return a + b + c
}

println params(1, 2, 3)
println params("a string", 56, 244.56)

def typeParams(int a, int b, int c) {
    return a + b + c
}

println typeParams(1, 2, 3)
//println typeParams("1", "2", "3")

def defaultParams(a, b=2, c=3) {
    a + b + c
}

println defaultParams(1)
println "${defaultParams(100)}"
//println defaultParams

def variableName = ""
//def stringVarParams(a = "$variableName") <-- This doesn't work because variableName is out of scope