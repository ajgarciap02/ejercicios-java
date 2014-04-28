package com.maialen.interfaces;

public interface IJuego {

	public int obtenerVidas();
	public int obtenerVidasIniciales();
	public int obtenerRecord();
	public void muestraVidas();
	
	public boolean quitarVida();
	public void reiniciarPartida();
	public void actulizarRecord();
	
	
}
