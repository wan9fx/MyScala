package curry

/**
  * Created by wangfx on 2017/2/16.
  */
trait Doubling extends IntQueue{

  abstract override def put(x: Int) = super.put(2 * 2)

}
