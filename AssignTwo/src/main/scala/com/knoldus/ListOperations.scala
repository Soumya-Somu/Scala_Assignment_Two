package com.knoldus
import annotation.tailrec

class ListOperations {

  /**
   * Method to find the last element and it's position in a list.
   * @param (List: Any, position: Int)
   * @return (Any, Int)
   */

  @ tailrec final def lastElementFinder(list: Any, position: Int = 0): (Any, Int) = list match {

    case firstElem :: Nil => (firstElem -> (position + 1))
    case firstElement :: remainingList => lastElementFinder(remainingList, position+1)
    case Nil => ((), (-1))
  }

  /**
   * Method to print the multiplication table for all the elements in a list.
   * @param (list: List[Int])
   * @return Unit
   */

  def tableBuilder(list: List[Int]): Unit = {

    for (element <- list) {
      println(s"Multiplication Table of $element")
        for (counter <- 0 to 10) {
          println(s"$element * $counter  =   ${element * counter}")
      }
    }
  }
}

object obj extends App {

  val myObjOne = new ListOperations
  println(myObjOne.lastElementFinder(List("hi", "bye", "see ya","hiiii")))
  myObjOne.tableBuilder(List(2, 4, 3))
}