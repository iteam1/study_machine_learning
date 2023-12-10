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
title:String, val deparment:Deparment) extends Employee(firstName,lastName,title){

    override def fullName = s"$firstName $lastName, ${deparment.name} Manager"   
}

val company = new Deparment("Iteam1")

val jessie = new Employee(firstName="Jessie",
lastName="Ly", title="HR")

val denny = new Manager(firstName="Robby",
lastName="Dennis", title="Leader", deparment=company)

println(jessie.fullName)

println(denny.fullName)