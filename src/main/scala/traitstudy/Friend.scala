package traitstudy

/**
  * Created by wangfx on 2017/2/20.
  */
trait Friend {
  val name: String
  def listen() = println("your friend " + name + "is listening")
}
