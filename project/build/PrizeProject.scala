import sbt._

class PrizeProject(info: ProjectInfo) extends spde.DefaultOpenGLProject(info) {
  val dispatch = "net.databinder" %% "dispatch-http-json" % "0.7.6"
} 
