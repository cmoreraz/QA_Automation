package com.choucair.phptravels.models;

public class Package {
	
	private String clave;
	private String operador;
	private String tipo;
	private String valor;
	private String numero;
	private String codigoOperador;	
	private String strQuestion;
		
	public String getClave() {
		return clave;
	}
	
	public String getOperador() {
		return operador;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getNumero() {
		return numero;
	}
	public String getCodigoOperador() {
		return codigoOperador;
	}

	public void setCodigoOperador(String codigoOperador) {
		this.codigoOperador = codigoOperador;
	}

	public String getStrQuestion() {
		return strQuestion;
	}		
}
