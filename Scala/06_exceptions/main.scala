import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
@BeanProperty val lastName:String,
val title:String = "Programmer"){
    // raise exception
    require(firstName.nonEmpty,"First Name can not be empty")
    require(lastName.nonEmpty,"Last Name can not be empty")
    require(title.nonEmpty,"title can not be empty")

    if(title.contains("Senior")|| title.contains("Junior")){
        throw new IllegalArgumentException("Title can not contain Junior or Senior")
    }

    // access the field (attribute of class by $)
    def fullName = s"$firstName $lastName"

    def changeLastName(ln:String) = new Employee(firstName, ln)

    def copy(firstName:String= this.firstName,
        lastName:String= this.lastName,
        title:String= this.title)= new Employee(firstName, lastName, title)
}

try{
    new Employee(firstName="Adam",lastName="",title="Engineer")    
}
catch{
    case iae:IllegalArgumentException => println(iae.getMessage)
}
finally{
    println("Continuing with our programm")
}


try{
    new Employee(firstName="John",lastName="Wick",title="Senior Engineer")    
}
catch{
    case iae:IllegalArgumentException => println(iae.getMessage)
}
finally{
    println("Continuing with our programm")
}

