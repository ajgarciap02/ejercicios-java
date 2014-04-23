package com.maialen.arrays;

import java.util.Arrays;

public class Ejercicio18 {

	/**
	 Construir un programa que pida al usuario dos vectores de nœmeros enteros v1 y v2, 
	 y que construya un nuevo vector del resultado de "concatenar" los vectores v1 y v2.
	  Es decir, colocar los elementos de v2 a continuaci—n de los de v1 y, 
	  finalmente, mostrar el resultado de la concatenaci—n por pantalla.
	 */
	public static void main(String[] args) {
		int[] listaNumeros1=new int[10];
		int[] listaNumeros2=new int[7];
		int[] listaNumeros=new int[listaNumeros1.length+listaNumeros2.length];
	
		int x;
		
		for(int i=0; i<listaNumeros1.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros1[i]=x;
		}
		for(int i=0; i<listaNumeros2.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros2[i]=x;
		}
		
		System.arraycopy(listaNumeros1, 0, listaNumeros, 0, listaNumeros1.length);
		System.arraycopy(listaNumeros2, 0, listaNumeros, listaNumeros1.length, listaNumeros2.length); 
		
		System.out.println("array 1 "+Arrays.toString(listaNumeros1));
		System.out.println("array 2 "+Arrays.toString(listaNumeros2));
		System.out.println("concatenados "+Arrays.toString(listaNumeros));
		
		
	}

}
