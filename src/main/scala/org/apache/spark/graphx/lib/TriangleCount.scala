package org.apache.spark.graphx.lib


import scala.reflect.{ClassTag, classTag}
import org.apache.spark.graphx.Graph

object TriangleCount {

  def run[VD: ClassTag, ED: ClassTag](graph: Graph[VD, ED]): Graph[Int, ED] = {
    null
  }

  def runPreCanonicalized[VD: ClassTag, ED: ClassTag](canonicalGraph: Graph[VD, ED]): Graph[Int, ED] = {
    null
  }

}
