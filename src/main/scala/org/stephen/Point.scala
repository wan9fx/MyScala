package org.stephen

/**
  * Created by wangfx on 2017/1/13.
  */
class Point(xc: Int, yc: Int) {

  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
    println("x 的坐标点 ：" + x)
    println("y 的坐标点 ： " + y)
  }

}

//class Location( override val xc: Int, override val yc: Int, val zc : Int) extends Point(xc, yc) {
//  var z : Int = zc
//
//  def move (dx: Int, dy: Int, dz: Int): Unit = {
//    x = x + dx;
//    y = y + dy;
//    z = z + dz
//    println("x的坐标点 ： " + x)
//    println("y的坐标点 ： " + y)
//    println("z的坐标点 ： " + z)
//  }
//}
