package com.divya.activemq.jms.consumer;

import com.divya.activemq.model.MessageStorage;
import com.divya.activemq.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
	@Autowired
	private MessageStorage taskStorage;
	
	@JmsListener(destination = "${gkz.activemq.queue}", containerFactory="jsaFactory")
	public void receive(Task task){
		taskStorage.add(task);
	}
}