// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */
package org.apache.spark.graphx.lib

import org.apache.spark.ml.linalg.Vector
import org.apache.spark.rdd.RDD


final case class Params(
    directed: Boolean = true,
    weighted: Boolean = false,
    p: Double = 1.0,
    q: Double = 1.0,
    walkLength: Int = 80,
    numWalks: Int = 10,
    iter: Int = 10,
    dim: Int = 128,
    window: Int = 20
)

object Node2Vec {
  def run(
      edgeList: RDD[(Long, Long, Double)],
      userParams: Params
  ): RDD[(Long, Vector)] = {
    null
  }
}
