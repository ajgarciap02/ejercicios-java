package com.maialen.fizzbuzz;

public class FizzBuzz {
	
	public String calcular(int num){
		String res="";
		
		for(int i=1; i<=num; i++)
		{
			res+=obtenerTexto(i)+" ";	
		}
		
		return res;
		
	}
	
	public boolean divisor3(int num){
		
		return num%3==0;
		
	}
	public boolean divisor5(int num){
		
		return num%5==0;
		
	}
	public String obtenerTexto(int num){
		String pal="";
		
		if(divisor3(num)){
			pal+="Fizz";
		}
		if(divisor5(num)){
			pal+="Buzz";
		}else {
			if(!divisor3(num)){
				pal=String.valueOf(num);
			}
		}
		return pal;
	}
	
}
