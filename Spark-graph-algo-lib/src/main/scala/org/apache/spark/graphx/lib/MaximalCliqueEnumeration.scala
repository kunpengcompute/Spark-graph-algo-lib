package org.apache.spark.graphx.lib

import scala.reflect.ClassTag
import org.apache.spark.rdd.RDD

object MaximalCliqueEnumeration {

  def run[T: ClassTag](
    graph: RDD[(T, T)],
    minK: Int,
    maxDegree: Int,
    repartition: Int): (RDD[(Int, T)], RDD[(Int, String)]) = {
    null
  }

}
