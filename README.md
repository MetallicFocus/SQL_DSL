# SQL_DSL

## DSL based on SQL language

### How to run the DSL and test the language

The DSL has the extension `.sql_dsl`
In order to test the language, the following needs to be done:

1) Open Eclipse IDE and run a new session inside by using "run as eclipse application"
2) Create a Java project with a an empty file having `.sql_dsl` extension
3) Try commands from below

Note1: Some commands from below generate warnings on purpose in order to test the language capability
Note2: For code generation, up until now we have covered `CREATE DATABASE`, `DROP TABLE`, `TRUNCATE TABLE` and `DELETE TABLE`

### Example of commands that can be executed on the DSL

`CREATE DATABASE NameX`

`CREATE DATABASE NAME_X`

`CREATE TABLE Table1(column1 char PRIMARY KEY(column1))`

`DROP TABLE Table1`

`CREATE TABLE Table2(column1 char PRIMARY KEY(column1), column2 char, column3 int NOT NULL)`

`SELECT column1, column1 FROM Table2 WHERE column1 < column2`

`SELECT column1, column3, column2 FROM Table2 WHERE column1 < column2 AND column2 = #test3# OR column2 = 500`

`SELECT AVG(column2) FROM Table2 WHERE column2 < 500`

`DELETE FROM Table1 WHERE column1 LIKE column2`

`UPDATE Table1 SET column1 = 1,column2 = #SS# WHERE column1 < column2 AND column2 = #test3# OR column2 = 500`

`SELECT column1 FROM Table2 WHERE column1 != #asd#`

`TRUNCATE TABLE Table1, Table2`

`DROP TABLE Table1, Table2`
