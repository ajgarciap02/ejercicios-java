package com.maialen.clases;

import java.util.ArrayList;

import com.maialen.interfaces.InterfazEmpleado;
import com.maialen.interfaces.InterfazEmpresa;

import factorias.EmpleadoFactoria;

public class Empresa implements InterfazEmpresa{
	
	private String nombre;
	private int tamano;
	
	private int contador=0;
	private int numerEmpleado=0;
	
	
	ArrayList<InterfazEmpleado> listaEmpleados=new ArrayList<InterfazEmpleado>();
	//private InterfazEmpleado[] empleados;
	
	public Empresa(String nom, int tam){
		this.nombre=nom;
		this.tamano=tam;

		
	}

	@Override
	public InterfazEmpleado getEmpleado(int num) {
		//recibe como argumento un nœmero entero menor que el tama–o de la empresa, 
		//y devuelve el correspondiente campo del array de empleados
		System.out.println(num);
		InterfazEmpleado empleado=null;
		if(num<contador){
			//System.out.println(empleados.length);
			//empleado=empleados[num];
			empleado=this.listaEmpleados.get(num);
		}
	
		return empleado;
	}

	@Override
	public void despedirEmpleado(int num) {
		// que recibe como argumento un nœmero entero menor que el tama–o de la empresa, 
		//y asigna null al correspondiente campo del array de empleados
		
		if(num<contador){
			this.listaEmpleados.remove(num);
			this.contador--;
		}
		
	}

	@Override
	public int getTamano() {
		// TODO Auto-generated method stub
		return this.tamano;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public int numeroContador() {
		// devuelve el numero de empleados actuales de la empresa
		return this.contador;
	}

	@Override
	public int nuevoContador() {
		// incrementa el numero de empleados actuales de la empresa y lo devuelve
		this.contador++;
		this.numerEmpleado++;
		return this.contador;
	}

	@Override
	public void nuevoEmpleado(String nom, float sueld) {
		//crea un nuevo empleado asociado a la empresa. Utilizamos el 
		//nœmero de empleado como ’ndice del array de empleados de la empresa.
		
		this.contador++;
		this.numerEmpleado++;
		Empleado emp=EmpleadoFactoria.getEmpleado(this, nom, sueld, this.contador);
		this.listaEmpleados.add(emp);
	}
	
}
