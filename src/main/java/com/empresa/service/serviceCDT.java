package com.empresa.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.model.CDT;
import com.empresa.model.Persona;
import com.empresa.util.JSON;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;

public class serviceCDT {

	public Persona objPersona = new Persona();
	public CDT cdt = new CDT();
	public ArrayList<Persona> listPer = new ArrayList<Persona>();
	public ArrayList<CDT> listCDT = new ArrayList<CDT>();

	public serviceCDT() {
		super();
	}

	public serviceCDT(Persona objPersona, CDT cdt) {
		super();
		this.objPersona = objPersona;
		this.cdt = cdt;
	}

	public Persona getObjPersona() {
		return objPersona;
	}

	public void setObjPersona(Persona objPersona) {
		this.objPersona = objPersona;
	}

	public CDT getCdt() {
		return cdt;
	}

	public void setCdt(CDT cdt) {
		this.cdt = cdt;
	}

	public ArrayList<Persona> getListPer() {
		return listPer;
	}

	public void setListPer(ArrayList<Persona> listPer) {
		this.listPer = listPer;
	}

	public ArrayList<CDT> getListCDT() {
		return listCDT;
	}

	public void setListCDT(ArrayList<CDT> listCDT) {
		this.listCDT = listCDT;
	}

	
	
	public void añadirAlista(Persona objPersona, CDT cdt) throws StreamWriteException, DatabindException, IOException {
		
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre(objPersona.getNombre());
		nuevaPersona.setApellido(objPersona.getApellido());
		nuevaPersona.setCorreo(objPersona.getCorreo());
		nuevaPersona.setTelefono(objPersona.getTelefono());
		listPer.add(nuevaPersona);
		
		CDT auxCDT = new CDT();
		auxCDT.setNumeroDias(cdt.getNumeroDias());
		auxCDT.setValorAinvertir(cdt.getValorAinvertir());
		auxCDT.setTasaInteresAnual(cdt.getTasaInteresAnual());
		auxCDT.setTasaEfectivaAnual(cdt.getTasaEfectivaAnual());
		auxCDT.setRentabilidadPorPeriodo(cdt.getRentabilidadPorPeriodo());
		auxCDT.setRentabilidadNeta(cdt.getRentabilidadNeta());
		auxCDT.setGananciaBruta(cdt.getGananciaBruta());
		auxCDT.setReteFuente(cdt.getReteFuente());
		auxCDT.setMontoFinal(cdt.getMontoFinal());
		calculaCDT(auxCDT);
		
	}

	public void calculaCDT(CDT auxCdt) throws StreamWriteException, DatabindException, IOException {
		CDT calculoCDT = new CDT();

		Double tasaDecimal = (auxCdt.getTasaInteresAnual() / 100);
		Double UVT = 49799.0; // Valor UVT vigente en Colombia (ajustar si es necesario)
		Double TASA_RETEFUENTE = 0.04; // 4% de retención en la fuente sobre rendimientos

		calculoCDT.setNumeroDias(auxCdt.getNumeroDias());
		calculoCDT.setValorAinvertir(auxCdt.getValorAinvertir());
		calculoCDT.setTasaInteresAnual(tasaDecimal);
		calculoCDT.setTasaEfectivaAnual(UVT * tasaDecimal);
		calculoCDT.setRentabilidadPorPeriodo(Math.pow(1.0 + tasaDecimal, (double) auxCdt.getNumeroDias() / 360) - 1.0);
		calculoCDT.setGananciaBruta(auxCdt.getValorAinvertir() * calculoCDT.getRentabilidadPorPeriodo());
		calculoCDT.setReteFuente(calculoCDT.getGananciaBruta() * TASA_RETEFUENTE);
		calculoCDT.setRentabilidadNeta(calculoCDT.getGananciaBruta() - calculoCDT.getReteFuente());
		calculoCDT.setMontoFinal(auxCdt.getValorAinvertir() + calculoCDT.getRentabilidadNeta());

		listCDT.add(calculoCDT);
		this.cdt = calculoCDT;
		
		enviarDatosJson();
		
		System.out.println("----- CDT CALCULADO -----");
		System.out.println("Número de días: " + calculoCDT.getNumeroDias());
		System.out.println("Valor a invertir: " + calculoCDT.getValorAinvertir());
		System.out.println("Tasa de interés anual: " + calculoCDT.getTasaInteresAnual());
		System.out.println("Tasa efectiva anual: " + calculoCDT.getTasaEfectivaAnual());
		System.out.println("Rentabilidad por período: " + calculoCDT.getRentabilidadPorPeriodo());
		System.out.println("Ganancia bruta: " + calculoCDT.getGananciaBruta());
		System.out.println("ReteFuente: " + calculoCDT.getReteFuente());
		System.out.println("Rentabilidad neta: " + calculoCDT.getRentabilidadNeta());
		System.out.println("Monto final: " + calculoCDT.getMontoFinal());

	}

	public void enviarDatosJson() throws StreamWriteException, DatabindException, IOException {
		System.out.println("entro a enviar datos");

		List<Map<String, Object>> datos = new ArrayList<>();

		for (int i = 0; i < listPer.size(); i++) {

			Map<String, Object> objeto = new HashMap<>();

			objeto.put("Persona", listPer.get(i));
			objeto.put("CDT", listCDT.get(i));

			datos.add(objeto);
		}

		JSON.cargarDatos(datos);
	}

	public void leerDatos() throws StreamReadException, DatabindException, IOException {

		List<Map<String, Object>> registros = JSON.leerDatos();

		for (Map<String, Object> registro : registros) {

			Map<String, Object> Persona = (Map<String, Object>) registro.get("Persona");

			Map<String, Object> CDT = (Map<String, Object>) registro.get("CDT");
		}

	}
	
	

	
}
