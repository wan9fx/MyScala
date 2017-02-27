package akka

import akka.actor._
import akka.actor.{Props, DeadLetter}
import akka.event.Logging
import akka.actor.ActorSystem
import akka.util.Timeout
import akka.pattern.ask
import scala.concurrent.duration._
import akka.actor.ReceiveTimeout
import akka.pattern.gracefulStop
import scala.concurrent.{Await, Future}
import akka.event.LogSource
import akka.actor.ActorSystem

/**
  * Created by wangfx on 2017/2/20.
  */
class MyActor extends Actor {
  override def receive: Receive = {
    case para: String => println(para)
    case _ => ()
  }
}

object DemoTest8 {
  val system = ActorSystem("msSystem")
  val act1 = system.actorOf(Props[MyActor], "first")
  implicit val time = Timeout(5 seconds)

  def main(args: Array[String]): Unit = {
    import scala.concurrent.ExecutionContext.Implicits.global

    val Tick = "tick"
    val cancellable =
      system.scheduler.schedule(0 milliseconds, 1 seconds, act1, Tick)
  }

}
