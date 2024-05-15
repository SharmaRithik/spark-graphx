import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.graphx.{Graph, VertexRDD}
import org.apache.spark.graphx.util.GraphGenerators

object PageRankExample {
  def main(args: Array[String]): Unit = {
    // Set up the Spark configuration and context
    val conf = new SparkConf().setAppName("PageRankExample").setMaster("local")
    val sc = new SparkContext(conf)

    // Create a graph with "age" as the vertex property. Here we use a simple graph for demonstration.
    val graph: Graph[Double, Int] = GraphGenerators.logNormalGraph(sc, numVertices = 100).mapVertices((id, _) => id.toDouble)

    // Run PageRank
    val ranks = graph.pageRank(tol = 0.0001).vertices

    // Print the result
    println("Vertex ID : PageRank")
    ranks.collect.foreach { case (id, rank) => 
      println(f"$id%d : $rank%.2f")
    }

    // Stop the Spark context
    sc.stop()
  }
}

