import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
	val extract = "net.databinder.spde" % "spde-sbt-plugin" % "0.1.0"
}
