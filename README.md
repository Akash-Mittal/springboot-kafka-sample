# springboot-kafka-sample

This is a parent repository for All Spring Boot Based Kafka Application 

Just like any `messageDrivenArchitecture` - Kafka is a gift.
`messageDrivenArchitecture`  promotes Loosely Coupled architecture 
Kafka as in a `messageDrivenArchitecture`brings both speed and reliability


## This Artifact Explores.

* `messagesTTLAndMessagesRetention` What happens Kafka Consumer Slows or Goes down.
* `kafkaMessageAudtiing` Producer sent 12 Million 24 Thousand 45 Messages in last 24 hours Did Consumer received exactly the same number of messages ?
* `kafkaMessageRedundancy` Application is running on Multiple instances
* `kafkaMessageOrdering` Producer Sequencing is Same as Consumer Consuming.
* `serializeAnddeserialize` Complex Kafka Json messages.
* `kafkaPerformance` settings `InfraLevel` and `ApplicationLevel`.
	* `MillionNullMessages` 
	* `optimalBatchSize` 
		* `KafkaConsumer` when to do batchin and not.
* A `kafkaJMXUI`  Which Can show or have an interface like ActiveMQs with `ProducersAndConsumers`
	* Possible (Jolokia)[https://jolokia.org/]
* A `bigKafkaMessage` - What are the best practises and pitfalls.
	


# Kafka-Multiple-Consumers

* What about Message Duplication - If my application is running on Multiple instances then what about `Duplicate Messages`?
* Multiple Instance means ?
  * Which one gets the data- All or One
    * `SingleKafkaApp` running With Multiple `Listeners` subscribing to the same group 
    * `LoadBalancedKafkaApp` running Single or Multple Lisetener on each instance 




## Scenario (This will be considered through out whole `submodules`)

BlueJean is an Ecommerce Startup using followin `messageDrivenArchitecture`

* A `logAggregatorApp` (ELK Stack) send the user's 
  * `browsingActivityLogs` and activity on a `KafkaTopic`.
* `logAggregatorApp` feeds to `reccommendationEngine`(data used for AI and Monitoring) via `webUserActivityLogskafkaTopic1`
* The number of concurrent users is <>.

```sequence
logAggregatorApp->reccommendationEngine: webUserActivityLogskafkaTopic1
Note right of reccommendationEngine: KafkaTopic
reccommendationEngine-->promoService: User Preferences..
reccommendationEngine-->reportingEngine: Updates..

```
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



Kafka Data Publisher - Produces a Json Message.
