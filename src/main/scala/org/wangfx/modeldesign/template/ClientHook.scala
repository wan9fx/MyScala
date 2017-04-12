package org.wangfx.modeldesign.template

/**
  * Created by wangfx on 2017/4/12.
  */
object ClientHook extends App {

  val dataViewer1 = XMLDataViewer

  val dataViewer2 = JSONDataViewer

  dataViewer1.process()

  dataViewer2.process()
}
