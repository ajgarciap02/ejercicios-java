package com.maialen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.maialen.clases.JuegoAdivinaNumero;
import com.maialen.factoria.Factoria;

public class Pruebas {

	JuegoAdivinaNumero game1, game2 ;
	
	@Before
	public void setUp() throws Exception {
		
		game1 = Factoria.getJuegoAN(5, 8);
		game2 = Factoria.getJuegoAN(6, 4);
		
		
	}

	@Test
	public void testJuego() {
		
		//pruebas para Juego
		assertEquals("Juego", 5, game1.obtenerVidasIniciales());
		assertEquals("Juego", 6, game2.obtenerVidasIniciales());
		assertEquals("Juego", 5, game1.obtenerVidas());
		assertEquals("Juego", 6, game2.obtenerVidas());
		assertEquals("Juego", 0, game1.obtenerRecord());
		assertEquals("Juego", 0, game2.obtenerRecord());
		
		assertEquals("Juego", true, game1.quitarVida());
		assertEquals("Juego", true, game2.quitarVida());
		assertEquals("Juego", 4, game1.obtenerVidas());
		assertEquals("Juego", 5, game2.obtenerVidas());
		
		game1.actulizarRecord();
		assertEquals("Juego", 4, game1.obtenerRecord());
		game2.actulizarRecord();
		assertEquals("Juego", 5, game1.obtenerRecord());
		
		game1.reiniciarPartida();
		game2.reiniciarPartida();
		assertEquals("Juego", 5, game1.obtenerVidas());
		assertEquals("Juego", 6, game2.obtenerVidas());
		
	}
	@Test
	public void testJugable() {
		
		//pruebas para Jugable
	
		game1.muestraInfo();
		game1.muestraNombre();
		assertEquals("Jugable", "Adivinar numero", game1.obtenerNombre());
		//game1.juega();
		
	}


}
