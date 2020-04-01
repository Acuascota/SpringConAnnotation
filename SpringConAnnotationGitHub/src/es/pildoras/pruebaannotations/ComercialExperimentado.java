package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}
	
	//Constructor
		/*@Autowired
		public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
			this.nuevoInforme = nuevoInforme;
		}*/
	
	//Campo encapsulado
	@Autowired
	@Qualifier("informeFinancieroTrim4")//Bean id que deve utilizar
	private CreacionInformeFinanciero nuevoInforme;

	/*
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	//ejecucion de codigo despues de la creacion del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecuta tras creacion de Bean");
	}
	
	//ejecucion de codigo despues de apagado contenedor spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecuta antes de la destruccion");
	}
	

}
