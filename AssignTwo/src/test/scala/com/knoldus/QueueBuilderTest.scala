package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class QueueBuilderTest extends AnyFlatSpec {

  val myInstance = new QueueBuilder()

  "If you provide 5, then the method " should "push List(5) into the queue" in {
    assert(myInstance.enqueue(5) === List(5))
  }

  "If you call the dequeue method, it " should "remove the first entered element from the queue and return the remaining queue" in {
    val myInstanceTwo = new QueueBuilder()
    myInstanceTwo.enqueue(1)
    myInstanceTwo.enqueue(5)
    myInstanceTwo.enqueue(2)
    assert(myInstanceTwo.dequeue === List(2,5))
  }

  "If you call the queueHead method, it " should "return the first entered element in the queue." in {
    val myInstanceThree = new QueueBuilder()
    myInstanceThree.enqueue(1)
    myInstanceThree.enqueue(5)
    myInstanceThree.enqueue(2)
    assert(myInstanceThree.queueHead === 1)
  }
  "If you call the queueRear method, it " should "return the last entered element in the queue." in {
    val myInstanceFour = new QueueBuilder()
    myInstanceFour.enqueue(1)
    myInstanceFour.enqueue(5)
    myInstanceFour.enqueue(2)
    assert(myInstanceFour.queueRear === 2)
  }
  "If you call the checkEmpty method on a non-empty queue, it " should "return false" in {
    val myInstanceFive = new QueueBuilder()
    myInstanceFive.enqueue(1)
    myInstanceFive.enqueue(5)
    myInstanceFive.enqueue(2)
    assert(myInstanceFive.checkEmpty() === false)
  }
  "If you call the checkEmpty method on an empty queue, it " should "return true" in {
    val myInstanceSix = new QueueBuilder
    assert(myInstanceSix.checkEmpty() === true)
  }
}
