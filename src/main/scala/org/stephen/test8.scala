package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object test8 {
  def main(args: Array[String]): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    for (x <- myList) {
      println(x)
    }
    var total = 0.0
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("总数为 " + total)

    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max)
        max = myList(i)
    }
    println("最大值为 " + max)
  }

}
