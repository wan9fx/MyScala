package org.wangfx.modeldesign.template

import scala.collection.mutable.ArrayBuffer

/**
  * Created by wangfx on 2017/4/12.
  */
trait Account {

  def validate(account: String, pass: String): Boolean = {
    val params = ArrayBuffer[Any](account)
    if (account == "qqq" && pass == "qqq")
      true
    else
      false
  }

  def calculateInterest(): Unit

  def display() = print("显示利息")

  def handle(account: String, pass: String): Unit =
    validate(account, pass) match {
      case true =>
        calculateInterest()
        display()
      case false =>
        println("账户或密码错误")
    }
}

case object CurrentAccount extends Account {
  override def calculateInterest(): Unit = println("按照活期计算利息")
}

case object SavingAccount extends Account {
  override def calculateInterest(): Unit = println("按照定期计算利息")
}
