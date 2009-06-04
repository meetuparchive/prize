import dispatch._
import net.lag.configgy.Configgy

Configgy.configure(dataPath("prize.conf"))

object Meetup extends json.Js {
  val req = :/("api.meetup.com") / "rsvps.json" <<? Configgy.config.asMap
  
  val attendees = Http(req ># ('results ? (list ! obj))) map ('name ! str)
}

def draw() {
  println(Meetup.attendees) 
}
