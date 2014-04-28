package com.maialen.interfaces;

public interface InterfazEmpresa {

	public String getNombre();
	public int getTamano();
	
	public InterfazEmpleado getEmpleado(int num);
	public void despedirEmpleado(int num);
	
	public void nuevoEmpleado(String nom, float sueld);
	
	public void ascender(InterfazEmpleado ejecutivo);
	
	//funciones propias
	public int numeroContador();
	public int nuevoContador();
	
}
