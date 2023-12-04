val lyrics = "I see trees or green, \n" +
            "Red roses too, \n" + 
            "I see them bloom, \n" +
            "For me and you, \n" +
            "And i think to myself, \n" +
            "What a wonderful world"

println(lyrics)

// smart string
val smart_lyrics = """I see trees or green
                    |Red roses too 
                    |I see them bloom
                    |For me and you
                    |And i think to myself
                    |What a wonderful world""".stripMargin

println(smart_lyrics)

// smart string 2
val smart_lyrics_2 = """I see trees or green
                    @Red roses too 
                    @I see them bloom
                    @For me and you
                    @And i think to myself
                    @What a wonderful world""".stripMargin('@')

println(smart_lyrics_2)

val message = "We are meeting on June 13th of this year, and having lunch at 12:30PM"
val regex = """(\s|[0-9]?[0-9]:[0-5][0-9]\s*(AM|PM))""".r
println(regex.findAllIn(message).toList)