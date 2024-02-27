package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private MyKafkaProducer kafkaProducer;

	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to kafka topic");
	}

}
