package com.maialen.factorias;

import com.maialen.validadores.Buzz;
import com.maialen.validadores.Fizz;
import com.maialen.validadores.Mozz;

public abstract class ValidatorFactory  {

	public static final Fizz getFizzValidator() {
		Fizz f = new Fizz();
		f.setOutput("Fizz");

		return f;
	}

	public static final Buzz getBuzzValidator() {
		Buzz b = new Buzz();
		b.setOutput("Buzz");

		return b;
	}

	public static final Mozz getMozzValidator() {
		Mozz m = new Mozz();
		m.setOutput("Mozz");

		return m;
	}
	
	
	
	
	
}
