package com.maialen.excepciones;




public class JuegoExcepcion extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensage;

	public JuegoExcepcion(String mensage) {
		this.mensage = mensage;
	}

	public String getMensage() {
		return this.mensage;
	}

}