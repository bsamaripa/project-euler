package com.byron

import scala.math._
import scala.io.StdIn

/**
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

object problem10 {
  def main(args: Array[String]) {
    lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
      ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

    val r = ps.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
  }

}
