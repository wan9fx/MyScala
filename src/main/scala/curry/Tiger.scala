package curry

/**
  * Created by wangfx on 2017/2/15.
  */
class Tiger(param1: Boolean, param2: Boolean) extends Cat {

  override val dangerous: Boolean = param1

  private var age = param2

}
