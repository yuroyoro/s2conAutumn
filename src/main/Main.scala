package com.yuroyoro.scala.sastruts

import _root_.scala.tools.nsc.MainGenericRunner

object Main {

  def main(args:Array[String]):Unit = {
    import scala.reflect.Manifest
    import scala.collection.jcl.Conversions._

    import org.seasar.framework.container.factory.SingletonS2ContainerFactory
    import org.seasar.framework.container.S2Container

    import com.yuroyoro.scala.sastruts.service._
    import com.yuroyoro.scala.sastruts.entity._

    implicit lazy val ct:S2Container = {
      SingletonS2ContainerFactory.init
      SingletonS2ContainerFactory.getContainer
    }

    def typeOf[T](implicit ct: S2Container, m: Manifest[T]):T =
      ct.getComponent( m.erasure ).asInstanceOf[T]

    def nameOf[T]( name:String )(implicit ct: S2Container,  m: Manifest[T]):T =
      ct.getComponent( name ).asInstanceOf[T]

    MainGenericRunner.main( args )
    exit(0)
  }
}
