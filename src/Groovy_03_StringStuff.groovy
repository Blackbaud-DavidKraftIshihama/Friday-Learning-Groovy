def stringVar = "Here is a simple string"

println 'reference to $stringVar'

println "reference to $stringVar"

println """Do you like
multiline
stuff?"""



println "5".padLeft(8, '0')

//Regex stuff!
def regexMatcher = "cheesecake" =~ "cheese"
def regexResult1 = "cheesecake" ==~ "cheese"
def regexResult2 = "cheesecake" ==~ /\w+/
println regexMatcher.find()
println regexResult1
println regexResult2