package org.dawiddc.willchangelater.jms;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Optional.ofNullable;

@RestController
@RequiredArgsConstructor
public class SampleMqConsumer {

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/receiveMessage")
    public String getSampleFromQueue() {
        Message message = rabbitTemplate.receive("sampleQueue");
        return ofNullable(message)
                .map(Message::getBody)
                .map(bytes -> new String(bytes, UTF_8))
                .orElse("[NO_BODY_AVAILABLE]");
    }

}
