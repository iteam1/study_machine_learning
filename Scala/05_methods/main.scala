import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
@BeanProperty val lastName:String,
val title:String = "Programmer"){
    // access the field (attribute of class by $)
    def fullName = s"$firstName $lastName"

    def changeLastName(ln:String) = new Employee(firstName, ln)

    def copy(firstName:String= this.firstName,
        lastName:String= this.lastName,
        title:String= this.title)= new Employee(firstName, lastName, title)
}

val ada = new Employee("Ada","Lovelace")
println(ada.fullName)

val newAda = ada.changeLastName("Countess Lovelace")
println(newAda.fullName)

val dennis = new Employee(firstName="Ritchie",lastName="Dennis")
println(dennis.fullName)

val newDennis = dennis.copy(lastName="Denny")
print(newDennis.fullName)
