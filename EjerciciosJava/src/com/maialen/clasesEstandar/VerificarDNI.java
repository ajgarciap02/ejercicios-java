//Ejercicio 24
package com.maialen.clasesEstandar;
//al ser abstracta no se puede instanciar
public abstract class VerificarDNI {

	private static String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	public static boolean validarDNI(String dni){
		boolean resultado=false;
		int numerosDNI;
		int posicion;
		char letra;
		System.out.println(dni);
		dni=dni.toUpperCase();
		if(dni.length()==9 ){
			letra=dni.charAt(8);
			if(Character.isLetter(letra)){
				numerosDNI=Integer.parseInt(dni.substring(0, dni.length()-1));	
				posicion=numerosDNI % 23;
				resultado=letras.charAt(posicion)==letra;
				System.out.println(letras.charAt(posicion));
			}else{
				System.out.println("tiene que terminar con una letra");
			}
		}else{
			System.out.println("la longitud no es correcta");
		}
			
		return resultado;
	}
	
	
}
