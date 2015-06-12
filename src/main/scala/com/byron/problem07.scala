package com.byron

import scala.math._
import scala.io.StdIn

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Resource: http://www.cs.hmc.edu/~oneill/papers/Sieve-JFP.pdf
 */

class nthPrime{

  val primes: Stream[Int] = 2 #:: sieve(2)
  // Accessing nth prime numbers is 0-indexed. 
  // e.g. 1st prime number is primes(0)
  def sieve(n: Int): Stream[Int] = {
    if (primes.takeWhile(p => p*p <= n).exists(n % _ == 0)) sieve(n+2)
    else n #:: sieve(n+2)
  }
}

object nthPrimeMain {
  def main(args: Array[String]) {
    val np = new nthPrime
    println( np.primes( io.StdIn.readInt()-1 ) )
  }
}
