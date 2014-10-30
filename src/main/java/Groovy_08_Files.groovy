import java.io.File

println args
println args.size()
//println args[0]

def test = new File(".")
test.eachFile({a -> println a})
assert test.isDirectory()

def test2 = new File("Groovy_08_Files.groovy")
assert test2.exists()
test2.eachLine({a -> println a})
println test2.getPath()
println test2.getAbsolutePath()
println test2.getText()

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