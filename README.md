# PircBot'

PircBot' (pronounced "PircBot prime") is a framework for writing IRC bots in
Java.  This is a fork of jibble.org's [PircBot](http://www.jibble.org/pircbot.php)
(version 1.5.0) that adds the following features:

* SSL support
* The `ConfigurablePircBot` class, allowing IRC bots to be configured easily
* A build system using Apache Ant and Apache Ivy
* Other minor improvements

# Usage

PircBot' can be installed by typing:

    $ ant

This makes the PircBot' library available to projects that depend on it
through Ivy. The library can also be used via the resulting
`build/artifacts/pircbot.jar` file.

For general documentation on using PircBot' once it's installed, see the
[jibble.org PircBot website](http://www.jibble.org/pircbot.php). See
[ReminderBot'](https://github.com/davidlazar/ReminderBot) for an example of
how to use the new features provided by PircBot'.
