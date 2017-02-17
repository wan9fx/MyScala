package traitqq

/**
  * Created by wangfx on 2017/2/17.
  */
class GenericClass[T] {

  private var content: T = _
  def set(value: T) = {
    content = value
  }

  def get(): T = content

}

object GenericClass {
  def main(args: Array[String]): Unit = {
    val gen1 = new GenericClass[Int]
    gen1.set(100)
    println(gen1.get())

    val gen2 = new GenericClass[String]
    gen2.set("name")
    println(gen2.get())
  }
}
