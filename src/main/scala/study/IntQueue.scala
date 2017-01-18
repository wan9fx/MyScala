package study
import scala.collection.mutable.ArrayBuffer
/**
  * Created by wangfx on 2017/1/16.
  */
abstract class IntQueue {

  def get() : Int

  def put(x: Int)

}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  override def get() = buf.remove(0)

  override def put(x: Int) = {
    buf += x
  }

}
