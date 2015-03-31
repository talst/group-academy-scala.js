enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.5"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"

libraryDependencies += "org.webjars" % "openui5" % "1.26.7"

jsDependencies += RuntimeDOM

scalaJSStage in Global := FastOptStage

skip in packageJSDependencies := false

testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true

persistLauncher in Test := false