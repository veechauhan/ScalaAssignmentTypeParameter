package edu.KUP


case class HelperSet(value: Double) extends Ordered[HelperSet] {
  def compare(that: HelperSet): Int = {
    if (this.value < that.value) {
      -1
    }
    else if (this.value > that.value) {
      1
    }
    else {
      0
    }
  }
}