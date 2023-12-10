class Employee(val firstName:String, val lastName:String, val title:String){
    def fullName = s"$firstName $lastName"

    def copy(firstName:String = this.firstName,
            lastName:String = this.lastName,
            title:String = this.title) = {
                new Employee(firstName, lastName, title)
            }
}

// case class Deparment(val name:String)
case class Deparment(name:String){
    override def toString = s"Deparment: $name"
}

// no val or var define for inheritance fields
class Manager(firstName:String, lastName:String,
title:String, val deparment:Deparment) extends Employee(firstName,lastName,title)

val toys = new Deparment("Toys")

println(toys)

val toys2 = new Deparment("Toys")

println(toys2)

println(toys == toys2)

println(toys.hashCode)
println(toys.hashCode == toys2.hashCode)

// when we push the case in front the class, the new is option
val hardware = toys.copy(name="Hardware")
println(hardware)

// pattern matching
val name = toys match{
    case Deparment(n) => n
    case _ => "Unknown"
}

println(name)

val Deparment(name2) = toys
println(name2)