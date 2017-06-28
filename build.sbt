name := "specs2-tutorial"

resolvers += "bintray-banno-oss-releases" at "http://dl.bintray.com/banno/oss"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.1.0",
  "org.asynchttpclient" % "async-http-client" % "2.0.32",
  "org.json4s" %% "json4s-jackson" % "3.5.2",
  "org.scala-lang.modules" %% "scala-async" % "0.9.5",
  "org.slf4j" % "slf4j-simple" % "1.7.21" % "runtime",
  "org.specs2" %% "specs2-core" % "3.7.2" % "test"
)
