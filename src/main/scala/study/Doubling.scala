package study

/**
  * Created by wangfx on 2017/1/16.
  */
trait Doubling extends IntQueue{

  abstract override def put(x: Int) = {
    super.put(2 * x)
  }

}
