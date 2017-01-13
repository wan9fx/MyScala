package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object test4 {
  def main(args: Array[String]): Unit = {
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString())
  }

}
