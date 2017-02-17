package com.lxw1234.rpc

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

case class AkkaMessage(message: Any)

case class Response(response: Any)

/**
  * Created by wangfx on 2017/2/17.
  */
class Server extends Actor {
  override def receive: Receive = {
    case msg: AkkaMessage => {
      println("服务器收到消息： " + msg.message)
      sender ! Response("response_" + msg.message)
    }
    case _ => println("服务器不支持的消息类型..")
  }
}

object Server {
  def main(args: Array[String]): Unit = {
    val serverSystem = ActorSystem(
      "lxw1234",
      ConfigFactory.parseString("""
akka {
      actor {
      provider = "akka.remote.RemoteActorRefProvider"
      }
    remote {
      enabled-transports = ["akka.remote.netty.tcp"]
      netty.tcp {
        hostname = "127.0.0.1"
        port = 2555
      }
    }
  }""")
    )
    serverSystem.actorOf(Props[Server], "server")
  }
}
