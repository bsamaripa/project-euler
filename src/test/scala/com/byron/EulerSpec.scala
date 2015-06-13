package com.byron

import org.scalatest._

abstract class UnitSpec extends FunSpec with Matchers with OptionValues with Inside with Inspectors with BeforeAndAfter

class TestProblem01 extends UnitSpec {
  describe("The sum of the all multiples of 3 and 5") {
    val testMultiples0 = new multiples(1)
    they("below 1 should be 0") { assert(testMultiples0.answer === 0) }

    val testMultiples1 = new multiples(6)
    they("below 6 should be 5") { assert(testMultiples1.answer === 8) }

    val testMultiples2 = new multiples(10)
    they("below 10 should be 23") { assert(testMultiples2.answer === 23)}

    val testMultiples3 = new multiples(100)
    they("below 100 should be 2318") { assert(testMultiples3.answer === 2318)}

    val testMultiples4 = new multiples(500)
    they("below 500 should be 57918") { assert(testMultiples4.answer === 57918)}

    val testMultiples5 = new multiples(1000)
    they("below 1000 should be 233168") { assert(testMultiples5.answer === 233168) }
  }
}
/*
class TestProblem02 extends UnitSpec {
  var testEvenFibs = new evenFibs
}*/

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
}
/*
class TestProblem08 extends UnitSpec {
  val testSeries = new productSeries(13)
}*/
