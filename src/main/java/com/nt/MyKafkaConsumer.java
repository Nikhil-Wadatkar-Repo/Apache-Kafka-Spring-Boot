package com.nt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaConsumer {

	@KafkaListener(topics = "myTopic-events", groupId = "group-id")
	public void consume(String message) {
		System.out.println("Message received -> %s" + message);
	}

}
