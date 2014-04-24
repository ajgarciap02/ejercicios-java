package com.maialen.fizzbuzz;

import java.util.ArrayList;

import com.maialen.validadores.Buzz;
import com.maialen.validadores.Fizz;
import com.maialen.validadores.Validador;

public class FizzBuzz {
	private ArrayList<Validador> validadores;
	
	public FizzBuzz() {
		validadores = new ArrayList<Validador>();
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
		
		for (Validador validador : validadores){
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