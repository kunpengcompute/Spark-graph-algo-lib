name := "Spark-graph-algo-lib"

version := "0.1"

scalaVersion := "2.11.8"

lazy val commonSettings = Seq(
  libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.3.2" withSources(),
  libraryDependencies += "org.scalanlp" % "breeze_2.11" % "0.13.2" withSources(),
  libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % "2.3.2",
  libraryDependencies += "it.unimi.dsi" % "fastutil" % "8.3.1"
)

lazy val graphx_source = (project in file("Spark-graph-algo-lib"))
  .settings(commonSettings: _*)
  .settings(
    name := "sophon-graph-kernel-client",
    version := s"1.0.0",
    parallelExecution in Test:= false
  )

