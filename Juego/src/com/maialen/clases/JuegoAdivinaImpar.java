package com.maialen.clases;

import com.maialen.factoria.Factoria;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int numVidas, int valor) {
		super(numVidas, valor);
		// TODO Auto-generated constructor stub
		this.ponerNombre("Juego Adivina Impar");
		this.ponerDescripcion("Introduce numeros impares");
	}

	@Override
	public boolean validaNumero(int num) {
		return num%2!=0;
	}
	
	@Override
	public void reiniciarPartida(){
		super.reiniciarPartida();
		super.ponerObjetivo(Factoria.numeroAleatorio0_10Impar());
	}
}