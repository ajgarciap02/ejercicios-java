//Ejercicio 26
package com.maialen.poo;

public class PruebaRacional {

	public static void main(String[] args) {
		System.out.println("Prueba numeros racionales");

		Racional rac1=new Racional();
		Racional rac2=new Racional();
		Racional rac3=new Racional();
		Racional rac4=new Racional();
		
		rac1.asignaNumerador(2);
		rac1.asignaDenominador(4);
		System.out.println(rac1.toString());
		
		rac2.asignaNumerador(3);
		rac2.asignaDenominador(4);
		System.out.println(rac2.toString());
		
		rac3.asignaNumerador(7);
		rac3.asignaDenominador(13);
		System.out.println(rac3.toString());
		
		rac4.asignaNumerador(3);
		rac4.asignaDenominador(10);
		System.out.println(rac4.toString());
		
		//////////////////////////////////////
		
		System.out.println("Prueba de suma 1/2 + 3/4");
		
		System.out.println(rac1.suma(rac2).toString());
		
		System.out.println("Prueba de resta 5/4 - 3/4");
		
		System.out.println(rac1.resta(rac2).toString());
		
		System.out.println("Prueba de producto 1/2 * 7/13");
		
		System.out.println(rac1.producto(rac3).toString());
		
		System.out.println("Prueba de division 7/26 / 7/13");
		
		System.out.println(rac1.division(rac3).toString());
		
		System.out.println("Prueba de comparacion 1/2 == 7/13");
		
		System.out.println(rac1.esIgual(rac3));
		
		System.out.println("Prueba de comparacion 1/2 == 1/2");
		
		System.out.println(rac1.esIgual(rac1));
		
	}

}
