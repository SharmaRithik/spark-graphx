import org.apache.spark._
import org.apache.spark.graphx._
import org.apache.spark.rdd.RDD

object MainApp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
    val sc = new SparkContext(conf)

    println("Spark and GraphX setup is working correctly!")

    // Your GraphX or Spark code goes here

    sc.stop()
  }
}
