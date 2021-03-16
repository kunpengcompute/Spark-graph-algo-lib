// scalastyle:off header.matches
/*
 * This file to You under the Apache License, Version 2.0;
 * you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package org.apache.spark.graphx.lib

import scala.reflect.ClassTag

import org.apache.spark.rdd.RDD

object WeakCliqueEnumeration {

  def run[T: ClassTag](
    graph: RDD[(T, T)],
    maxIterations: Int,
    maxDegree: Int): (RDD[(Int, T)], RDD[(Int, Int)]) = {
    null
  }
}
