package com.maialen.clases.conDos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ClasePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		System.out.println("Introduce un numero (con dos clases):");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		ArrayList<Integer> lista ;
		lista=ClaseCalcular.divisoresPrimos(num);
		
		System.out.println(Arrays.toString(lista.toArray()));

	}

}
