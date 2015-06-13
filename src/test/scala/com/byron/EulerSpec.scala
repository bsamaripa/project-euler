package com.byron

import org.scalatest._

abstract class UnitSpec extends FunSpec with Matchers with OptionValues with Inside with Inspectors with BeforeAndAfter

class TestProblem01 extends UnitSpec {
  describe("The sum of the all multiples of 3 and 5") {
    val testMultiples1 = new multiples(1)
    they("below 1 should be 0") { assert(testMultiples1.answer === 0) }

    val testMultiples2 = new multiples(10)
    they("below 10 should be 23") { assert(testMultiples2.answer === 23)}

    val testMultiples3 = new multiples(1000)
    they("below 1000 should be 233168") { assert(testMultiples3.answer === 233168) }
  }
}

class TestProblem02 extends UnitSpec {
  var testEvenFibs = new evenFibs(4000000)
  describe("The sum of all even fib numbers under 4 million"){
    they("should be 4613732") { assert(testEvenFibs.answer === 4613732) }
  }
}

/*
class TestProblem03 extends UnitSpec {

}*/

/*
class TestProblem04 extends UnitSpec {

}*/

/*
class TestProblem05 extends UnitSpec {

}*/

/*
class TestProblem06 extends UnitSpec {

}*/

/*
 * Testing Broken on Windows. Stack Overflow
class TestProblem07 extends UnitSpec {
  val testPrimes = new nthPrime
  describe("The nth Prime for") {
    they("1 should be 2"){  assert(testPrimes.primes(0) === 2 )}
    they("2 should be 3"){  assert(testPrimes.primes(1) === 3 )}
    they("4 should be 7"){  assert(testPrimes.primes(3) === 7)}
    they("5 should be 11"){ assert(testPrimes.primes(4) === 11)}
    they("10001 should be 104743"){  assert(testPrimes.primes(10000) === 104743)}
    they("100001 should be 1299721"){  assert(testPrimes.primes(100000) === 1299721)}
  }
}*/

class TestProblem08 extends UnitSpec {
  val testSeries = new productSeries(13)
  describe("The sum of a series of adjacent ints") {
    they("13 should be 23514624000") {assert(testSeries.highest._2 === 23514624000L)}
  }
}
