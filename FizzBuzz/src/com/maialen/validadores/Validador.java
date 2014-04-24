package com.maialen.validadores;

import com.maialen.interfaces.IValidador;

public abstract class Validador implements IValidador{
	
	private String output;
	
	public Validador(String msg){
		this.output = msg;
	}
	
	public abstract boolean validar(int num);
	
	public String getOutput(){
		return output;
	}

}
