name := """minimal-akka-http"""

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-core" % "2.4.6",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.6",
  "com.typesafe.akka" %% "akka-http-testkit" % "2.4.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
