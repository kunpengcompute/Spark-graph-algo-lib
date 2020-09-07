package org.apache.spark.graphx.lib

import scala.reflect.ClassTag

import org.apache.spark.rdd.RDD

object WeakCliqueEnumeration {

  def run[T: ClassTag](graph: RDD[(T, T)], maxIterations: Int, maxDegree: Int): (RDD[(Int, T)], RDD[(Int, Int)]) = {
    null
  }

}
