package com.byron

import org.scalatest._

/*
 * Problem 07
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Resource: http://www.cs.hmc.edu/~oneill/papers/Sieve-JFP.pdf
 */

abstract class UnitSpec extends FunSpec with Matchers with OptionValues with Inside with Inspectors with BeforeAndAfter

class MySpec extends UnitSpec {
  val testPrimes = new nthPrime
  describe("The nth Prime for") {
    they("1 should be 2"){  assert(testPrimes.primes(0) === 2 )}
    they("2 should be 3"){  assert(testPrimes.primes(1) === 3 )}
    they("4 should be 7"){  assert(testPrimes.primes(3) === 7)}
    they("5 should be 11"){ assert(testPrimes.primes(4) === 11)}
    they("10001 should be 104743"){  assert(testPrimes.primes(10000) === 104743)}
    they("100001 should be 1299721"){  assert(testPrimes.primes(100000) === 1299721)}
  }


}
