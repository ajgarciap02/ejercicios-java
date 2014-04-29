package com.maialen.factoria;

import com.maialen.clases.JuegoAdivinaImpar;
import com.maialen.clases.JuegoAdivinaNumero;
import com.maialen.clases.JuegoAdivinaPar;



public class Factoria {
	private static int numVidas=3;
	
	public static final JuegoAdivinaNumero getJuegoAN( ) {
		JuegoAdivinaNumero j = new JuegoAdivinaNumero(numVidas, numeroAleatorio0_10());
		return j;
	}
	
	public static final JuegoAdivinaImpar getJuegoImpar( ) {
		int i=0;
		while(esPar(i)){
			i=numeroAleatorio0_10();
		}
		JuegoAdivinaImpar j = new JuegoAdivinaImpar(numVidas, i);
		return j;
	}
	
	public static final JuegoAdivinaPar getJuegoPar() {
		int i=1;
		while(!esPar(i)){
			i=numeroAleatorio0_10();
		}
		JuegoAdivinaPar j = new JuegoAdivinaPar(numVidas, i);
		return j;
	}
	
	//para las pruebas
	public static final JuegoAdivinaNumero getJuegoANP(int numVidas, int numero ) {
		JuegoAdivinaNumero j = new JuegoAdivinaNumero(numVidas, numero);
		return j;
	}
	
	public static final JuegoAdivinaImpar getJuegoImparP(int numVidas, int numero ) {
		JuegoAdivinaImpar j = new JuegoAdivinaImpar(numVidas, numero);
		return j;
	}
	public static final JuegoAdivinaPar getJuegoParP(int numVidas, int numero ) {
		JuegoAdivinaPar j = new JuegoAdivinaPar(numVidas, numero);
		return j;
	}
	
	public static int numeroAleatorio0_10(){
		return (int) (10*Math.random());
	}
	public static boolean esPar(int num){
		return num%2==0;
	}
	
}
