package com.maialen.clases;

import java.util.ArrayList;
import java.util.Scanner;

import com.maialen.excepciones.JuegoExcepcion;
import com.maialen.factoria.Factoria;
import com.maialen.interfaces.IJugable;
import com.maialen.interfaces.IJuego;

public class Aplicacion {

	private static ArrayList<IJugable> juegos=new ArrayList<IJugable>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addJuego(Factoria.getJuegoAN());
		addJuego(Factoria.getJuegoImpar());
		addJuego(Factoria.getJuegoPar());
		
		IJugable juego=null;
		try {
			juego = eligeJuego();
		} catch (JuegoExcepcion e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Opcion no valida se terminara la ejecucion");
		}
		while(juego!=null){
			//para poder llamar a la clase hacer cast
			//((Juego) juego).reiniciarPartida(); //la funcion juega ya reinicia el juego por si misma
			System.out.println("-------Iniciando partida-------");
			juego.muestraInfo();
			try {
				juego.juega();
			} catch (JuegoExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Valor no valido, se reiniciara la partida");
			}
			System.out.println("\n");
			try {
				juego=eligeJuego();
			} catch (JuegoExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Opcion no valida, se reiniciara una partida");
			}
		}
		
		
	}
	
	public static IJugable eligeJuego() throws JuegoExcepcion{
		System.out.println("Intoduce el numero de la opcion deseada");
		int i=1;
		int num;
		for(IJugable j: juegos){
			System.out.println("\nOpcion "+i+"  ******************");
			j.muestraNombre();
			j.muestraInfo();
			i++;
		}
		System.out.println("Opcion "+i+" para terminar");
		//pedir un numero y leerlo del teclado
		System.out.println("Introduce un numero:");
		/*
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		*/
		num=Teclado.leeEntero();
		System.out.println("\n");
		if (num>juegos.size()){
			return null;
		}else{
			return juegos.get(num-1);
		}
	}
	

	/**
	 * Add a new validator
	 */
	public static void addJuego(IJugable j) {
		if(!juegos.contains(j)) {
			juegos.add(j);
		}
	}
	
}
