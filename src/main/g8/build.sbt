import Dependencies._

ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / version      := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"
ThisBuild / scalacOptions ++= Seq(
  "-unchecked", 
  "-deprecation", 
  "-feature"
)

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="norm"$",
    libraryDependencies ++= backendDeps
  )