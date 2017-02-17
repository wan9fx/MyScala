package curry

/**
  * Created by wangfx on 2017/2/4.
  */
object Curry {
  def plainOldSum(x:Int, y:Int) = x + y

  def curriedSum(x:Int)(y:Int) = x + y

  def main(args: Array[String]): Unit = {

    val ae = new ArrayElement(Array("hello", "world"))
    println(ae.width)
  }



}
