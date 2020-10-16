lazy val common_project = Seq(
  organization := "prg20",
  version := "0.1-SNAPSHOT",

  fork in run          := true,
  connectInput in run  := true,
  cancelable in Global := true,
  )

lazy val scala_project = common_project ++ Seq(
  scalaVersion := "2.13.3",   // コンパイルに使う scalac のバージョン
  scalacOptions := Seq("-feature", "-unchecked", "-deprecation"),
  scalaSource in Compile := baseDirectory.value,
  )

lazy val root = (project in file("src")).settings(scala_project)
