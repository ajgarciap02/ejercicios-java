package com.maialen.interfaces;

import com.maialen.excepciones.NumberNotValidException;

public interface IValidador {
	
	public boolean validar(int num) throws NumberNotValidException;
	public String getOutput();
	public void setOutput(String palabra);
	public void setCondicion(int condicion);
	
}
