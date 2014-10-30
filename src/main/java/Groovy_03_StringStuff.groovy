def stringVar = "Here is a simple string"

println 'reference to $stringVar' // reference to $stringVar

println "reference to $stringVar" // reference to Here is a simple string

println """Do you like
multiline
stuff?"""

/* Do you like
multiline
stuff?
 */

println "5".padLeft(8, '0') // 00000008
println "5".getClass() // class java.lang.String

println String.join(".", "11", "22", "33") // 11.22.33

//Regex stuff! =~ returns a matcher object
def regexMatcher = "cheesecake" =~ "cheese"
println regexMatcher.getClass() // class java.util.regex.Matcher
println regexMatcher.find() // true

// ==~ returns a boolean
def regexResult1 = "cheesecake" ==~ "cheese"
def regexResult2 = "cheesecake" ==~ /\w+/
println regexResult1 // false
println regexResult1.getClass() // class java.lang.Boolean
println regexResult2 // true