package study

/**
  * Created by wangfx on 2017/1/16.
  */
trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left

}
