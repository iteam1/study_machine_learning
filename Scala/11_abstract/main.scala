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
}

class Department(val name:String)

class Manager(firstName:String, lastName:String, title:String, deparment:Department)

val mathematics = new Department("Mathematics")