package bobsdelights

import caseclassstudy.Student

/**
  * Created by wangfx on 2017/1/16.
  */
abstract class Fruit {
  val name: String
  val color: String

}
object Fruits {

  def main(args: Array[String]): Unit = {
    println("stephen")

    val a = BigDecimal(1);
    println(a)

    val b = 2;
    val c = BigDecimal(b)
    println(c)

    val e = 20l;
    val f = BigDecimal(e);
    println("f:" + f)

    println("=====")
    val s = Set(1, 2, 3)

    for (a <- s) {
      println(a)
    }

  }

}
