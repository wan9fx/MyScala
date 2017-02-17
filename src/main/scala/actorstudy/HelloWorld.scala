package actorstudy

import akka.actor.Actor.Receive
import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by wangfx on 2017/2/17.
  */
class HelloWorld extends Actor {

  override def preStart(): Unit = {
    val greeter = context.actorOf(Props[Greeter], "greeter")

    greeter ! Greeter.Greet
  }

  override def receive: Receive = {
    case Greeter.Done => context.stop(self)
  }
}
