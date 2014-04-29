package com.maialen.clases;

import java.util.Scanner;

import com.maialen.excepciones.JuegoExcepcion;
import com.maialen.interfaces.IJugable;


public class JuegoAdivinaNumero extends Juego implements IJugable{
	
	private int valorObjetivo;
	private String nombre="Adivinar numero";
	private String info="Instrucciones del juego";

	public JuegoAdivinaNumero(int numVidas, int valor) {
		super(numVidas);
		// TODO Auto-generated constructor stub
		this.valorObjetivo=valor;
	}

	@Override
	public void juega() throws JuegoExcepcion {
		super.reiniciarPartida();
		boolean fin=false;
		int num;
		while(!fin && this.obtenerVidas()>0){
			//pedir un numero y leerlo del teclado
			System.out.println("Introduce un numero:");
			/*
			Scanner entrada = new Scanner(System.in);
			num = entrada.nextInt();
			*/
			num=Teclado.leeEntero();
			if( this.validaNumero(num) && num==this.valorObjetivo){
				System.out.println("Acertaste");
				this.actulizarRecord();
				fin=true;
			}else if(this.validaNumero(num)){
				if(!this.quitarVida()){//ya no le quedan vidas
					fin=true;
				}else{
					if(num>this.valorObjetivo){
						System.out.println("El numero introducido es mayor que el objetivo");
					}else{
						System.out.println("El numero introducido es menor que el objetivo");
					}
				}
			}else{
				System.out.println("El numero no es valido");
			}
		}
	}

	@Override
	public String obtenerNombre() {
		//devuelve el nombre del juego
		return this.nombre;
	}

	@Override
	public void muestraNombre() {
		// imprime por consola el nombre del juego
		System.out.println(this.nombre);
		
	}

	@Override
	public void muestraInfo() {
		// imprime por consola la informacion del juego
		System.out.println(this.info);
	}

	@Override
	public boolean validaNumero(int num) {
		//comprueba si el numero cumple las condiciones de entrada del jeugo
		return true;
	}

	@Override
	public void ponerNombre(String nom) {
		this.nombre=nom;
	}

	@Override
	public void ponerDescripcion(String descripcion) {
		this.info=descripcion;
	}

}
