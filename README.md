# guudteam - Ibnul, Dima, Michael


### Design
We envisioned a HelpDesk as a living, breathing entity, so we made it so it never stops running. 24/7 from start to finish it is waiting there to see what it's users need. It first prints three options to the screen, asking the user whether they would like to make a ticket, watch the queue process something, or see what's currently on the queue. The first of these options adds a corresponding ticket to the queue, with personalized information about the user. The second of the options has the queue remove the lowest priority ticket (which I guess is actually the highest priority), and tell the user that that has been done. Lastly, the third option prints out the tickets on the queue, with their corresponding ID numbers, usernames, and priorities.

Adding to the queue, and removing from it (by having it process a ticket) are both options chosen by the user. Similarly, by printing out the priorities on the print queue options, the user is aware of what order the queue will be processed in.

### Embellishments
By having the HelpDesk run on a while loop that is always true, it is always idly standing by waiting for input by the user.

By giving the user three options in what to do, we allow them to see how different parts of the queue works by choice.

We ended up giving the user a choice of four different services we offer, and allowing them to pick one. This allowed accurate solutions to always be offered at the conclusion of a ticket process.
