package com.maialen.validadores;

public class Fizz extends Validador{

	public Fizz(){
		super("Fizz");
	}
	
	public boolean validar(int num){
		return num % 3 == 0;
	}
	
}
