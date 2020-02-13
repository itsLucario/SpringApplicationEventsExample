package com.lucario.eventsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucario.eventsdemo.listeners.SpringBuiltInEventsListener;

@SpringBootApplication
public class EventsDemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EventsDemoApplication.class);
		springApplication.addListeners(new SpringBuiltInEventsListener());
		springApplication.run(args);
	}

}
