// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.graphx.lib

import scala.reflect.ClassTag

import org.apache.spark.graphx.Graph

object WeightedPageRank {

  def setInitStrategy(strategy: Int): WeightedPageRank.type = {
    null
  }

  def run[VD: ClassTag](
      graph: Graph[VD, Double],
      numIter: Int,
      resetProb: Double = 0.15): Graph[Double, Double] = {
    null
  }

  def runUntilConvergence[VD: ClassTag](
      graph: Graph[VD, Double],
      tol: Double,
      resetProb: Double = 0.15): Graph[Double, Double] = {
    null
  }
}
