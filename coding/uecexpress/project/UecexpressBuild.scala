import sbt._
import sbt.Keys._

object UecexpressBuild extends Build {

  lazy val uecexpress = Project(
    id = "uecexpress",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "UecExpress",
      organization := "net.numa08",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.3"
      // add other settings here
    )
  )
}
