package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
object test7 {
  def main(args: Array[String]): Unit = {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程！"
    var fs = printf("浮点型变量为 " + "%f, 整形变量为 %d, 字符串为 "
          + " %s", floatVar, intVar, stringVar)
    println(fs)
  }

}
