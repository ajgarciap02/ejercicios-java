package com.maialen.clases;

import com.maialen.interfaces.IJuego;

public abstract class Juego implements IJuego {
	
	private int vidasIniciales;
	private int vidas;
	private static int record=0;
	
	public Juego(int numVidas){
		this.vidas=numVidas;
		this.vidasIniciales=numVidas;
	}
	
	
	@Override
	public int obtenerVidas() {
		return this.vidas;
	}

	@Override
	public int obtenerVidasIniciales() {
		return this.vidasIniciales;
	}

	@Override
	public int obtenerRecord() {
		return this.record;
	}

	@Override
	public void muestraVidas() {
		System.out.println(this.vidas);
	}

	@Override
	public boolean quitarVida() {
		//elimina una vida y devuelve true si quedan, false si se han agotado
		if(this.vidas>0){
			this.vidas--;
		}else{
			
		}
		return this.vidas!=0;
	}

	@Override
	public void reiniciarPartida() {
		// pone las vidas al valor de las vidas iniciales
		this.vidas=this.vidasIniciales;
	}

	@Override
	public void actulizarRecord() {
		String men="";
		// compara el valor actual del record con el numero de vidas
		if(this.vidas==this.record){
			men="Se ha alcanzado el record";
		}else if(this.vidas>this.record){
			this.record=this.vidas;
			men="Se ha batido el record. "+this.vidas;
		}
		System.out.println(men);
		//return men;
	}

}
