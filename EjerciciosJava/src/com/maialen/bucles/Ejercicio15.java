package com.maialen.bucles;

import java.util.Scanner;

public class Ejercicio15 {

	/**
	 Construir un programa que simule el juego de la adivinanza de un nœmero. 
	 El ordenador debe generar un nœmero aleatorio entre 1 y 100 y el usuario 
	 tiene cinco oportunidades para acertarlo. DespuŽs de cada intento el programa 
	 debe indicarle al usuario si el nœmero introducido por Žl es mayor, menor o 
	 igual al nœmero a adivinar, y el nœmero de intentos restantes.
	 */
	public static void main(String[] args) {
		int intentos=5;
		int x, num;
		boolean encontrado=false;
		x  = (int) (100*Math.random()+1);
		
		while(!encontrado && intentos>0){
			System.out.println("Introduce un numero:");
			Scanner entrada = new Scanner(System.in);
			num = entrada.nextInt();
			
			if(x==num){
				encontrado=true;
			}else{
				intentos--;
				if(num>x){
					System.out.println("Has introducido un numero mayor");
				}else{
					System.out.println("Has introducido un numero menor");
				}
			}
		}
		
		if(encontrado){
			System.out.println("Enhorabuena has acertado");
		}else{
			System.out.println("Se siente no te quedan intentos, el numero era "+x);
		}
		
	}
}
