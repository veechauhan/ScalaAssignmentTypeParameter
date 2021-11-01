package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class EmptySetTest extends AnyFlatSpec {
  "In this case we check  value in insert or not in Empty Set " should "give true" in {
    val emptySet: Set[HelperSet] = new EmptySet[HelperSet].incl(HelperSet(1))
    assert(emptySet.contains(HelperSet(1)))
  }
}