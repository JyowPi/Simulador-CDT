package com.empresa.service;

import java.util.ArrayList;

import com.empresa.model.CDT;
import com.empresa.model.Persona;

public class serviceCDT {
	
	public Persona objPersona = new Persona();
	public CDT cdt =new CDT();
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
	
	
	
	
}
