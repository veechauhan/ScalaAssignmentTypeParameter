package edu.KUP

trait Set[A <: Ordered[A]] {
  def incl(value: A): Set[A]

  def contains(element: A): Boolean

}
