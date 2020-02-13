package com.lucario.eventsdemo.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.lucario.eventsdemo.events.UserCreatedEvent;

@Component
public class Publisher {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void publishEvent(final String name) {
	    publisher.publishEvent(new UserCreatedEvent(name));
	}
}
