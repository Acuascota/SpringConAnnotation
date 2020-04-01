package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//Contenedor de Spring
@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe de cierre de Año";
	}

}
