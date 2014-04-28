package com.maialen.factoria;

import com.maialen.clases.JuegoAdivinaImpar;
import com.maialen.clases.JuegoAdivinaNumero;
import com.maialen.clases.JuegoAdivinaPar;



public class Factoria {

	
	public static final JuegoAdivinaNumero getJuegoAN(int numVidas, int numero ) {
		JuegoAdivinaNumero j = new JuegoAdivinaNumero(numVidas, numero);
		return j;
	}
	
	public static final JuegoAdivinaImpar getJuegoImpar(int numVidas, int numero ) {
		JuegoAdivinaImpar j = new JuegoAdivinaImpar(numVidas, numero);
		return j;
	}
	public static final JuegoAdivinaPar getJuegoPar(int numVidas, int numero ) {
		JuegoAdivinaPar j = new JuegoAdivinaPar(numVidas, numero);
		return j;
	}
	
	
	
	
}
