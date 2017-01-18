package study

/**
  * Created by wangfx on 2017/1/16.
  */
trait Incrementing extends IntQueue{

  abstract override def put(x: Int) = {super.put(x + 1)}

}
