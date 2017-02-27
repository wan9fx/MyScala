package caseclassstudy

/**
  * Created by wangfx on 2017/2/23.
  */
object PatternMatching extends App {
  for (i <- 1 to 100) {
    i match {
      case 10 => print(10)
      case 50 => println(50)
      case 80 => println(80)
      case _ if (i % 4 == 0) => println(i + ":能被4整除")
      case _ if (i % 3 == 0) => println(i + ": 能被3整除")
      case _ =>
    }
  }
}
