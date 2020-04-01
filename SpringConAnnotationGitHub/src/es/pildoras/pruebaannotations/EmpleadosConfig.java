package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Con esto le decimos a spring que esta clase es nuestro archivo de configuracion
@Configuration
//Aqui le decimos donde deve ir a escanear el archivo de configuracion
@ComponentScan("es.pildoras.pruebaannotations")

@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//Definir el bean para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el bena para el DIrectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
