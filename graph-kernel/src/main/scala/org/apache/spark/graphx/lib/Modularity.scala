// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.graphx.lib

import org.apache.spark.rdd.RDD

object Modularity {

  def run(
    nodes: RDD[(Long, Long)],
    edges: RDD[(Long, Long, Double)],
    isDirected: Boolean,
    partitionNum: Int = 1): Double = {
    0.0
  }
}
