package com.maialen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.maialen.clases.Empleado;
import com.maialen.clases.Empresa;



public class Pruebas {

	Empresa empresa, empresa2;
	Empleado emp1, emp2, emp3, emp4, emp5, emp6;

	
	@Before
	public void setUp() throws Exception {
		//inicializaciones
		empresa=new Empresa("nombre1",10);
		empresa2=new Empresa("segunda",4);
		
		empresa.nuevoEmpleado("empleado1", 1000);
		empresa.nuevoEmpleado("empleado2", 1800);
		empresa2.nuevoEmpleado("empleado3", 22222);
		empresa2.nuevoEmpleado("empleado4", 33000);
		
		
		emp1=(Empleado) empresa.getEmpleado(0);
		emp2=(Empleado) empresa.getEmpleado(1);
		emp3=(Empleado) empresa2.getEmpleado(0);
		
		
		
	}

	@Test
	public void testEmpresa() {
		assertEquals("nombre", "nombre1", empresa.getNombre());
		assertEquals("tamano", 10, empresa.getTamano());
		assertEquals("nombre", "segunda", empresa2.getNombre());
		assertEquals("tamano", 4, empresa2.getTamano());
		
		assertEquals("contador", 2, empresa.numeroContador());
		assertEquals("contador", 2, empresa2.numeroContador());
		
		
		assertEquals("Empleado 1", "empleado1", empresa.getEmpleado(0).getNombre());
		assertEquals("Empleado 2", "empleado2", empresa.getEmpleado(1).getNombre());
		
		assertEquals("Empleado 4", "empleado4", empresa2.getEmpleado(1).getNombre());
		
		empresa2.despedirEmpleado(1);
		assertEquals("Empleado 4", null, empresa2.getEmpleado(1));
		
		
		empresa.nuevoEmpleado("empleado5", 1000);
		empresa.nuevoEmpleado("empleado6", 1000);
		
		
		
		
		emp5=(Empleado) empresa.getEmpleado(2);
		emp6=(Empleado) empresa.getEmpleado(3);
	
		assertEquals("Empleado 5", 3, emp5.getNumEmpleado());
		assertEquals("Empleado 6", 4, emp6.getNumEmpleado());
		
		assertEquals("Empleado 5", "empleado5", emp5.getNombre());
		assertEquals("Empleado 6", "empleado6", emp6.getNombre());
	
		
	}
	
	
	@Test
	public void testEmpleado() {
		assertEquals("Empleado 1", "empleado1", emp1.getNombre());
		assertEquals("Empleado 2", "empleado2", emp2.getNombre());
		assertEquals("Empleado 3", "empleado3", emp3.getNombre());
		
		assertEquals("Empleado 1", 1, emp1.getNumEmpleado());
		assertEquals("Empleado 2", 2, emp2.getNumEmpleado());
		assertEquals("Empleado 3", 1, emp3.getNumEmpleado());
		
		assertEquals("Empleado 1", 1000.00, emp1.getSueldo(),0);
		assertEquals("Empleado 2", 1800, emp2.getSueldo(),0);
		assertEquals("Empleado 3", 22222, emp3.getSueldo(),0);
		
		assertEquals("Empleado 1", "1: empleado1 1000.0", emp1.toString());
		assertEquals("Empleado 2", "2: empleado2 1800.0", emp2.toString());
		assertEquals("Empleado 3", "1: empleado3 22222.0", emp3.toString());
		emp1.aumentarSueldo(20);
		assertEquals("Empleado 1", 1200.00, emp1.getSueldo(),0);
		
		
	}
	
	@Test
	public void testAscender() {
		
		
		
		
	}

}
