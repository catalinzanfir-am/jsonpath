import io.gatling.build.license._

enablePlugins(SonatypeReleasePlugin)

val devs = Seq(
  GatlingDeveloper("slandelle@gatling.io", "Stephane Landelle", true),
  GatlingDeveloper("nremond@gmail.com", "Nicolas Rémond", false)
)

projectDevelopers := devs

license := ApacheV2

useSonatypeRepositories := true

githubPath := "gatling/jsonpath"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8", "2.10.6")

crossPaths := true
