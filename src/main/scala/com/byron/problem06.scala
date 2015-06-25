package com.byron

import scala.math._
import scala.io.StdIn

/*
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

class SumSquares(n: Int) {
  val pt1: BigInt = (1 to n).map(n => n*n).sum // Sum of square of natural numbers
  val natSum: BigInt = (1 to n).sum
  val pt2: BigInt = natSum.pow(2) // Square of sum of natural numbers
  val answer: BigInt = pt2 - pt1
  //val answer = pow((1 to n).sum, 2) - (1 to n).map(n => n*n).sum
  // Make two series. sum them up
}

object problem06 {
  def main(args: Array[String]) {
    val sS = new SumSquares(100)
    println(sS.answer)
  }
}
