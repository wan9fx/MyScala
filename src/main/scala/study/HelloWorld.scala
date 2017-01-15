package study

import java.io.File
import scala.util.control.Breaks._
import java.io._

/**
  * Created by wangfx on 2017/1/14.
  */
object HelloWorld extends App{
    println("hello world")

  val fileHere = (new File(".")).listFiles
  for (file <- fileHere
      if file.isFile
      if file.getName.endsWith(".scala"))
    println(file)


  val firstArg = if (args.length > 0) args(0) else ""
  firstArg match  {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case  _ => print("huh?")
  }

  val in = new BufferedReader(new InputStreamReader(System.in))
  breakable {
    while(true) {
      println("? ")
      if (in.readLine() == "") break()
    }
  }


}
