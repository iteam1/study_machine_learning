import scala.beans.BeanProperty

abstract class Person{
    def firstName:String
    def lastName:String
}

class Employee(@BeanProperty val firstName:String,
    @BeanProperty val lastName:String,
    val title:String = "Programmer") extends Person{

        require(firstName.nonEmpty, "First Name cannot be empty")
        require(lastName.nonEmpty, "Last Name cannot be empty")
        require(title.nonEmpty, "Title cannot empty")
    
    def fullname = s"Employee=$firstName $lastName"
}

class Department(val name:String)

class Manager(@BeanProperty val firstName:String,
    @BeanProperty val lastName:String,
    val title:String = "Programmer", department:Department) extends Person{

        require(firstName.nonEmpty, "First Name cannot be empty")
        require(lastName.nonEmpty, "Last Name cannot be empty")
        require(title.nonEmpty, "Title cannot empty")
    
    def fullname = s"Manager=$firstName $lastName"
}

val mathematics = new Department("Mathematics")

val alan = new Employee(firstName="Alan",
                        lastName="Turing",
                        title="Professor")

val alanManager:Manager = new Manager(firstName="Alan",
                        lastName="Turing",
                        title="Professor",
                        department = mathematics)

val alanPerson:Person = alan