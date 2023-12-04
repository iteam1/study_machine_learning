val a = 99
println(s"${a} luftballons floating in the summer sky")

println(s"${a+ 3} luftballons floating in the summer sky")

val ticketCost = 50
val bandName = "Psychedelic Furs"

println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f")

val percentIncrease = 20
val musicGenre = "New Wave"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f%n That's a $percentIncrease%% bump because everyone likes $musicGenre")

// smart string interpolation
println(f"""The $bandName%s tickets are probably $$$ticketCost%1.2f
 |That's a $percentIncrease%% bump because everyone likes $musicGenre""".stripMargin)
