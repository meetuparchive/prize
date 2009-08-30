import sbt._

class PrizeProject(info: ProjectInfo) extends spde.SpdeProject(info) {
  val dispatch = "net.databinder" %% "dispatch-json" % "0.5.2"
  val configgy = "net.lag" % "configgy" % "1.3" intransitive()
} 
