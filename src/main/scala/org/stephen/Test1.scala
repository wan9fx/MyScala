package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }
  val factor = 3
  val multiplier = (i:Int) => i * factor

}
