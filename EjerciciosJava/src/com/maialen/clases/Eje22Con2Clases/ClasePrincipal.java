package com.maialen.clases.Eje22Con2Clases;

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
		
		ClaseCalcular calcular=new ClaseCalcular(num);
		
		ArrayList<Integer> lista ;
		lista= calcular.divisoresPrimos();
		
		System.out.println(Arrays.toString(lista.toArray()));
		
		
		System.out.println("Introduce otro numero (con clase de utilidad):");
		
		num = entrada.nextInt();
		lista= PrimosClaseUtilidades.divisoresPrimos(num);
		
		System.out.println(Arrays.toString(lista.toArray()));

	}

}
