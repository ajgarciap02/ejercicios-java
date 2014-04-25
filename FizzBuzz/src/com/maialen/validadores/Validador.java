package com.maialen.validadores;

import com.maialen.excepciones.NumberNotValidException;
import com.maialen.interfaces.IValidador;

public abstract class Validador implements IValidador{
	
	private String output;
	private int numero;
	private int condicion=1;
	
	public Validador(String msg, int num){
		this.output = msg;
		this.numero=num;
	}
	
	//public abstract boolean validar(int num);
	
	public String getOutput(){
		return output;
	}
	
	public boolean validar(int num) throws NumberNotValidException{
		
		validateException(num);
		
		return num % numero == 0;
	}

	public void setOutput(String palabra){
		output=palabra;
	}
	
	public void setCondicion(int cond){
		condicion=cond;
	}
	
	protected void validateException(int num)throws NumberNotValidException{
		if(num<condicion){
			throw new NumberNotValidException("Numero menor que "+condicion);
		}
	}
}
