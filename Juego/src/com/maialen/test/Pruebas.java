package com.maialen.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Test;

import com.maialen.clases.Aplicacion;
import com.maialen.clases.JuegoAdivinaImpar;
import com.maialen.clases.JuegoAdivinaNumero;
import com.maialen.clases.JuegoAdivinaPar;
import com.maialen.excepciones.JuegoExcepcion;
import com.maialen.factoria.Factoria;
import com.maialen.interfaces.IJugable;

public class Pruebas {

	JuegoAdivinaNumero game1, game2 ;
	JuegoAdivinaImpar gameImpar;
	JuegoAdivinaPar gamePar;
	Aplicacion app;
	
	@Before
	public void setUp() throws Exception {
		
		game1 = Factoria.getJuegoANP(5, 8);
		game2 = Factoria.getJuegoANP(6, 4);
		
		gameImpar = Factoria.getJuegoImparP(3, 3);
		gamePar = Factoria.getJuegoParP(3, 4);
		
		app=new Aplicacion();
		
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
	public void testJugable() throws JuegoExcepcion {
		
		//pruebas para Jugable
	
		game1.muestraInfo();
		game1.muestraNombre();
		assertEquals("Jugable", "Adivinar numero", game1.obtenerNombre());
		assertEquals("Jugable", "Instrucciones del juego", game1.obtenerInfo());

		game1.ponerDescripcion("descripcion");
		game1.ponerNombre("nombre");
		
		assertEquals("Jugable", "nombre", game1.obtenerNombre());
		assertEquals("Jugable", "descripcion", game1.obtenerInfo());
		
		assertTrue(game1.validaNumero(8));
		assertTrue(game1.validaNumero(7));		
		
		assertEquals("JuegoPar", 3, gamePar.obtenerVidas());
		assertEquals("JuegoImpar", 3, gameImpar.obtenerVidas());
		
		assertTrue(gamePar.validaNumero(4));
		assertFalse(gamePar.validaNumero(3));
		assertTrue(gameImpar.validaNumero(3));
		assertFalse(gameImpar.validaNumero(4));
		assertEquals("JuegoPar", "Juego Adivina Par", gamePar.obtenerNombre());
		assertEquals("JuegoImpar", "Juego Adivina Impar", gameImpar.obtenerNombre());
		
	}
	
	@Test
	public void testApp() throws JuegoExcepcion {
		
		app.inicializar();
		
		ByteArrayInputStream in= new ByteArrayInputStream("1".getBytes());
		System.setIn(in);
		IJugable juego= app.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaNumero);
		
		in= new ByteArrayInputStream("2".getBytes());
		System.setIn(in);
		juego= app.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaImpar);
		
		in= new ByteArrayInputStream("3".getBytes());
		System.setIn(in);
		juego= app.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaPar);
		
		in= new ByteArrayInputStream("4".getBytes());
		System.setIn(in);
		juego= app.eligeJuego();
		assertEquals( null, juego);
		
		in= new ByteArrayInputStream("0".getBytes());
		System.setIn(in);
		juego= app.eligeJuego();
		assertEquals( null, juego);
		
		
		
		
		
	}


}
