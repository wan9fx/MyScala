package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
import Array._
object test10 {
  def main(args: Array[String]): Unit = {
    var mylist1 = Array(1.9, 2.9, 3.4, 3.5)
    var mylist2 = Array(8.9, 7.9, 0.4, 1.5)
    var mylist3 = concat(mylist1, mylist2)

    for (x <- mylist3) {
      println(x)
    }
  }

}
