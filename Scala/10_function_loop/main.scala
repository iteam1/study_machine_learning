val result = (1 to 100).reverse.mkString(",")
println(result)

val revert = (100 to 1 by -1).mkString(",")
println(revert)

println((100 to 1 by -2).mkString(","))