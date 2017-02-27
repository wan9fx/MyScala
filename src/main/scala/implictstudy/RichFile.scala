package implictstudy

import java.io.File

import scala.io.Source

/**
  * Created by wangfx on 2017/2/22.
  */
class RichFile(val file: File) {
  def read = Source.fromFile(file.getPath()).mkString
}

object Context {
  implicit def file2RichFile(f: File) = new RichFile(f)
}

object ImplictDemo1 {
  def main(args: Array[String]): Unit = {
    import Context.file2RichFile
    println(new File("qqq.sql").read)
  }
}
