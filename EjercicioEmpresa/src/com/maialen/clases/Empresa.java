package com.maialen.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.maialen.interfaces.InterfazEmpleado;
import com.maialen.interfaces.InterfazEmpresa;

import factorias.EmpleadoFactoria;

public class Empresa implements InterfazEmpresa{
	
	private String nombre;
	private int tamano;
	
	private int contador=0;//catidad de empleados empleados en el momento actual
	private int numerEmpleado=0; //numero para identificar al empleado, la cantidad que ha habido
	
	
	private ArrayList<InterfazEmpleado> listaEmpleados=new ArrayList<InterfazEmpleado>();
	private int[] posicion; //array que almacena los numeros de los empleados segun su posicion en la lista
	
	public Empresa(String nom, int tam){
		this.nombre=nom;
		this.tamano=tam;

		posicion=new int[tam];
	}

	@Override
	public void nuevoEmpleado(String nom, float sueld) {
		//crea un nuevo empleado asociado a la empresa. Utilizamos el 
		//nœmero de empleado como ’ndice del array de empleados de la empresa.
		
		this.contador++;//cantidad de empleados en la empresa
		this.numerEmpleado++;//numero para identificar al empleado
		this.posicion[this.contador]=this.numerEmpleado;
		Empleado emp=EmpleadoFactoria.getEmpleado(this, nom, sueld, this.contador);
		this.listaEmpleados.add(emp);
		
		
	}
	
	private int indiceEmpleado(int num){
	
		int p=Arrays.binarySearch(Arrays.copyOfRange(this.posicion, 0, this.contador),num);
		return p;
	}
	
	
	@Override
	public InterfazEmpleado getEmpleado(int num) {
		//recibe como argumento un nœmero entero menor que el tama–o de la empresa, 
		//y devuelve el correspondiente campo del array de empleados

		InterfazEmpleado empleado=null;
		if(num<contador){
			
			empleado=this.listaEmpleados.get(indiceEmpleado(num));
		}
		return empleado;
	}

	@Override
	public void despedirEmpleado(int num) {
		// que recibe como argumento un nœmero entero menor que el tama–o de la empresa, 
		//y asigna null al correspondiente campo del array de empleados
		
		if(num<contador){
			int pos=indiceEmpleado(num);
			this.listaEmpleados.remove(pos);
			this.contador--;
			//arreglar el array de posiciones
			for(int i=pos; i<this.tamano-1;i++){
				this.posicion[i]=this.posicion[i+1];
			}
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
	public void ascender(InterfazEmpleado ejecutivo) {
		// el empleado con el numero que tiene el nuevo ejecutivo se reemplaza por el ejecutivo
		int pos=indiceEmpleado(ejecutivo.getNumEmpleado());
		this.listaEmpleados.set(pos, ejecutivo);
	}

	
	//para ver toda la empresa
	public String toString(){
		String mensaje=this.nombre+"\n";
		mensaje+="Lista de empleados\n";
		
		 for (InterfazEmpleado emp : this.listaEmpleados){
			 mensaje+=emp.toString()+"\n";
		 }
		
		 System.out.println(mensaje);
		 
		return mensaje;
		
		
	}
	
	
	
}
