package com.maialen.clases.conDos;

import java.util.ArrayList;

public class ClaseCalcular {
	/*
	 Define static methods in the following scenarios only(stackoverflow.com):

	If you are writing utility classes and they are not supposed to be changed.
	If the method is not using any instance variable.
	If any operation is not dependent on instance creation.
	If there is some code that can easily be shared by all the instance methods, extract that code into a static method.
	If you are sure that the definition of the method will never be changed or overridden. As static methods can not be overridden.
	 */
	
	
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
