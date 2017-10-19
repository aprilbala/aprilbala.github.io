---
layout: essay
type: essay
title: "Meteor Gotchas"
date: 2017-10-19
labels:
  - Software Engineering
  - Meteor
---

One problem I've had with with while doing our Digits application assignments is that in the beginning, when I would try to run an ```meteor npm install``` on command line sometimes the installation would be successful, while other times it would not be successful. Either way, I would go on with the assignment and it did not seem to have an effect on how my code ran. Or at least I just assumed so. Additionally to this, when trying to run ```meteor npm install``` I would also get messages when attempting to run it, that said to ```update npm``` to the latest version, but when I would try to, it would say that the command was not a known command. I was able to fix this and successfully update npm with the help of a Google Search. Since then, I have not have problems when I would try to run an ```npm install```.


Another problem I can remember having is that, while doing the [Digits (Part 3)](http://courses.ics.hawaii.edu/ics314f17/morea/meteor-2/experience-meteor-digits-3.html) practice WOD, in the mist of me creating sample Contacts data (step 4 in WOD) or showing the Contacts data on the home page (step 5), somewhere, I had an error that flooded my terminal with errors that did not allow my digits application to refresh. I started having a mini freak out because I was like "what in the world are all these errors!!!" 😭😩 However, I would like to thank the long list of errors since I had an idea of what was wrong since it pinpointed what file the error was coming from. What ended up being the problem was that a part of my code was still referencing the *Stuff* collection, and wasn't changed to reference our new *Contacts* collection. After I made the change to pinpoint to the *Contacts* collection, all was well and my digits application was able to be reloaded and refreshed. 😌
