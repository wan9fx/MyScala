package curry

import scala.collection.mutable.ArrayBuffer

/**
  * Created by wangfx on 2017/2/16.
  */
class BasicIntQueue extends IntQueue{

  private val buf = new ArrayBuffer[Int]

  override def get(): Int = buf.remove(0)

  override def put(x: Int): Unit = buf += x
}
