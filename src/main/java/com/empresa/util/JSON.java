package com.empresa.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
	public static ObjectMapper mapeador = new ObjectMapper();

	static String ruta = System.getProperty("user.home") + "\\Downloads\\datos.json";

	static File archivo = new File(ruta);
	
	
	

	public static <T> void cargarDatos(List<T> obje) throws IOException {
		String json = mapeador.writerWithDefaultPrettyPrinter().writeValueAsString(obje);
	
		System.out.println(json);
		

		mapeador.writeValue(archivo, obje);
	}

	
	public static List<Map<String, Object>> leerDatos() throws StreamReadException, DatabindException, IOException {

	    if (!archivo.exists()) {
	        System.out.println("El archivo no existe: " + archivo.getAbsolutePath());
	        return new ArrayList<>();
	    }

	    return mapeador.readValue(
	        archivo,
	        mapeador.getTypeFactory().constructCollectionType(List.class, Map.class)
	    );
		
	}
}
