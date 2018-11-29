package me.nicofisi.aoc2017

import scala.collection.mutable.ArrayBuffer

object Day6 extends App {
  val input = "4\t10\t4\t1\t8\t4\t9\t14\t5\t1\t14\t15\t0\t15\t3\t5"

  // TODO more functional approach
  var ints = input split "\t" map (_.toInt)
  val history = new ArrayBuffer[Array[Int]]()
  var i = 0
  while (!history.exists(_ sameElements ints)) {
    history += ints
    ints = ints.clone()
    i += 1
    var max = ints.max
    val maxIndex = ints indexOf max
    ints(maxIndex) = 0
    var j = maxIndex
    while (max != 0) {
      j += 1
      if (j == ints.length) {
        j = 0
      }
      max -= 1
      ints(j) += 1
    }
  }
  println(i)
}
