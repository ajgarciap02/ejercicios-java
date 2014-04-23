//ejercicio 25

package com.maialen.poo;

public class Complejo {
	
	private static int numInstancias=0;
	
	private double pReal;
	private double pImag;
	
	
	public Complejo(){
		numInstancias++;
	}
	
	public void asignar(double x, double y){
		this.pReal=x;
		this.pImag=y;
	}
	
	public void sumar(Complejo b){
		this.pReal+=b.getpReal();
		this.pImag+=b.getpImag();
	}
	
	public static Complejo sumar(Complejo a, Complejo b){
		Complejo c=new Complejo();
		c.asignar(a.getpReal(), a.getpImag());
		c.sumar(b);
		return c;
	}
	
	public String toString(){
		String cadena = "";
		cadena= String.valueOf(this.pReal)+"+"+String.valueOf(this.pImag)+"i";
		return cadena;
	}

	public boolean equal(Complejo a){
		return (this.pReal==a.getpReal() && this.pImag==a.getpImag());
	}
	
	//getters y setters
	public static int numInstancias() {
		return numInstancias;
	}
	
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
