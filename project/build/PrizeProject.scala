import sbt._

class PrizeProject(info: ProjectInfo) extends DefaultProject(info) with spde.SpdeProject {
  val dispatch = "net.databinder" %% "dispatch-http-json" % "0.7.6"
} 
