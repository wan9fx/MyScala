package implictstudy

/**
  * Created by wangfx on 2017/2/22.
  */
object ImplicitDemo {

  def display(input: String) = println(input)

  implicit def typeConvertor(input: Int): String = input.toString

  implicit def typeConvertor(input: Boolean): String =
    if (input) "true" else "false"

  def main(args: Array[String]): Unit = {
    display("1212")
    display(12)
    display(true)
  }
}
