package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaProducer {
	@Value("myapp.kafka.topic")
	private String topicName;
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		kafkaTemplate.send(topicName, message);
	}

}
