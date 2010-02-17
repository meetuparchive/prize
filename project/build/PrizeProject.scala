import sbt._

class PrizeProject(info: ProjectInfo) extends DefaultProject(info) with spde.SpdeProject {
  val dispatch = "net.databinder" %% "dispatch-http-json" % "0.7.0"
  val configgy = "net.lag" % "configgy" % "1.3" intransitive()
} 
