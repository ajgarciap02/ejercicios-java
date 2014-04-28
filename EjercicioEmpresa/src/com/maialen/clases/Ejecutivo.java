package com.maialen.clases;

import com.maialen.interfaces.InterfazEmpresa;

public class Ejecutivo extends Empleado{
	
	private float presupuesto;

	public Ejecutivo(InterfazEmpresa emp, String nom, float suel) {
		super(emp, nom, suel);
		// TODO Auto-generated constructor stub
	}

	public Ejecutivo(InterfazEmpresa emp, String nom, float suel, int num) {
		super(emp, nom, suel, num);
		// TODO Auto-generated constructor stub
	}

	public void asignarPresuspuesto(int pres){
		this.presupuesto=pres;
	}
	
	@Override
	public String toString(){
		
		return super.toString()+" (Ejecutivo)";
	}
	
	
	//getters y setters
	
	public float getPresupuesto() {
		return presupuesto;
	}
/*
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}
*/
}
