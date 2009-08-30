import net.lag.configgy.Configgy
Configgy.configure(dataPath("prize.conf"))

object Meetup {
  import dispatch._
  import json.Js
  import Js._
  val req = :/("api.meetup.com") / "rsvps.json" <<? Configgy.config.asMap
  val attendees = for {
    js <- Http(req ># ('results ? (Js.list ! obj)))
    if ('response ! str)(js) == "yes"
  } yield ('name ! str)(js)
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
