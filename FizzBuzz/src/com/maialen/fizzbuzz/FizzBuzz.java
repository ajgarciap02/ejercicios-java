package com.maialen.fizzbuzz;

import java.util.ArrayList;

import com.maialen.interfaces.IValidador;
import com.maialen.validadores.Buzz;
import com.maialen.validadores.Fizz;


public class FizzBuzz {
	private ArrayList<IValidador> validadores;
	
	public FizzBuzz() {
		validadores = new ArrayList<IValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
	}
	
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
	
	public String obtenerTexto(int num){
		String pal = "";
		
		for (IValidador validador : validadores){
			if (validador.validar(num)){
				pal += validador.getOutput();
			}
		}
		
		if (pal.length() == 0){
			pal += String.valueOf(num);
		}
		
		
		return pal;
	}
	
}