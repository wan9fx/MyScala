package curry

/**
  * Created by wangfx on 2017/2/15.
  */
class LineElement(s: String) extends ArrayElement(Array(s)) {

  override def width: Int = s.length

  override def height: Int = 1

  override def demo(){
    println("lineelement's implemantation ivoked")
  }

}
