//Ejercicio 26
package com.maialen.poo;

public class Racional {

	private Integer numerador=0;
	private Integer denominador=1;
	
	public void asignaNumerador(int x){
		this.numerador=x;
		normalizar();
	}

	public void asignaDenominador(int y){
		setDenominador(y);
		normalizar();
	}
	
	public void imprimir(){
		
	}
	public String toString(){
		String cadena = "";
		cadena=String.valueOf(this.numerador)+"/"+String.valueOf(this.denominador);
		return cadena;
	}
	public Racional suma(Racional b){
		int numer=b.getNumerador()*this.denominador;
		this.numerador*=b.getDenominador();
		this.denominador*=b.getDenominador();
		this.numerador+=numer;
		normalizar();
		
		return this;
	}
	public Racional resta(Racional b){
		Integer numer=b.getNumerador()*this.denominador;
		this.numerador*=b.getDenominador();
		this.denominador*=b.getDenominador();
		this.numerador-=numer;
		normalizar();
		
		return this;
	}
	public Racional producto(Racional b){
		
		this.numerador*=b.getNumerador();
		this.denominador*=b.getDenominador();
		normalizar();
		
		return this;
	}
	public Racional division(Racional b){
		this.numerador*=b.getDenominador();
		this.denominador*=b.getNumerador();
		
		normalizar();
		return this;
	}
	public boolean esIgual(Racional b){
		return (this.numerador==b.getNumerador() && this.denominador==b.getDenominador() );
	}
	public void normalizar(){
		boolean encontrado=false;
		Integer div=Math.max(this.numerador, this.denominador);
		while(div>1 && !encontrado){
			encontrado=(this.numerador%div==0 && this.denominador%div==0);
			if(!encontrado){
				div--;
			}
		}
		this.denominador/=div;
		this.numerador/=div;	
	}
	
	//getters y setters
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if(denominador==0){
			this.denominador = 1;
			System.out.println("el denominador no puede ser 0, se pone a 1");
		}else{
			this.denominador = denominador;
		}
	}
}
