// scala -cp . main.scala

class Employee(val firstName:String, var lastName:String)

val ada = new Employee("Ada","LoveLace")

println(ada)

println(ada.firstName) // we don't know this is method parameterless or attribute

ada.lastName = "Countness of LoveLace"

println(ada.lastName)