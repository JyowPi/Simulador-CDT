package com.empresa.model;

public class CDT {

	protected int numeroDias;
	protected Double valorAinvertir;
	protected Double tasaInteresAnual;
	protected Double tasaEfectivaAnual;
	protected Double rentabilidadPorPeriodo;
	protected Double rentabilidadNeta;
	protected Double reteFuente;
	protected Double gananciaBruta;
	protected Double montoFinal;

	

	public CDT(int numeroDias, Double valorAinvertir, Double tasaInteresAnual, Double tasaEfectivaAnual,
			Double rentabilidadPorPeriodo, Double rentabilidadNeta, Double reteFuente, Double gananciaBruta,
			Double montoFinal) {
		super();
		this.numeroDias = numeroDias;
		this.valorAinvertir = valorAinvertir;
		this.tasaInteresAnual = tasaInteresAnual;
		this.tasaEfectivaAnual = tasaEfectivaAnual;
		this.rentabilidadPorPeriodo = rentabilidadPorPeriodo;
		this.rentabilidadNeta = rentabilidadNeta;
		this.reteFuente = reteFuente;
		this.gananciaBruta = gananciaBruta;
		this.montoFinal = montoFinal;
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

	

	public Double getTasaEfectivaAnual() {
		return tasaEfectivaAnual;
	}


	public void setTasaEfectivaAnual(Double tasaEfectivaAnual) {
		this.tasaEfectivaAnual = tasaEfectivaAnual;
	}


	public Double getRentabilidadPorPeriodo() {
		return rentabilidadPorPeriodo;
	}


	public void setRentabilidadPorPeriodo(Double rentabilidadPorPeriodo) {
		this.rentabilidadPorPeriodo = rentabilidadPorPeriodo;
	}


	public Double getRentabilidadNeta() {
		return rentabilidadNeta;
	}


	public void setRentabilidadNeta(Double rentabilidadNeta) {
		this.rentabilidadNeta = rentabilidadNeta;
	}


	public Double getReteFuente() {
		return reteFuente;
	}


	public void setReteFuente(Double reteFuente) {
		this.reteFuente = reteFuente;
	}


	public Double getGananciaBruta() {
		return gananciaBruta;
	}


	public void setGananciaBruta(Double gananciaBruta) {
		this.gananciaBruta = gananciaBruta;
	}


	public Double getMontoFinal() {
		return montoFinal;
	}


	public void setMontoFinal(Double montoFinal) {
		this.montoFinal = montoFinal;
	}
	
	
	
}

