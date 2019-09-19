# springboot-kafka-sample
This is a parent repository for All Spring Boot Based Kafka Application 

## This Artifact should be able to answer these questions.

* What will happen to Messages if Kafka Consumer Slows or Goes down `Messages ttl` ?
* How to know for example - if Producer sent 12 MIllion 24 Thousand 45 Messages in last 24 hours Consumer received exactly the same number of messages `Kafka-Message-Audtiing` ?
* What about Message Duplication - If my application is running on Multiple instances then what `Duplicate Messages`?
* How to Figure out what is the optimal number of Batch size i put for Kafka consumer `performance`?
* How to `serialize` and `deserialize` complex Kafka Json messages ?



A log Aggregator App send the user browsing logs and activity on a kafka topic.
The number of concurrent users is between 10000 - 20000.
The logs need to fed to the reccommendation engine(An AI) which consumes data in certain format.

Kafka Data Publisher - Produces a Json Message.

