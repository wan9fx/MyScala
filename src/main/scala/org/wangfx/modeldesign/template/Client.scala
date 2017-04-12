package org.wangfx.modeldesign.template

/**
  * Created by wangfx on 2017/4/12.
  */
object Client extends App {

  val account1: Account = SavingAccount
  account1.handle("ct", "123")

  val account2: Account = SavingAccount
  account2.handle("ct", "1233")

  val account3: Account = CurrentAccount
  account3.handle("ct", "123")

  val account4: Account = CurrentAccount
  account3.handle("ct", "123")

}
