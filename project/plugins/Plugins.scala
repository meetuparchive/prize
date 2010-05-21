import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val databinder_net = "databinder.net repository" at "http://databinder.net/repo"
	val spde_sbt = "us.technically.spde" % "spde-sbt-plugin" % "0.4.1"
	val sxr_publish = "net.databinder" % "sxr-publish" % "0.1.6"
}
