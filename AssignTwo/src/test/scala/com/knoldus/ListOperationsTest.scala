package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class ListOperationsTest extends AnyFlatSpec {

  val myInstance = new ListOperations

  "If you provide List(3,15,12,7) then method" should " return (7,4) for element = 7 and position = 4" in {
    assert(myInstance.lastElementFinder(List(3,15,12,7)) === (7,4))
  }

  "If you provide an empty List() then method" should " return ((),-1)" in {
    assert(myInstance.lastElementFinder(List()) === ((),-1))
  }

  "If you provide List(3,15,12,7) then method" should " not return (7,5) for element = 7 and position = 5" in {
    assert(myInstance.lastElementFinder(List(3,15,12,7)) !== (7,5))
  }
}
