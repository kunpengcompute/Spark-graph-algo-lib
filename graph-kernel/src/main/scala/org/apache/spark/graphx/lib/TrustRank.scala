// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.graphx.lib

import scala.reflect.ClassTag

import org.apache.spark.graphx.{Graph, VertexId}
import org.apache.spark.rdd.RDD

object TrustRank {

  def runUntilConvergence[VD: ClassTag](
      graph: Graph[VD, Double],
      seeds: RDD[VertexId],
      tol: Double,
      resetProb: Double = 0.15): Graph[Double, Double] = {
    null
  }

  def run[VD: ClassTag](
      graph: Graph[VD, Double],
      seeds: RDD[VertexId],
      numIter: Int,
      resetProb: Double = 0.15): Graph[Double, Double] = {
    null
  }

}
