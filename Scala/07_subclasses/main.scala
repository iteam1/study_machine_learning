class Employee(val firstName:String, val lastName:String, val title:String){
    def fullName = s"$firstName $lastName"

    def copy(firstName:String = this.firstName,
            lastName:String = this.lastName,
            title:String = this.title) = {
                new Employee(firstName, lastName, title)
            }
}

class Deparment(val name:String)

// no val or var define for inheritance fields
class Manager(firstName:String, lastName:String,
title:String, val deparment:Deparment) extends Employee(firstName,lastName,title)


val mathemtics = new Deparment("Mathematics")

// reference instance point ot Manager class
val alan:Manager = new Manager("Alan","Turing","Mathematican", mathemtics)
println(alan.deparment.name)

val alanEmployee:Employee = alan

println(alan.firstName)
println(alanEmployee.firstName)