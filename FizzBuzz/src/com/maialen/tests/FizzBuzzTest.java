package com.maialen.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.maialen.excepciones.NumberNotValidException;
import com.maialen.factorias.ValidatorFactory;
import com.maialen.fizzbuzz.FizzBuzz;
import com.maialen.validadores.Fizz;
import com.maialen.validadores.Buzz;
import com.maialen.validadores.Mozz;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	Fizz fizz;
	Buzz buzz;
	Mozz mozz;

	@Before
	public void setUp() throws Exception {
		
		fb = new FizzBuzz();
		fizz = ValidatorFactory.getFizzValidator();
		buzz = ValidatorFactory.getBuzzValidator();
		mozz = ValidatorFactory.getMozzValidator();

		fb.addValidator(fizz);
		fb.addValidator(buzz);
		fb.addValidator(mozz);
	}

	
	@Test
	public void testFizz() {
		assertEquals("Fizz", "Fizz", fizz.getOutput());
		try {
		assertFalse("Fizz: 1", fizz.validar(1));
		assertTrue("Fizz: 3", fizz.validar(3));
		assertFalse("Fizz: 4", fizz.validar(4));
		assertFalse("Fizz: 5", fizz.validar(5));
		assertTrue("Fizz: 6", fizz.validar(6));
		assertTrue("Fizz: 15", fizz.validar(15));
		} catch (NumberNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testBuzz() {
		assertEquals("Buzz", "Buzz", buzz.getOutput());
		try {
		assertFalse("Buzz: 1",buzz.validar(1));
		assertTrue("Buzz: 5",buzz.validar(5));
		assertFalse("Buzz: 7",buzz.validar(7));
		assertTrue("Buzz: 10",buzz.validar(10));
		assertTrue("Buzz: 15",buzz.validar(15));
		assertTrue("Buzz: 0",buzz.validar(0));
		} catch (NumberNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testObtener() {
		assertEquals("1","1",fb.obtenerTexto(1));
		assertEquals("3","Fizz",fb.obtenerTexto(3));
		assertEquals("5","Buzz",fb.obtenerTexto(5));
		assertEquals("15","FizzBuzz",fb.obtenerTexto(15));
		
	}
	
	
	@Test
	public void testFizzBuzz() {
		//fail("Not yet implemented");
		assertEquals("FizzBuzz 1", "1", fb.calcular(1));
		assertEquals("FizzBuzz 2", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz 4", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz 7", "1 2 Fizz 4 Buzz Fizz Mozz", fb.calcular(7));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz", fb.calcular(15));
		
	}

}
