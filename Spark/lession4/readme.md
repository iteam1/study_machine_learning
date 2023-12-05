Spark enviroment -> Spark context (sc) -> Spark RDD (immutable data)

        val data = sc.parallelize(Seq(1,2,3,4,5,6,7))
        data.foreach(println)

How to create RDDs
- Load data from storage
- Spark Driver: sc.parallelize
- Other RDD