package com.maialen.interfaces;

public interface InterfazEmpleado {
	public String getNombre();
	public float getSueldo();
	public void setNombre(String nom);
	public void setSueldo(float num);
	public int getNumEmpleado();
	public String toString();
	public void aumentarSueldo(int porcentaje); //tiene que ser final
	public void despedir();
}
