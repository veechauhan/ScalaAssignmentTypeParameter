package edu.KUP

class NonEmptySet[A <: Ordered[A]](value: A, left: Set[A], right: Set[A]) extends Set[A] {
  def contains(x: A): Boolean = {
    if (x < value) {
      left contains x
    }
    else if (x > value) {
      right contains x
    }
    else true
  }

  def incl(x: A): Set[A] = {
    if (x < value) {
      new NonEmptySet(value, left incl x, right)
    }
    else if (x > value) {
      new NonEmptySet(value, left, right incl x)
    }
    else this
  }
}