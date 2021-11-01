package edu.KUP

class EmptySet[A<:Ordered[A]] extends Set[A] {
  override def incl(value: A): Set[A] = new NonEmptySet(value, new EmptySet[A], new EmptySet[A])

  override def contains(element: A): Boolean = false
}
