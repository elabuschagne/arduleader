name := "scalafly"

version := "0.1"

scalaVersion := "2.9.3-RC1" // To match version used by scala-ide

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.4" withSources()

libraryDependencies += "com.typesafe.akka" % "akka-slf4j" % "2.0.4" withSources()

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource // Include resources dir in eclipse classpath

EclipseKeys.withSource := true // Try to include source for libs