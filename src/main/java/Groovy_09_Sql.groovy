import groovy.sql.Sql

def DB = 'jdbc:h2:tcp://localhost/~/test'
def user = 'sa'
def password = ''
def driver = 'org.h2.Driver'

// Access an sql instance by calling newInstance
def sql = Sql.newInstance(DB, user, password, driver)
println sql.getClass() // class groovy.sql.Sql

// Execute statements with execute - you can parameterize your queries by adding ? and additional args
sql.execute("create table groovy_presents (ID int, value varchar(255))")
sql.execute("insert into groovy_presents(ID, value) values(23, 'muffin')")
sql.execute("insert into groovy_presents(ID, value) values(?, ?)", 25, "a value")

// You can call eachRow on the results of a select statement and use a closure to iterate over the rows
sql.eachRow('select * from groovy_presents') { row -> println row.ID
    println row.value
    println row.getClass() // Funny story - You can't use .class here. It interprets it as a column.
}
/*
23
muffin
class com.sun.proxy.$Proxy4
25
a value
class com.sun.proxy.$Proxy4
*/

sql.execute("drop table groovy_presents")