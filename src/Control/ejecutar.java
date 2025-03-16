/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.asignacionviaje;
import Vista.InOut;

/**
 *
 * @author Pc Smart
 */
public class ejecutar {
    public static void main(String[] args) {
        asignacionviaje ob1= new asignacionviaje();
        InOut ob=new InOut();
        int op=0;
        do{ 
        op = ob.pedirentero("\nIngrese opcion:\n1.Ingresar datos del vuelo. \n2.Mostrar registro vuelos comerciales. \n3.Mostrar registros vuelos oficiales. \n4.Mostrar registros vuelos de trabajo. \n5.salir.");
        switch (op){
            case 1:
                ob1.llenar();
                break;
            case 2:
                ob1.mostrar();
                break;
            case 3:
                ob1.mostrar2();
                break;
            case 4:
                ob1.mostrar3();
                break;
                
        }
        
        
        }while(op!=5);
        
                ob.mostrar("Gracias por usar este programa, que tenga buen dia.");

    }
    
}
