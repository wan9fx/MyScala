package study
import scala.io.Source

/**
  * Created by wangfx on 2017/1/15.
  */
object LongLines {
  def processFile(filename: String, width: Int): Unit = {
    val source =Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename,width, line)
  }

  private def processLine(filename:String, width:Int,
                          line:String): Unit ={
    if (line.length > width)
      println(filename + ":" + line.trim)
  }

}
