package com.am.bp.alf.innovations;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

public class ListenerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListenerService.class);
    public static final String APPLICATION_PREFIX = "KMC";
    public static final String BATCH_LISTENER_ID_1 = APPLICATION_PREFIX + "-KAFKA-" + "LISTENER-1";
    public static final String BATCH_LISTENER_ID_2 = APPLICATION_PREFIX + "-KAFKA-" + "LISTENER-2";
    public static final String KAFKA_TOPIC_PROPS_KEY = "${kafka.topic.batch}";

    @KafkaListener(id = BATCH_LISTENER_ID_1, topics = KAFKA_TOPIC_PROPS_KEY)
    public void receive(List<String> data, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
            @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        LOGGER.info("start of batch receive");
        for (int i = 0; i < data.size(); i++) {
            LOGGER.info("received message='{}' with partition-offset='{}'", data.get(i),
                    partitions.get(i) + "-" + offsets.get(i));

        }
        LOGGER.debug("Debug: BATCH_LISTENER_ID {} topics {} ", BATCH_LISTENER_ID_1, KAFKA_TOPIC_PROPS_KEY);
    }

    @KafkaListener(id = BATCH_LISTENER_ID_2, topics = KAFKA_TOPIC_PROPS_KEY)
    public void receive2(List<String> data, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
            @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        LOGGER.info("start of batch receive");
        for (int i = 0; i < data.size(); i++) {
            LOGGER.info("received message='{}' with partition-offset='{}'", data.get(i),
                    partitions.get(i) + "-" + offsets.get(i));

        }
        LOGGER.debug("Debug: BATCH_LISTENER_ID {} topics {} ", BATCH_LISTENER_ID_1, KAFKA_TOPIC_PROPS_KEY);
    }

}
