package com.booklot.core;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class TestProfile {

	public void printTest() {
		System.out.println("Test method ");
	}
}
