package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object CycleDetectionWithConstrains {
  def run(edgeInfo: RDD[(Long, Long, Double)],
          part: Int,
          minLoopLen: Int,
          maxLoopLen: Int,
          minRate: Double,
          maxRate: Double): RDD[Array[Long]] = {
    null
  }

}
