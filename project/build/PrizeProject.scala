import sbt._

class PrizeProject(info: ProjectInfo) extends DefaultProject(info) with spde.SpdeProject with sxr.Publish {
  val dispatch = "net.databinder" %% "dispatch-http-json" % "0.7.3"
  val configgy = "net.lag" % "configgy" % "1.3" intransitive()
} 
