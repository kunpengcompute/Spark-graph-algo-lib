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

object BFS {

  def run[VD: ClassTag, ED: ClassTag](
      graph: Graph[VD, ED],
      sourceID: Long,
      isDirected: Boolean,
      depthLimit: Int): Graph[(Int, Array[Long]), ED] = {
    null
  }
}
