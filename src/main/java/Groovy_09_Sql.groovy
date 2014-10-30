import groovy.sql.Sql

def DB = 'jdbc:h2:tcp://localhost/~/test'
def user = 'sa'
def password = ''
def driver = 'org.h2.Driver'

def sql = Sql.newInstance(DB, user, password, driver)
println sql.getClass()

sql.execute("create table groovy_presents (ID int, value varchar(255))")
sql.execute("insert into groovy_presents(ID, value) values(23, 'muffin')")
sql.execute("insert into groovy_presents(ID, value) values(?, ?)", 25, "a value")

sql.eachRow('select * from groovy_presents') { row -> println row.ID; println row.value; }

sql.execute("drop table groovy_presents")