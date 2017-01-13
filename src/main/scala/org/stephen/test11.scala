package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
import Array._
object test11 {
  def main(args: Array[String]): Unit = {
    var mylist1 = range(10, 20, 2)
    var mylist2 = range(10, 20)

    for ( x<- mylist1) {
      print(" " + x)
    }

    println()
    for (x <- mylist2) {
      print(" " + x)
    }
  }

}
