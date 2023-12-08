import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
    @BeanProperty var lastName:String,val title:String){
        
        // Atypical form with side effect with equal sign or not
        def this (firstName:String, lastName:String) = {
            this(firstName, lastName, "Programmer") // this must in first name
            println("Side effect")
        }
        // Atypical form with body
        // def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")}

        // Typical form constructor
        // def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")
        }

val ada = new Employee("Ada","Lovelace")
println(ada.firstName)

ada.lastName = "Bryon, Countess of Lovelace"

println(ada.lastName)

println(ada.title)