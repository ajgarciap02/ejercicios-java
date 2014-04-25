package com.maialen.validadores;

import com.maialen.interfaces.IValidador;

public class Buzz implements IValidador{

	private int numero=5;
	private String output="Buzz";
	
	public String getOutput(){
		return output;
	}
	
	public boolean validar(int num){
		return num % numero == 0;
	}
	
}
