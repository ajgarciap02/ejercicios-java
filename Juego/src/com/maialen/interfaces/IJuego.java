package com.maialen.interfaces;

public interface IJuego {

	public void reiniciarPartida(); //reinicia la cantidad de vidas actuales a la cantidad de vidas iniciales
	public int obtenerVidas(); //devuelve la cantidad de vidas actuales
	public int obtenerVidasIniciales(); //devuelve la cantidad de vidas iniciales
	public int obtenerRecord(); //devuelve el record de la maquina
	public void muestraVidas(); //imprime las vidas actuales por consola
	public boolean quitarVida(); //decremente en 1 la cantidad de vidad actuales
	public void actulizarRecord(); 
	
	
}
