package factorias;

import com.maialen.clases.Ejecutivo;
import com.maialen.clases.Empleado;
import com.maialen.interfaces.InterfazEmpresa;



public class EmpleadoFactoria {
	//crear empleados
	public static final Empleado getEmpleado(InterfazEmpresa emp, String nom, float suel){
		Empleado empl = new Empleado(emp, nom, suel);
		
		return empl;
		
	}
	public static final Empleado getEmpleado(InterfazEmpresa emp, String nom, float suel, int num){
		Empleado empl = new Empleado(emp, nom, suel, num);
		
		return empl;
		
	}
	
	
	//crear ejecutivos
	public static final Ejecutivo getEjecutivo(InterfazEmpresa emp, String nom, float suel){
		Ejecutivo empl = new Ejecutivo(emp, nom, suel);
		
		return empl;
		
	}
	public static final Ejecutivo getEjecutivo(InterfazEmpresa emp, String nom, float suel, int num){
		Ejecutivo empl = new Ejecutivo(emp, nom, suel, num);
		
		return empl;
		
	}
	
	
	
	
}
