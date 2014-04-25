package com.maialen.validadores;

import com.maialen.interfaces.IValidador;

public class Fizz implements IValidador{

	private int numero=3;
	private String output="Fizz";
	
	public String getOutput(){
		return output;
	}
	
	public boolean validar(int num){
		return num % numero == 0;
	}
	
}
