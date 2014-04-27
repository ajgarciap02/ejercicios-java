package com.maialen.clases;
import com.maialen.interfaces.InterfazEmpleado;
import com.maialen.interfaces.InterfazEmpresa;
public class Empleado implements InterfazEmpleado{

	protected String nombre;
	protected float sueldo;
	/*los dos siguientes tienen que ser inmutables*/
	protected int numero;
	protected InterfazEmpresa empresa;
	
	public Empleado(InterfazEmpresa emp, String nom, float suel){
		this.nombre=nom;
		this.sueldo=suel;
		this.empresa=emp;
		this.numero=this.empresa.nuevoContador();
	}
	public Empleado(InterfazEmpresa emp, String nom, float suel, int num){
		this.nombre=nom;
		this.sueldo=suel;
		this.empresa=emp;
		this.numero=num;
	}
	
	@Override
	public String getNombre() {
		
		return this.nombre;
	}
	@Override
	public float getSueldo() {
		
		return this.sueldo;
	}
	@Override
	public void setNombre(String nom) {
		
		this.nombre=nom;
		
	}
	@Override
	public void setSueldo(float num) {
		
		this.sueldo=num;
		
	}

	@Override
	public int getNumEmpleado() {
		
		return this.numero;
	}

	@Override
	public final void aumentarSueldo(int porcentaje) {
		//recibe como argumento un número entero N y modifica el sueldo aumentándolo 
		//un N%. Éste método no puede ser modificado por clases derivadas
		
		float aumento=  (float) (1.0+ (float)(porcentaje)/100.0);
		this.sueldo=this.sueldo*aumento;
		
	}

	@Override
	public void despedir() {
		// TODO Auto-generated method stub
		this.empresa.despedirEmpleado(this.numero);
		this.empresa=null;
		
	}

	@Override
	public String toString(){
		String res=String.valueOf(this.numero)+": "+nombre+" "+String.valueOf(this.sueldo);
		return res;
	}

}
