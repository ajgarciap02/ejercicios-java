package com.maialen.clases.Eje22Con2Clases;

import java.util.ArrayList;
/*
 abstract--> para evitar que se pueda instanciar
 */
public abstract class PrimosClaseUtilidades {
	
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
