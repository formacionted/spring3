package com.telefonica.jee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telefonica.jee.beans.Employee;

/**
 * Aplicacion con ejemplos de como hacer configuracion basada en anotaciones
 * Se comprueba que pasa cuando hay dos implementaciones de un mismo interfaz,
 * utilizamos la anotacion @Qualifier para indicar la implementacion que queremos
 * 
 * Con @Autowired podemos inyectar todas aquellas clases que tengan una de las siguientes anotaciones:
 * 
 * @Controller
 * @Service 
 * @Repository
 * @Component --> Generica, nos vale para todos los beans en general
 *
 *bucar ejemplo con listasss
 * @author alan.sastre
 */
@SpringBootApplication
public class Spring3Application implements CommandLineRunner {

	@Autowired
	public Employee employee;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employee.setName("Hello World!");
		employee.showDetails();
		
		int[] numeros = {1, 2, 3, 4};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
