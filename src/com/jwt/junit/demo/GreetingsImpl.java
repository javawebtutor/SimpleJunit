package com.jwt.junit.demo;

public class GreetingsImpl implements Greetings {

	@Override
	public String great(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
