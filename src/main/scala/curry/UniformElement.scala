package curry

/**
  * Created by wangfx on 2017/2/15.
  */
class UniformElement (
                     ch: Char,
                     override val width: Int,
                     override val height: Int
                     ) extends Element {
  private val line = ch.toString * width
  def contents = Array("hello", "world")
}
