package com.maialen.interfaces;

import com.maialen.excepciones.JuegoExcepcion;

public interface IJugable {

	public void juega() throws JuegoExcepcion;
	public boolean validaNumero(int num);//compruba si el numero el valido para el juego
	public void ponerNombre(String nombre);
	public void ponerDescripcion(String descripcion);
	public void muestraNombre();//muestra el nombre por consola
	public void muestraInfo();//muestra la descripcion por consola
	public String obtenerNombre(); //devuelve en nombre del juego
	public String obtenerInfo(); //devuelve la informacion del juego
	
	
	
}
