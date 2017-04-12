package org.wangfx.modeldesign.template

/**
  * Created by wangfx on 2017/4/12.
  */
sealed trait DataViewer {

  def data(): Unit

  private def convertData = println("将数据转化为xml格式")

  private def displayData(): Unit = println("以XML形式显示数据")

  protected def isNotXmlData = true

  def process(): Unit = {
    data()

    if (isNotXmlData) {
      convertData
    }
    displayData()
  }
}

case object XMLDataViewer extends DataViewer {
  override def data(): Unit = println("从XML文件中获取数据")

  override protected def isNotXmlData: Boolean = false

}

case object JSONDataViewer extends DataViewer {
  override def data(): Unit = println("从JSON文件中获取数据")
}
