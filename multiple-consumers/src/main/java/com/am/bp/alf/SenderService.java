package com.am.bp.alf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SenderService.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String data) {
        LOGGER.info("sending data='{}' to topic='{}'", data, topic);
        kafkaTemplate.send(topic, data);
    }
}
