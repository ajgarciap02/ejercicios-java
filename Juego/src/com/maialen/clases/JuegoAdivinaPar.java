package com.maialen.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int numVidas, int valor) {
		super(numVidas, valor);
		this.ponerNombre("Juego Adivina Par");
		this.ponerDescripcion("Introduce numeros pares");
	}

	@Override
	public boolean validaNumero(int num) {
		return num%2==0;
	}
	
}
