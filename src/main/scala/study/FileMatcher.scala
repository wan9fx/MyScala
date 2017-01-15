package study

import java.io.File
import javax.management.Query

/**
  * Created by wangfx on 2017/1/16.
  */
object FileMatcher {
  private def filesHere = (new File(".")).listFiles
  def filesMatching(matcher: (String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }


  def filesending(query:String) =
    filesMatching(_.endsWith(query))

  def filescontaining(query:String) =
    filesMatching(_.contains(query))

  def filesregex(query:String) =
    filesMatching(_.matches(query))

}
