package traitstudy

/**
  * Created by wangfx on 2017/2/20.
  */
class Human(val name: String) extends Friend {
  override def listen() = println("your friend " + name + "is listening")
}

class Man(override val name: String) extends Human(name)

class Woman(override val name: String) extends Human(name)

class Animal

class Dog(val name: String) extends Animal with Friend {
  override def listen(): Unit = println(name + "'s listening quietly")
}
