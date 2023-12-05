import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j.Logger
import org.apache.log4j.Level

object Lession4 extends App{

    // Hide warning
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    // Create spark config
    val conf = new SparkConf().setAppName("Lession4").setMaster("local[*]")
    
    // Create spark context
    val sc = new SparkContext(conf)
    
    // Load data
    val data = sr.textFile("Spark/lession4/inputdata.txt")
    println(data.getClass.getName)
    println(data.getNumPartitions)
    // Create action
    data.forrach(println)
}