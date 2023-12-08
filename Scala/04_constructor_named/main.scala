import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
    @BeanProperty var lastName:String,val title:String="Programmer"){
        
        // Atypical form with side effect with equal sign or not
        // def this (firstName:String, lastName:String) = {
        //     this(firstName, lastName, "Programmer") // this must in first name
        //     println("Side effect")
        // }

        // Atypical form with body
        // def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")}

        // Typical form constructor
        // def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")
        }

val ada = new Employee("Ada","Lovelace")
ada.lastName = "Bryon, Countess of Lovelace"

// constructor named, default parameters
val dennis = new Employee(lastName="Ritchie",firstName="Dennis")
println(s"This first name is ${dennis.firstName}")
println(s"The last name is ${dennis.lastName}")