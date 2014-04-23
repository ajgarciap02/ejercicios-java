//ejercicio 25

package com.maialen.poo;

import java.util.Scanner;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Complejo num1=new Complejo();
		Complejo num2=new Complejo();
		Complejo num3=new Complejo();
		
		num1.asignar(2, 1);
		num2.asignar(3, 5);
		System.out.println("Prueba inicial");
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		
		System.out.println("Suma");
		num1.sumar(num2);
		System.out.println(num1.toString());
		
		double real, ima;
		System.out.println("Introduce la parte real:");
		Scanner entrada = new Scanner(System.in);
		real = entrada.nextDouble();
		
		System.out.println("Introduce la parte imaginaria:");
		ima = entrada.nextDouble();
		
		num3.asignar(real, ima);
		System.out.println(num3.toString());
		
		System.out.println("sumando dos complejos");
		Complejo num4 = Complejo.sumar(num2, num3);
		System.out.println(num4.toString());
		
		
		System.out.println("el numero de instancias son: "+Complejo.numInstancias());
		
	}

}
