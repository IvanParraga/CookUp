name := "CookUp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc, javaEbean,
  "play2-crud" % "play2-crud_2.10" % "0.7.3-SNAPSHOT" exclude("org.scala-stm", "scala-stm"),
  "org.postgresql" % "postgresql" % "9.3-1101-jdbc41"
)

resolvers ++= Seq(
	"release repository" at  "http://hakandilek.github.com/maven-repo/releases/",
	"snapshot repository" at "http://hakandilek.github.com/maven-repo/snapshots/"
) 

play.Project.playJavaSettings
