package no.steria.clojure.from.java;

import java.io.IOException;

import clojure.lang.RT;
import clojure.lang.Var;

public class RomanNumber {
	public RomanNumber() {
		try {
			RT.loadResourceScript("romanNumber.clj");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String roman(int x) {
		Var roman = RT.var("romanNumber", "roman");
		
		String result = (String) roman.invoke(x);

		return result;
	}
}
