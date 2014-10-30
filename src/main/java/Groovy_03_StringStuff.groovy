def stringVar = "Here is a simple string"

println 'reference to $stringVar'

println "reference to $stringVar"

println """Do you like
multiline
stuff?"""

println "5".padLeft(8, '0')
println "5".getClass()

//Regex stuff!
def regexMatcher = "cheesecake" =~ "cheese"
println regexMatcher.getClass()
println regexMatcher.find()

def regexResult1 = "cheesecake" ==~ "cheese"
def regexResult2 = "cheesecake" ==~ /\w+/
println regexResult1
println regexResult1.getClass()
println regexResult2