import dispatch._
import net.lag.configgy.Configgy

Configgy.configure(dataPath("prize.conf"))

object Meetup extends json.Js {
  val req = :/("api.meetup.com") / "rsvps.json" <<? Configgy.config.asMap
  val attendees = Http(req ># ('results ? (list ! obj))) filter {
    ('response ! str)(_) == "yes"
  } map ('name ! str)
}

frameRate(15)
textFont(loadFont("deja.vlw"))
size(800, 400)

var t = 4.0
var v = 0.4
var winner = Meetup.attendees.random

def draw() {
  background(0)
  text(winner, noise(t, 0) * width / 2, noise(t, 1) * height)
  winner = play((v * 100).toInt %> Meetup.attendees.random, 40 %> winner)
  t = t + v
  v = v - .003
  if (v < 0)
    noLoop()
}

override def mouseClicked {
  v = 0.3
  loop()
}
