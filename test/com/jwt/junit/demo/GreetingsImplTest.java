package com.jwt.junit.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingsImplTest {

	private Greetings greetings;

	@Before
	public void setup() {
		greetings = new GreetingsImpl();

	}

	@Test
	public void testGreatShouldReturnValidOutput() {

		String result = greetings.great("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);

	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExceptionForNameIsNull() {
		greetings.great(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExceptionForNameIsBlank() {
		greetings.great("");

	}

	@After
	public void teardown() {
		greetings = null;
	}

}
