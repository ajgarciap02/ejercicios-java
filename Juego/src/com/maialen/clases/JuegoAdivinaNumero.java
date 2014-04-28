package com.maialen.clases;

import java.util.Scanner;

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
	public void juega() {
		super.reiniciarPartida();
		boolean fin=false;
		int num;
		while(!fin && this.obtenerVidas()>0){
			//pedir un numero y leerlo del teclado
			System.out.println("Introduce un numero:");
			Scanner entrada = new Scanner(System.in);
			num = entrada.nextInt();
			
			
			
			if( this.validaNumero(num) && num==this.valorObjetivo){
				System.out.println("Acertaste");
				this.actulizarRecord();
				fin=true;
			}else if(this.validaNumero(num)){
				if(!this.quitarVida()){//ya no le quedan vidas
					fin=true;
				}else{
					if(num>this.valorObjetivo){
						System.out.println("El numero introducido es mayor");
					}else{
						System.out.println("El numero introducido es menor");
					}
				}
			}else{
				System.out.println("El numero no es valido");
			}
			
		}
		

	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre);
		
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.info);
	}

	@Override
	public boolean validaNumero(int num) {
		return true;
	}

}
