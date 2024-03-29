import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "kiwiu_models",
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.fasterxml.jackson.core" % "jackson-core" % "2.9.9",
      "org.projectlombok" % "lombok" % "1.18.10" % "provided",
    ),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
