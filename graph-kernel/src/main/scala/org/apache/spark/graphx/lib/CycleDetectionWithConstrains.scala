// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object CycleDetectionWithConstrains {

  def run(
      edgeInfo: RDD[(Long, Long, Double)],
      part: Int,
      minLoopLen: Int,
      maxLoopLen: Int,
      minRate: Double,
      maxRate: Double): RDD[Array[Long]] = {
    null
  }
}
