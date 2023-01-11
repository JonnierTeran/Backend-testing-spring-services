package com.ProjectFundamentos.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ProjectFundamentos.Backend.Component.Component_Dependecia;



//Decorador de Spring aplicatios
@SpringBootApplication
//Clase principal e implementacion de la interface CommandLineRunner
public class BackendApplication implements CommandLineRunner{
	
	//Declaramos los atributos del tipo de nuestras dependencias
	private Component_Dependecia componenteDependecia;
	private Component_Dependecia componenteDependecia2;
	

	//Inyectamos la dependencia creada en nuestro proyecto por medio del constructor y con 	
	//@Qualifier("componentTwoImplement") indicamos cual implementacion de la dependecia queremos usar
	@Autowired
	public BackendApplication(	@Qualifier("component_Implement02") Component_Dependecia component_Dependecia,
	@Qualifier("component_Implement") Component_Dependecia component_Dependecia2){
		//Inicializamos las dependencias
		this.componenteDependecia = component_Dependecia;
		this.componenteDependecia2 = component_Dependecia2;
		

	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	//Metodo sobre escrito de la implementacion de la interface
	//Basicamente sirve para ejecutar lo que necesitemos
	@Override
	public void run(String... args) {
		//Ejecutamos el metodo de la dependencia y su implementacion
		this.componenteDependecia2.Saludar();
		this.componenteDependecia.Saludar();
		
		
		
	}

}
