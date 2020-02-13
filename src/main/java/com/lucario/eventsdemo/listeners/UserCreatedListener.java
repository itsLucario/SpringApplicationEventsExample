package com.lucario.eventsdemo.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.lucario.eventsdemo.events.UserCreatedEvent;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

	@EventListener
	public void handleUserCreatedEvent(UserCreatedEvent event) {
		System.out.println("User created event triggered with annotated listener. Created user: " + event.getName());
	}

	@Override
	public void onApplicationEvent(UserCreatedEvent event) {
		System.out.println("User created event triggered with ApplicationListener implemented listener. Created user: " + event.getName());
	}
}
