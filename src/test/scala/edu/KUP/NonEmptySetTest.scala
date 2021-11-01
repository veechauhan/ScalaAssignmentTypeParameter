package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class NonEmptySetTest extends AnyFlatSpec {
  "incl method " should " insert the value 1,2 in set" in {
    val NonemptySet = new EmptySet[HelperSet].incl(HelperSet(1)).incl(HelperSet(2))
    assert(NonemptySet.contains(HelperSet(2)))
  }
  "incl method " should " insert the values 1,4 in set" in {
    val NonemptySet = new EmptySet[HelperSet].incl(HelperSet(1)).incl(HelperSet(4))
    assert(NonemptySet.contains(HelperSet(4)))
  }
  "contain method" should "give true or false" in {
    val set = new EmptySet[HelperSet].incl(HelperSet(10)).incl(HelperSet(12)).incl(HelperSet(9))
    assert(set.contains(HelperSet(10)))
  }
  "contain method" should "give  false" in {
    val set = new EmptySet[HelperSet].incl(HelperSet(10)).incl(HelperSet(12)).incl(HelperSet(9))
    assert(!set.contains(HelperSet(11)))
  }
}
