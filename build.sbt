name := """minimal-akka-http"""

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)

libraryDependencies ++= {
  val akkaV = "2.4.6"
  Seq(
//    "com.typesafe.akka" %% "akka-http-core" % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV,
//    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  )
}
