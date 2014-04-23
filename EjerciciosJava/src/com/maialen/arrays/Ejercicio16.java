package com.maialen.arrays;
import java.util.Arrays;
public class Ejercicio16 {

	/**
	 Construir un programa que genere serie de nœmeros enteros, 
	 los almacene en un array, y obtenga el m‡ximo y el m’nimo de los valores almacenados
	 */
	public static void main(String[] args) {
		
		int[] listaNumeros=new int[7];
		int x, max, min;
		max=-1;
		min=200;
		for(int i=0; i<listaNumeros.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros[i]=x;
			if(x>max){
				max=x;
			}
			if(x<min){
				min=x;
			}
		}
		
		System.out.println("La lista de arrays es "+Arrays.toString(listaNumeros));
		System.out.println("El minimo es "+min);
		System.out.println("El maximo es "+max);
		
		
	}

}
