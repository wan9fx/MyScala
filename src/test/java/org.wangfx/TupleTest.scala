package org.wangfx

import java.io.FileReader

import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import gson.{Data, GetData}
import org.junit.Test

/**
  * Created by wangfx on 2017/3/6.
  */
object TupleTest {
//  def main(args: Array[String]): Unit = {
//    println(getTuple()._1)
//    println(getTuple()._2)
//
//    val ssss = BigDecimal("123")
//    println(ssss)
//
//  }

  private def getTuple(): Tuple2[Int, Int] = {
    val t = (1, 2)
    t
  }

  @Test
  def main(args: Array[String]): Unit = {
    var str = "0"
    str += "1"
    println(str)

//    val jsonReader = new JsonReader(new FileReader("qqq.json"))
//
//    val gson = new Gson()
//    val respone = gson.fromJson(jsonReader.toString, classOf[GetData])
//    print(respone)
    val data = new Data("testbalance", "testtranscode")
    val post = new GetData(data, "testmessage", "teststatus")
    println(post)
  }
}
