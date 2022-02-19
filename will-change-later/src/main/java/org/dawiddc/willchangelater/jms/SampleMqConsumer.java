package org.dawiddc.willchangelater.jms;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Objects;

import static java.util.Optional.ofNullable;

@Service
@RequiredArgsConstructor
public class SampleMqConsumer {

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/receiveMessage")
    public String getSampleFromQueue() {
        Message message = rabbitTemplate.receive("sampleQueue");
        return ofNullable(message).map(Objects::toString).orElse("");
    }


}
