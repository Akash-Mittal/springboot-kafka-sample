package com.am.bp.alf;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

public class Listener {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @KafkaListener(id = "batch-listener", topics = "${kafka.topic.batch}")
    public void receive(List<String> data, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
            @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        LOGGER.info("start of batch receive");
        for (int i = 0; i < data.size(); i++) {
            LOGGER.info("received message='{}' with partition-offset='{}'", data.get(i),
                    partitions.get(i) + "-" + offsets.get(i));

        }
        LOGGER.info("end of batch receive");
    }
}
