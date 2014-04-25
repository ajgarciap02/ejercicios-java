package com.maialen.validadores;

import com.maialen.interfaces.IValidador;

public abstract class Validador implements IValidador{
	
	private String output;
	private int numero;
	
	public Validador(String msg, int num){
		this.output = msg;
		this.numero=num;
	}
	
	//public abstract boolean validar(int num);
	
	public String getOutput(){
		return output;
	}
	
	public boolean validar(int num){
		return num % numero == 0;
	}

}
