package com.empresa.controller;

import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("pru")
@SessionScoped
public class BeanPrueba implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7704795523440040251L;

	public String mensaje() {
		return "---Calculo de CDT--- BANCO DIBIDIBI S.A ---";
	}
}
