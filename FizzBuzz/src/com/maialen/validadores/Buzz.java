package com.maialen.validadores;

public class Buzz extends Validador{
	
	public Buzz(){
		super("Buzz");
	}
	
	public boolean validar(int num){
		return num % 5 == 0;
	}
}
