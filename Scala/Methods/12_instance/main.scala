println(3.isInstanceOf[Int])

println(3.isInstanceOf[Boolean])

println("3".isInstanceOf[String])

// supertype of string
println("3".isInstanceOf[CharSequence])

val g:Any = "Ice, Ice, Call me Maybe"

val h:String = g.asInstanceOf[String]

println(h)

def decide(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide(2))

println(decide("Hello"))

def decidePoorly(x:Any) = x.asInstanceOf[Int] + 10

println(decidePoorly(4))

println(decidePoorly("Zing!"))