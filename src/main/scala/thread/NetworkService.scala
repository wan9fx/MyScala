package thread

import java.net.{ServerSocket, Socket}

/**
  * Created by wangfx on 2017/2/17.
  */
class NetworkService(port: Int, poolSize: Int) extends Runnable {

  val serverSocket = new ServerSocket(port)

  override def run(): Unit = {
    while (true) {
      val socket = serverSocket.accept()
      (new Handler(socket)).run()
    }
  }
}

class Handler(socket: Socket) extends Runnable {
  def message = (Thread.currentThread.getName() + "\n").getBytes

  override def run() = {
    socket.getOutputStream.write(message)
    socket.getOutputStream.close()
  }
}
