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

    override def equals(x:Any):Boolean = {
        if (!x.isInstanceOf[Employee]) false
        else{
            val other = x.asInstanceOf[Employee]
            // other.firstName.equals(this.firstName) &&
            other.firstName == this.firstName &&
            // other.lastName.equals(this.lastName) &&
            other.lastName == this.lastName &&
            // other.title.equals(this.title)
            other.title == this.title
        }
    }

    override def hashCode:Int = {
        var result = 19
        result = 31 * result + firstName.hashCode
        result = 31 * result + lastName.hashCode
        result = 31 * result + title.hashCode

        return result
    }

    override def toString = s"Employee($firstName, $lastName, $title)"
}

val ada = new Employee("Byron","Lovelace","Programmer")

val otherada = new Employee("Byron","Lovelace","Programmer")

println(otherada.equals(ada))

println(otherada == ada)

println(otherada != ada)

println(otherada eq ada)

val evenotherada = otherada

println(evenotherada eq otherada)

println(otherada.hashCode == ada.hashCode)

println(evenotherada.hashCode != otherada.hashCode)

println(ada)