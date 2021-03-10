package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class StackBuilderTest extends AnyFlatSpec {

  val myInstance = new StackBuilder()

  "If you push an element 6, then the method " should " push 6 into the stack and return the list" in {
    assert(myInstance.push(6) === List(6))
  }
  "If you use the pop method then, it " should " pop the last entered element from the stack and return the list" in {
    myInstance.push(5)
    myInstance.push(8)
    assert(myInstance.pop === List(5,6))
  }
  "If the top method, then it " should " return the top element from the stack." in {
    myInstance.push(5)
    myInstance.push(8)
    assert(myInstance.top === 8)
  }
  "If you call emptyStack method on an empty stack, it  " should " return true." in {
    val myInstanceTwo = new StackBuilder()
    assert(myInstanceTwo.emptyStack() === true)
  }
  "If you call emptyStack method on a non-empty stack, it  " should " return false." in {
    myInstance.push(5)
    myInstance.push(8)
    assert(myInstance.emptyStack() === false)
  }
}
