package com.maialen.clases.conDos;

import java.util.ArrayList;

public class ClaseCalcular {
	
	public static ArrayList<Integer> divisoresPrimos(int num){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int numIndices=1;
		lista.add(1);
		for(int i=2; i<=num;i++){
			if(esPrimo(i)){
				numIndices++;
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
