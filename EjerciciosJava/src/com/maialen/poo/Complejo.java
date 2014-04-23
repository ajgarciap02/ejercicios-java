//ejercicio 25

package com.maialen.poo;

public class Complejo {
	
	private double pReal;
	private double pImag;
	
	public void asignar(double x, double y){
		this.pReal=x;
		this.pImag=y;
	}
	public void sumar(Complejo b){
		this.pReal+=b.getpReal();
		this.pImag+=b.getpImag();
	}
	
	public String toString(){
		String cadena = "";
		cadena= String.valueOf(this.pReal)+"+"+String.valueOf(this.pImag)+"i";
		return cadena;
	}

	
	//getters y setters
	
	public double getpReal() {
		return pReal;
	}
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	public double getpImag() {
		return pImag;
	}
	public void setpImag(double pImag) {
		this.pImag = pImag;
	}
	
	
	
}
