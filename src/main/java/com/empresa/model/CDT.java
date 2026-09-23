package com.empresa.model;

public class CDT {

	protected int numeroDias;
	protected Double valorAinvertir;
	protected Double tasaInteresAnual;
	protected Double gananciaBruta;
	
	
	public CDT(int numeroDias, Double valorAinvertir, Double tasaInteresAnual, Double gananciaBruta) {
		super();
		this.numeroDias = numeroDias;
		this.valorAinvertir = valorAinvertir;
		this.tasaInteresAnual = tasaInteresAnual;
		this.gananciaBruta = gananciaBruta;
	}


	public CDT() {
		super();
	}


	public int getNumeroDias() {
		return numeroDias;
	}


	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}


	public Double getValorAinvertir() {
		return valorAinvertir;
	}


	public void setValorAinvertir(Double valorAinvertir) {
		this.valorAinvertir = valorAinvertir;
	}


	public Double getTasaInteresAnual() {
		return tasaInteresAnual;
	}


	public void setTasaInteresAnual(Double tasaInteresAnual) {
		this.tasaInteresAnual = tasaInteresAnual;
	}


	public Double getGananciaBruta() {
		return gananciaBruta;
	}


	public void setGananciaBruta(Double gananciaBruta) {
		this.gananciaBruta = gananciaBruta;
	}
	
	
	
}
