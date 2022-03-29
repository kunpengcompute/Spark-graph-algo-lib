// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */
package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object IncPageRank {
  def run(
      graph: RDD[(Long, Int, Array[Long], Array[Int], Double)],
      partNum: Int,
      numIter: Int,
      resetProb: Double): RDD[(Long, Double)] = {
    null
  }
}
