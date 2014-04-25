package factorias;

import com.maialen.clases.Empleado;
import com.maialen.interfaces.InterfazEmpresa;



public class EmpleadoFactoria {

	public static final Empleado getEmpleado(InterfazEmpresa emp, String nom, float suel){
		Empleado empl = new Empleado(emp, nom, suel);
		
		return empl;
		
	}
	public static final Empleado getEmpleado(InterfazEmpresa emp, String nom, float suel, int num){
		Empleado empl = new Empleado(emp, nom, suel, num);
		
		return empl;
		
	}
	
	
}
