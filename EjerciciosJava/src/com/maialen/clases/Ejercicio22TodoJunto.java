package com.maialen.clases;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio22TodoJunto {

	/**
	 Una funci—n que tome como par‡metro un nœmero y devuelve un array con 
	 el nœmero de primos que tiene entre 1 y n. 
	 Otra funci—n o utilizar la anterior que indique si un nœmero es primo o no.
	 */
	public static void main(String[] args) {
		int num;
		System.out.println("Introduce un numero:");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		ArrayList<Integer> lista ;
		lista=divisoresPrimos(num);
		
		System.out.println(Arrays.toString(lista.toArray()));

	}
	
	public static ArrayList<Integer> divisoresPrimos(int num){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		for(int i=2; i<=num;i++){
			if(esPrimo(i)){
				lista.add(new Integer(i));
			}
		}
		
		return lista;
	}

	public static boolean esPrimo(int num){
		
		boolean primo=true;
		int i=2;
		while (primo && i<num){
			if(num%i==0){
				primo=false;
			}
			i++;
		}		
		return primo;
	}
}
