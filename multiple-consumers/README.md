# Kafka-Multiple-Consumers

## This Artifact should be able to answer these questions.

* What about Message Duplication - If my application is running on Multiple instances then what `Duplicate Messages`?





A log Aggregator App(ELK Stack) send the user browsing logs and activity on a kafka topic.
The number of concurrent users is between 10000 - 20000.
The logs need to fed to the reccommendation engine(An AI) which consumes data in certain format.

Kafka Data Publisher - Produces a Json Message.

