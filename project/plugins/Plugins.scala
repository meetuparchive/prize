import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val databinder_net = "databinder.net repository" at "http://databinder.net/repo"
	val extract = "us.technically.spde" % "spde-sbt-plugin" % "0.3.0-SNAPSHOT"
}
