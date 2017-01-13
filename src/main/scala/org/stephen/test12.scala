package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object test12 {
  def main(args: Array[String]): Unit = {
    val it = Iterator("baidu", "google", "runnoob", "taobao")
    while (it.hasNext) {
      println(it.next())
    }
  }

}
