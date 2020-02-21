package io.reflectoring.eventsdemo;

import org.springframework.context.ApplicationEvent;

class UserCreatedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private String name;

	UserCreatedEvent(String name) {
		super(name);
		this.name = name;
	}

	String getName() {
		return this.name;
	}

}
