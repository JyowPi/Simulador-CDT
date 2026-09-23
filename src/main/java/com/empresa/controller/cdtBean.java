package com.empresa.controller;

import java.io.Serializable;

import com.empresa.service.serviceCDT;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("cdtBean")
@SessionScoped
public class cdtBean implements Serializable{

	private serviceCDT objService = new serviceCDT();
	private static final long serialVersionUID = 5917515679950911298L;
	
	public serviceCDT getObjService() {
		return objService;
	}
	public void setObjService(serviceCDT objService) {
		this.objService = objService;
	}

	
	
}
