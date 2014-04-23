//Ejercicio 24
package com.maialen.clasesEstandar;

import java.util.Scanner;

public class PruebaVerificarDNI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Introduce un DNI (8 digitos y la letra):");
		String dni;
		Scanner entrada = new Scanner(System.in);
		dni = entrada.nextLine();
		
		System.out.println("valido-->"+VerificarDNI.validarDNI(dni));
		

	}

}
