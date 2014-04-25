package com.maialen.fizzbuzz;

import java.util.ArrayList;

import com.maialen.excepciones.NumberNotValidException;
import com.maialen.interfaces.IValidador;


public class FizzBuzz {
	private ArrayList<IValidador> validadores=new ArrayList<IValidador>();
	/*
	public FizzBuzz() {
		validadores = new ArrayList<IValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
	}
	*/
	public String calcular(int num) {
		String res="";
		
		for(int i=1; i<=num; i++) {
			if (i != 1) {
				res += " ";
			}
			res += obtenerTexto(i);	
		}
		
		return res;
		
	}
	
	public String obtenerTexto(int num) {
		String pal = "";
		
		for (IValidador validador : validadores){
			try {
				if (validador.validar(num)){
					pal += validador.getOutput();
				}
			} catch (NumberNotValidException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (pal.length() == 0){
			pal += String.valueOf(num);
		}
		
		
		return pal;
	}
	
	/**
	 * Add a new validator
	 */
	public void addValidator(IValidador v) {
		if(!this.validadores.contains(v)) {
			this.validadores.add(v);
		}
	}
	
}