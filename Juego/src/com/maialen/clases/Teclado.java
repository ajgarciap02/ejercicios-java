package com.maialen.clases;

import java.util.Scanner;

import com.maialen.excepciones.JuegoExcepcion;

public class Teclado {

	public static int leeEntero() throws JuegoExcepcion {
		Integer entero = new Integer(0);
		String dato;
		try {
			Scanner entrada = new Scanner(System.in);
			dato = entrada.next();
			entero = Integer.parseInt(dato);
			return entero.intValue();
		} catch (NumberFormatException e) {
			JuegoExcepcion ex = new JuegoExcepcion("Se deben introducir enteros");
			throw ex;
		} 
	}
}