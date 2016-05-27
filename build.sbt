val CSSElementQueriesVersion = "0.3.2"

name := "scala-js-css-element-queries"

organization := "com.outr.scalajs"

version := CSSElementQueriesVersion

scalaVersion := "2.11.8"

sbtVersion := "0.13.11"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.webjars.bower" % "css-element-queries" % CSSElementQueriesVersion

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"

jsDependencies += "org.webjars.bower" % "css-element-queries" % CSSElementQueriesVersion / s"css-element-queries/$CSSElementQueriesVersion/src/ElementQueries.js"

jsDependencies += "org.webjars.bower" % "css-element-queries" % CSSElementQueriesVersion / s"css-element-queries/$CSSElementQueriesVersion/src/ResizeSensor.js"

pomExtra :=
  <url>https://github.com/outr/scala-js-css-element-queries</url>
  <licenses>
    <license>
      <name>Apache-2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
    </license>
  </licenses>
  <scm>
    <url>git://github.com/outr/scala-js-css-element-queries.git</url>
  </scm>
  <developers>
    <developer>
      <id>darkfrog</id>
      <name>Matt Hicks</name>
      <url>http://github.com/darkfrog26/</url>
    </developer>
  </developers>
