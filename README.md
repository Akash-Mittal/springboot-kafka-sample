# springboot-kafka-sample
This is a parent repository for All Spring Boot Based Kafka Application 

## This Artifact should be able to answer these questions.

* What will happen to Messages if Kafka Consumer Slows or Goes down `Messages ttl` ?
* How to know for example - if Producer sent 12 MIllion 24 Thousand 45 Messages in last 24 hours Consumer received exactly the same number of messages `Kafka-Message-Audtiing` ?
* What about Message Duplication - If my application is running on Multiple instances then what `Duplicate Messages`?
* How to Figure out what is the optimal number of Batch size i put for Kafka consumer `performance`?
* If An Kafka App is Consuming in Batch Mode what could be the optimum settings `kafka-batch-consumer` ?
* A `KAFKAJMXUI`  Which Can show or have an interface like ActiveMQs with `ProducersAndConsumers` ?
* What happens - a NullMessgae is sent to `KafkaTopic` or Even Better a `MillionNullMessages` pushed on `KafkaTopic`. 


## Scenario (This will be considered thourgh out whole `submodules`)

* A logAggregatorApp (ELK Stack) send the user's 
  * `BrowsingActivityLogs` and activity on a `KafkaTopic`.
* The number of concurrent users is between 100.
* logAggregatorApp feeds to reccommendationEngine(data used for AI and Monitoring) which consumes data in certain format.
