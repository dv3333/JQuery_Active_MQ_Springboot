package com.divya.activemq.jms.producer;

import com.divya.activemq.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${gkz.activemq.queue}")
	String queue;
	
	public void send(Task task){
		jmsTemplate.convertAndSend(queue, task);
	}
}