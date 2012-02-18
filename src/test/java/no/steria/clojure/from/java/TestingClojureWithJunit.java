package no.steria.clojure.from.java;


import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class TestingClojureWithJunit {
	private RomanNumber romanNumber = new RomanNumber();
	
	@Test
	public void romanNumberFromClojure() throws Exception {
		assertThat(romanNumber.roman(4)).isEqualTo("IV");
	}
	
	@Test
	public void another_test() throws Exception {
		assertThat(romanNumber.roman(59)).isEqualTo("LIX");		
	}
}
