val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ucsc_fp_labsheet_09",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
