package com.maialen.basicos;

import java.util.Scanner;

public class Ejercicio3 {

	/**
	 Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla el valor de la superficie 
	 y el volumen de la esfera correspondiente. Para obtener el valor de PI, utilizar la variable est‡tica Math.PI.
	Volumen esfera = (4/3)PIR3
	Superficie esfera = 4PIR2
	 */
	public static void main(String[] args) {
		double volumen, superficie;
		System.out.println("Introduce un radio para la esfera:");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		volumen = (4/3)*Math.PI*Math.pow(num, 3);
		superficie = 4*Math.PI*Math.pow(num, 2);
		
		System.out.println("El radio de la esfera es " + num);
		System.out.println("La superficie de la esfera es  " + superficie);
		System.out.println("El volumen de la esfera es  " + volumen);
		
	}

}
