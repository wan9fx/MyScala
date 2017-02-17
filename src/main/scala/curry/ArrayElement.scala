package curry

/**
  * Created by wangfx on 2017/2/15.
  */
class ArrayElement(conts: Array[String]) extends Element {

  val contents: Array[String] = conts

  override def demo() {
    println("arrayelement's implementation invoked")
  }

}
