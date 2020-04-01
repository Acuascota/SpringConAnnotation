package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;
	
	//Constructor para la inyeccion de dependencias
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	//Campos para almacenar datos del archivo externo
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	//Accesores de los campos del archivo externo
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	

}
