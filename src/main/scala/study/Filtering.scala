package study

/**
  * Created by wangfx on 2017/1/16.
  */
trait Filtering extends IntQueue{

  abstract override def put(x: Int) = {
    if(x > 0)
      super.put(x)
  }

}
