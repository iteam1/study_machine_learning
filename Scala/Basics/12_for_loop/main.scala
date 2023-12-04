var result = ""
for (a <- 1 to 100){
    result = result + a
    if (a < 100) result = result + ","
}
println(result)

// create a list of int
val xs = List(1,2,3,4)
var result2 = List[Int]() // create empty list of int
for (a <- xs){
    result2 = result2 :+ (a+1) // append element into list
}
println(result2)

// functional for loop
val xy = List(1,2,3,4)
val result3 = for (a <- xs) yield (a + 1)
print(result3)
