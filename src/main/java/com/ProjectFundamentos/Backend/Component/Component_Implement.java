package com.ProjectFundamentos.Backend.Component;

import org.springframework.stereotype.Component;

/**
 * Component_Implement
 */
//Notacion para indicar que es un componente General de la aplicacion 
@Component
//Implementacion de la interface
public class Component_Implement implements Component_Dependecia {

    //Sobre escritura del metodo de la Interface
    @Override
    public void Saludar() {
        System.out.println("Hola Mundo desde El componente 1");
        
    }

    
}