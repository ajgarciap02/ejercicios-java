package com.maialen.bucles;

import java.util.Scanner;

public class Ejercicio9 {

	/**
	 Construir un programa que calcule el factorial de un valor numérico 
	 introducido como parámetro o argumento en la línea de comandos.
	 */
	public static void main(String[] args) {
		int num;
		double resultado=1;;
		
		System.out.println("Introduce un numero:");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		for (int i=2; i<=num; i++){
			resultado*=i;
		}
		System.out.println("El factorial es: " + resultado);
	}

}
