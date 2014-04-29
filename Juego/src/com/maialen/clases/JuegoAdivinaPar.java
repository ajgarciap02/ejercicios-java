package com.maialen.clases;

import com.maialen.factoria.Factoria;

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
	
	@Override
	public void reiniciarPartida(){
		super.reiniciarPartida();
		super.ponerObjetivo(Factoria.numeroAleatorio0_10Par());
	}
	
}
