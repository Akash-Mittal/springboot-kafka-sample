# springboot-kafka-sample

This is a parent repository for All Spring Boot Based Kafka Application 

## This Artifact should be able to answer these questions.

* `messagesTTLAndMessagesRetention` What happens Kafka Consumer Slows or Goes down.
* `kafkaMessageAudtiing` Producer sent 12 Million 24 Thousand 45 Messages in last 24 hours Did Consumer received exactly the same number of messages ?
* `kafkaMessageRedundancy` Application is running on Multiple instances
* `kafkaMessageOrdering` Producer Sequencing is Same as Consumer Consuming.
* `serializeAnddeserialize` Complex Kafka Json messages.
* `kafkaPerformance` settings `InfraLevel` and `ApplicationLevel`.
	* `MillionNullMessages` .
	* `OptimalBatchSize` .
* A `kafkaJMXUI`  Which Can show or have an interface like ActiveMQs with `ProducersAndConsumers` ?


## Scenario (This will be considered through out whole `submodules`)

* A `logAggregatorApp` (ELK Stack) send the user's 
  * `BrowsingActivityLogs` and activity on a `KafkaTopic`.
* `logAggregatorApp` feeds to `reccommendationEngine`(data used for AI and Monitoring) via `webUserActivityLogskafkaTopic`
* The number of concurrent users is <>.


### Other Learnings
* Junit Test Data Slicing in MicroServiceArchitecture using Spring Boot.
* Junit Testing With `EmbeddedKafka` and `EmbeddedZooKeeper`.
* Dynamic JSON Testing - best way of not having to put json is resources and read them.

### Take aways
* It would be interesting to know and do RnD ,try to leverage out what other people
have already done,not to sweat it.
* The Quality and Quantity of Data impacts
	* The Agility of Application Development.
	* The Architecture of Application.
* Limiting Testing scope and the application is still in devMode.