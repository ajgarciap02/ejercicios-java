package com.maialen.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.maialen.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {
	
	FizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		
		fb= new FizzBuzz();
		
	}

	@Test
	public void testDivisores() {
		assertEquals("1",false,fb.divisor3(1));
		assertEquals("3",true,fb.divisor3(3));
		assertEquals("1",false,fb.divisor5(1));
		assertEquals("5",true,fb.divisor5(5));
		
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
		assertEquals("1","1 ",fb.calcular(1));
		assertEquals("2","1 2 ",fb.calcular(2));
		assertEquals("3","1 2 Fizz ",fb.calcular(3));
		assertEquals("4","1 2 Fizz 4 ",fb.calcular(4));
		assertEquals("5","1 2 Fizz 4 Buzz ",fb.calcular(5));
		assertEquals("6","1 2 Fizz 4 Buzz Fizz ",fb.calcular(6));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 ",fb.calcular(7));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 ",fb.calcular(8));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz ",fb.calcular(9));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz ",fb.calcular(10));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 ",fb.calcular(11));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz ",fb.calcular(12));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 ",fb.calcular(13));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 ",fb.calcular(14));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ",fb.calcular(15));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 ",fb.calcular(16));
		
		
		
	}

}
