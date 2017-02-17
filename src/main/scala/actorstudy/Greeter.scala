package actorstudy
import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by wangfx on 2017/2/17.
  */
object Greeter {
  case object Greet
  case object Done
}

class Greeter extends Actor {
  override def receive = {
    case Greeter.Greet =>
      println("hello world!")
      sender() ! Greeter.Done
  }
}
