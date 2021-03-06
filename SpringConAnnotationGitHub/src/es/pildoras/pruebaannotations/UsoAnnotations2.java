package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de xml de configuracion
		//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer la clase de configuracion
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class  );
		
		/*//pedir el bean al contenedor
		Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);
		
		//Apuntan al mismo objeto en memoria
		if(Antonio==Lucia){
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio+"\n"+Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio+"\n"+Lucia);
		}*/
		
		/*//pedimos el bean al contenedor
		Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());*/
		
		//
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		System.out.println("Email del Directir= "+empleado.getEmail());
		System.out.println("Email del Directir= "+empleado.getNombreEmpresa());
		//Cerrar el contexto
		contexto.close();

	}

}
