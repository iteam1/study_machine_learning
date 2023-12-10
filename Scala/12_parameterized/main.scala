case class Box[T](t:T)

class Department(val name:String)

class Manager(val firstName:String, val lastName:String, val title:String)

val intBox = new Box(1) // Box[Int]

val intBox2:Box[Int] = Box(1) // Box[Int]

val intBox3 = Box(1):Box[Int] // Coercion Box[Int]

val inResult:Int = intBox3.t

val stringBox = new Box("Hello")

val stringBoxExplicit = Box[String]("Hello")

val managerBox = Box[Manager](new Manager("Katty","Sierra","Programmer"))

val doubleBoxBox = Box(Box(4.0))

println(doubleBoxBox.t)

println(doubleBoxBox.t.t)

case class Couple[A,B](first:A, second:B)

val coupleIntString = new Couple(10,"Scala") // Couple[Int,String]

val coupleIntString2:Couple[Int, String] = Couple(10,"Scala") // Couple[Int, String]

val coupleStringString = Couple("One","Two") // Couple[String,String]

val coupleDoubleInt = Couple(30.123, 3) // Couple[Double, Int]

val coupleStringCoupleDoubleInt = Couple("One",Couple(22.2,3))

println(coupleStringCoupleDoubleInt.second.first)