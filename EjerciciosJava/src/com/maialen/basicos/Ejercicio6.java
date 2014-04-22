package com.maialen.basicos;

import java.util.Scanner;

public class Ejercicio6 {

	/**
	 Construir un programa que calcule el ’ndice de masa corporal de una persona 
	 (IMC = peso [kg] / altura2[m]) e indique el estado en el que se encuentra esa 
	 persona en funci—n del valor de IMC:
	 */
	public static void main(String[] args) {
		
		float altura, peso, imc;
		
		System.out.println("Introduce la altura en metros:");
		Scanner entrada = new Scanner(System.in);
		altura = entrada.nextFloat();
		System.out.println("Introduce el peso:");
		peso =  entrada.nextFloat();
		
		imc= (float) (peso/Math.pow(altura, 2));
		
		System.out.println("IMC " +imc);
		
		if(imc <16){
			System.out.println("Criterio de ingreso en el hospital");
		}else if(imc <17){
			System.out.println("Infrapeso");
		}else if(imc <18){
			System.out.println("Bajo peso");
		}else if(imc <25){
			System.out.println("Peso normal, saludable");
		}else if(imc <30){
			System.out.println("Sobrepeso");
		}else if(imc <35){
			System.out.println("Sobrepeso cr—nico");
		}else if(imc <40){
			System.out.println("Obesidad prem—rbida");
		}else{
			System.out.println("Obesidad m—rbida");
		}

	}

}
