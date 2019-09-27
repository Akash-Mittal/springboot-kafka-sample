package com.am.bp.alf.innovations;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.kafka.test.utils.ContainerTestUtils;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ListenerConfig.class, KafkaListenerEndpointRegistry.class,
        ListenerService.class }, webEnvironment = WebEnvironment.NONE)
@ActiveProfiles("junittest")
@ComponentScan("com.am.bp.alf.innovations")
@EntityScan("com.am.bp.alf.innovations")
public class SenderServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SenderServiceTest.class);

    private static String BATCH_TOPIC = "junittest.user.activity.logs.t";

    @Autowired
    private SenderService senderService;

    @Autowired
    private ListenerService listenerService;

    @Autowired
    private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

    @ClassRule
    public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BATCH_TOPIC);

    @Before
    public void setUp() throws Exception {
        for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
                .getListenerContainers()) {
            ContainerTestUtils.waitForAssignment(messageListenerContainer, embeddedKafka.getPartitionsPerTopic());
        }
    }

    @Test
    public void testReceive() throws Exception {
        for (int i = 0; i < 100; i++) {
            senderService.send(BATCH_TOPIC, "message " + i);
        }

    }

}
