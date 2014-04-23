package com.maialen.arrays;
import java.util.Arrays;
public class Ejercicio19 {

	/**
	 Construir un programa que genere dos vectores de nœmeros enteros v1 y v2, 
	 y que construya un nuevo vector v que almacene la suma de ambos vectores. 
	 El nuevo vector se ha de ajustar al vector m‡s largo proporcionado por el 
	 usuario. Finalmente, mostrar el resultado por pantalla.
	 */
	public static void main(String[] args) {
		int[] v1=new int[10];
		int[] v2=new int[7];
		int[] v3=new int[Math.max( v1.length,v2.length)];
		// Inicializar el array de nœmeros
		for (int i = 0; i < v1.length; i++) {
			v1[i] = (int) (10*Math.random()+1);
		}

		
		// Inicializar el array de nœmeros
		for (int i = 0; i < v2.length; i++) {
			v2[i] = (int) (10*Math.random()+1);
		}

		if(v1.length > v2.length) {
			v3 = new int[v1.length];
			// Sumar los dos arrays
			for (int i = 0; i < v2.length; i++) {
				v3[i] = v1[i] + v2[i];
			}

			// A–adir los elementos restantes
			for (int i = v2.length; i < v3.length; i++) {
				v3[i] = v1[i];
			}
		} else {
			v3 = new int[v2.length];
			// Sumar los dos arrays
			for (int i = 0; i < v1.length; i++) {
				v3[i] = v1[i] + v2[i];
			}

			// A–adir los elementos restantes
			for (int i = v1.length; i < v3.length; i++) {
				v3[i] = v2[i];
			}
		}

		// Imprimir el array resultante
		System.out.println("array 1 "+Arrays.toString(v1));
		System.out.println("array 2 "+Arrays.toString(v2));
		System.out.println("concatenados "+Arrays.toString(v3));

		// System.out.println(Arrays.toString(v3));

	}

}