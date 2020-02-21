package io.reflectoring.eventsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
class Publisher {

	@Autowired
	private ApplicationEventPublisher publisher;

	void publishEvent(final String name) {
	    publisher.publishEvent(new UserCreatedEvent(name));
	}
}
