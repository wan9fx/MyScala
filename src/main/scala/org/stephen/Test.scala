package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object Test {
  def main(args: Array[String]){
    println("returned value : " + addInt(5, 7))
  }

  def addInt(a:Int, b:Int) : Int = {
    var sum :Int = 0
    sum = a + b
    return sum
  }

}
