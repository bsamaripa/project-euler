package com.byron

import scala.math._
import scala.io.StdIn

/*
 * Problem 01
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

class multiples(n: Int) {
  val answer = (3 until n).toArray.filter(i => (i % 3 == 0) | (i % 5 == 0)).sum
}

object problem01 {
  def main(args: Array[String]) {
    val m = new multiples(100)
    println(m.answer)
  }
}
