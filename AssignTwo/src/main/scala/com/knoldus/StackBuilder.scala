package com.knoldus

class StackBuilder(var mylist: List[Any] = List()) {

  /**
   * Method to push element into the stack.
   * @param (element: Any)
   * @return List
   */

  def push(element: Any): List[Any] = {
    mylist = element :: mylist
    mylist
  }

  /**
   * Method to pop the top element from the stack in "Last In First Out" order.
   * @return List
   */

  def pop: List[Any] = {
    mylist = mylist.drop(1)
    mylist
  }

  /**
   * Method to return the top element from the stack.
   * @return Any
   */

  def top: Any = {
    mylist.head
  }

  /**
   * Method to check whether the stack is empty or not.
   * @return Boolean
   */

  def emptyStack(): Boolean = {
    mylist match {
      case Nil => true
      case _ => false
    }
  }

  /**
   * Method to print the stack.
   * @return Unit
   */

  def print(): Unit = {
    println(mylist)
  }
}

object ListDemo extends App {

  val myObj = new StackBuilder()
  myObj.push(2)
  myObj.print()
  myObj.push(8)
  myObj.print()
  myObj.push(11)
  myObj.print()
  myObj.push(40)
  myObj.print()
  myObj.pop
  myObj.print()
}