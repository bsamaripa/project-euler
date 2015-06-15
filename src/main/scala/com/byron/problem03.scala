package com.byron

import scala.math._

/*
 * Problem03
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 *
 */

class findFactor(n: Long) {
  def GCD(a: Long, b: Long): Long = {
    if (b == 0) a else GCD(b, a%b)
  }

  def bruteFactor(n: Long): Int = {
    val k: Int = floor(sqrt(n)).toInt
    var output = for { i <- 2 to k
      if (n % i == 0)
      if isPrime(i)
    } yield i
    output.max
  }


  def isPrime(n: Int) = {
    assume(n <= Int.MaxValue - 1)
    n > 1 && (Iterator.from(2) takeWhile (d => d * d <= n) forall (n % _ != 0))
  }
}

object problem03 {
  def main(args: Array[String]) {
    val fF = new findFactor(600851475143L)
    println(fF.bruteFactor(600851475143L))

  }
 }
