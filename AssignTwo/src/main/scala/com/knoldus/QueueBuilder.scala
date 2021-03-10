package com.knoldus

class QueueBuilder (var list:List[Any]=List()){

  /**
   * Method to add element to the queue.
   * @param element Element of the type Any.
   * @return List[Any]
   */

  def enqueue(element:Any): List[Any] ={
    list=element::list
    list
  }

  /**
   * Method to remove elements from the queue in "First In First Out" order.
   * @param List[Any]
   * @return List
   */

  def dequeue: List[Any] ={
    list=list.dropRight(1)
    list
  }

  /**
   * Method to return the head element.
   * @return Any
   */

  def queueHead: Any = {
    list.last
  }

  /**
   * Method to return the rear element.
   * @return Any
   */

  def queueRear:Any={
    list.head
  }

  /**
   * Method to check if the queue is empty or not.
   * @return Boolean
   */

  def checkEmpty():Boolean={
    list match {
      case Nil =>true
      case _ =>false
    }
  }

  /**
   * Method to print the queue.
   * @return Unit
   */

  def print(): Unit ={
    println(list)
  }

}

object Demo extends App {
  val myObjTwo = new QueueBuilder()
  myObjTwo.enqueue(2)
  myObjTwo.print()
  myObjTwo.enqueue(55)
  myObjTwo.print()
  myObjTwo.enqueue(20)
  myObjTwo.print()
  myObjTwo.enqueue(12)
  myObjTwo.print()
  myObjTwo.dequeue
  myObjTwo.print()
  myObjTwo.queueHead
  myObjTwo.print()
  myObjTwo.dequeue
  myObjTwo.print()
  myObjTwo.queueRear
  myObjTwo.print()
}