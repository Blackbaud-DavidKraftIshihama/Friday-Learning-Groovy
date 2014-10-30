import java.io.File

// Accessing commandline args
println args // []
println args.size() // 0
//println args[0]

// You can do file i/o by using java.io.File
def test = new File(".")
test.eachFile({a -> println a}) // .\Groovy_00_JavaHelloWorld.groovy...
assert test.isDirectory()

// Groovy has augmented java.io.File with a few useful methods
def test2 = new File("Groovy_08_Files.groovy")
assert test2.exists()
test2.eachLine({a -> println a}) // Prints out the contents of this file. Do you need to know?
println test2.getPath() // Groovy_08_Files.groovy
println test2.getAbsolutePath() // c:\Code\groovy-presentation\src\main\java\Groovy_08_Files.groovy
println test2.getText() // Prints out the contents of this file again.

// It's pretty easy to create and delete files this way.
def test3 = new File("notexists")
assert test3.exists() == false
test3.createNewFile()
assert test3.exists()
test3.delete()
assert test3.exists() == false

/* Other new methods:

mkdir
append
eachFileRecurse */