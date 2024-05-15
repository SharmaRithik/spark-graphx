name := "Spark-GraphX-Project"

version := "0.1"

scalaVersion := "2.12.10"  // Use an appropriate Scala version compatible with your Spark version

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.1.1",   // Spark Core library
  "org.apache.spark" %% "spark-graphx" % "3.1.1", // Spark GraphX library
  "org.apache.hadoop" % "hadoop-common" % "3.2.0" // Hadoop Common library
)
