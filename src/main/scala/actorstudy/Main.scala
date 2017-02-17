package actorstudy

/**
  * Created by wangfx on 2017/2/17.
  */
object Main {
  def main(args: Array[String]): Unit = {
    akka.Main.main(Array(classOf[HelloWorld].getName))
  }
}
