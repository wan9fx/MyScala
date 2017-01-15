package study
import scala.io.Source

/**
  * Created by wangfx on 2017/1/15.
  */
object LongLines {
  def processFile(filename: String, width: Int): Unit = {
    def processLine(line:String) = {
      if (line.length > width)
        println(filename + ":" + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)



    var increase = (x :Int ) => {
      println("we")
      println("are")
      println("here")
      x + 1
    }

  }



}
