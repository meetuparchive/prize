Prize
=====

A sort-of random picker for Meetup door prize winners, built on [Spde][1].

Prize must be configured with your [Meetup API credentials][2] and the ID
of the meetup where it should fetch its attendee list. Create a text file
`data/api.properties` of the format

    key = API-KEY-HERE
    event_id = EVENT-ID-HERE

To build and run it you'll need to have [Simple Build Tool][sbt] setup on 
your path. Then,

    $ sbt
    > update
    > run

[1]:http://technically.us/spde/
[2]:http://www.meetup.com/meetup_api/key/