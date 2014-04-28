package com.maialen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.maialen.clases.JuegoAdivinaImpar;
import com.maialen.clases.JuegoAdivinaNumero;
import com.maialen.clases.JuegoAdivinaPar;
import com.maialen.factoria.Factoria;

public class Pruebas {

	JuegoAdivinaNumero game1, game2 ;
	JuegoAdivinaImpar gameImpar;
	JuegoAdivinaPar gamePar;
	
	@Before
	public void setUp() throws Exception {
		
		game1 = Factoria.getJuegoANP(5, 8);
		game2 = Factoria.getJuegoANP(6, 4);
		
		gameImpar = Factoria.getJuegoImparP(3, 3);
		gamePar = Factoria.getJuegoParP(3, 4);
		
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
		
		//juego par
		
		assertEquals("JuegoPar", 3, gamePar.obtenerVidas());
		assertEquals("JuegoImpar", 3, gameImpar.obtenerVidas());
		
		assertTrue(gamePar.validaNumero(4));
		assertFalse(gamePar.validaNumero(3));
		assertTrue(gameImpar.validaNumero(3));
		assertFalse(gameImpar.validaNumero(4));
		assertEquals("JuegoPar", "Juego Adivina Par", gamePar.obtenerNombre());
		assertEquals("JuegoImpar", "Juego Adivina Impar", gameImpar.obtenerNombre());
		
		
	}


}
