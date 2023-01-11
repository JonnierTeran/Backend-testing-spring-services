package com.ProjectFundamentos.Backend.Component;

import org.springframework.stereotype.Component;

/**
 * Component_Implement02
 */
@Component 
public class Component_Implement02 implements Component_Dependecia{

    @Override
    public void Saludar() {
        System.out.println(" Hola Mundo desde mi componente 2 ");
        
    }

    
}