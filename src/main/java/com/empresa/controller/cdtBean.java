package com.empresa.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.serviceCDT;
import com.empresa.util.JSON;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("cdtBean")
@SessionScoped
public class cdtBean implements Serializable{

	private serviceCDT objService = new serviceCDT();
	private static final long serialVersionUID = 5917515679950911298L;
	private List<Map<String, Object>> registros = new ArrayList<>();
	
	public serviceCDT getObjService() {
		return objService;
	}
	public void setObjService(serviceCDT objService) {
		this.objService = objService;
	}

	public String mensaje() {
		return "--- Por favor ingrese los datos ---";
	}
	public List<Map<String, Object>> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Map<String, Object>> registros) {
		this.registros = registros;
	}
	
	public void cargar() {
        try {
            registros = JSON.leerDatos();
            
            
            
            
            System.out.println("Se cargaron " + registros.size() + " registros desde el JSON");
       
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
