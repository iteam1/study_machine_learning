// java format
val str = String.format("This is a %s","Test")
println(str)

// scala format
val str2 = "This is a %s".format("Test")
println(str2)


println("Because you're %s, %s, %s times a lady".format("Three","Twince","Once"))

// order of argument
println("Because you're %3$s, %2$s, %1$s times a lady".format("Three","Twince","Once"))

import java.time._

println("We will be eating lunch %1$tB the %1$te in the year %1$tY".format(LocalDate.now))

printf("We will be eating lunch %1$tB the %1$te in the year %1$tY",LocalDate.now)

// smart string 2
val lyrics = """I see trees or %s
                    @%s roses too 
                    @I see them bloom
                    @For me and you
                    @And i think to myself
                    @What a wonderful world""".stripMargin('@').format("green","red")

println(lyrics)