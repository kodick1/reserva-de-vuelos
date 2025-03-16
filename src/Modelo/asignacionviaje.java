/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.InOut;
import java.util.ArrayList;

public class asignacionviaje {
    
    InOut ob = new InOut();
    
    ArrayList<Viajero> lista1 = new ArrayList<Viajero>();
     ArrayList<Viajero> lista2 = new ArrayList<Viajero>();
      ArrayList<Viajero> lista3 = new ArrayList<Viajero>();
      ArrayList<Viajero> lista4 = new ArrayList<Viajero>();
    public void llenar() {
        String nom = ""; String apell = ""; int cc = 0; int tel = 0; String correo = "";
        int edad = 0; int id = 0; String vuelo = ""; String ciudades = ""; int hora = 0; 
        int min = 0; int asientos = 0; double costo = 0;
        int res = 0; int conf=0; String acom=""; double km=0; String hor=""; String estado="";
        String modovuelo=""; String escala="escala"; String directo="directo"; 
        String comercial="comercial"; String oficial="oficial"; String trabajo="trabajo";
        double costo1=0;
        do {

            Viajero viaje = new Viajero();
            nom = ob.Pedirstring("Digite el nombre del pasajero: ");
            viaje.setNombre(nom);
            apell = ob.Pedirstring("Digite el apellido del pasajero:");
            viaje.setApellido(apell);
            cc = ob.pedirentero("Digite el numero de identificacion del pasajero");
            viaje.setCc(cc);
            while(cc<0){
            ob.mostrar("Error");
            cc = ob.pedirentero("Digite el numero de identificacion del pasajero");
            viaje.setCc(cc);
            }
            tel = ob.pedirentero("Digite el numero de telefono del pasajero");
            viaje.setTel(tel);
            while(tel<0){
                ob.mostrar("Error");
                tel = ob.pedirentero("Digite el numero de telefono del pasajero");
            viaje.setTel(tel);
            }
            correo = ob.Pedirstring("Digite el correo del pasajero");
            viaje.setCorreo(correo);

            id = ob.pedirentero("Digite id del vuelo");
            viaje.getOb1().setId(id);
            while(validarid(id)||id<0){
                 ob.mostrar("Error");
                  id = ob.pedirentero("Digite id del vuelo");
            viaje.getOb1().setId(id);
            }

            do {
                hora = ob.pedirentero("Digite la hora del vuelo");
                viaje.getOb1().setHorario(hora);
                while (hora < 0 || hora > 24) {

                    ob.mostrar("Error");
                    hora = ob.pedirentero("Digite la hora del vuelo");
                    viaje.getOb1().setHorario(hora);

                }
                switch (hora) {

                    case 6:
                        ob.mostrar("Vuelos disponibles que salen a las 06 horas:");
                        ob.mostrar("Bogota-La paz");
                        ciudades = "Brasilia";
                        ob.mostrar("Ciudad en escala: " + ciudades);
                        viaje.getOb1().setCuidadescala(ciudades);
                        hor = "06:00-12:00 h";
                        viaje.getOb1().setHor(hor);
                        break;
                    case 12:
                        ob.mostrar("Vuelos disponibles que salen a las 12 horas:");
                        ob.mostrar("Bogota-Lima");
                        ciudades = "Quito";
                        ob.mostrar("Ciudad en escala: " + ciudades);
                        viaje.getOb1().setCuidadescala(ciudades);
                        hor = "12:00-18:00 h";
                        viaje.getOb1().setHor(hor);

                        break;
                    case 18:
                        ob.mostrar("Vuelos disponibles que salen a las 18 horas:");
                        ob.mostrar("Bogota-Santiago de chile");
                        ciudades = "Lima";
                        ob.mostrar("Ciudad en escala: " + ciudades);
                        viaje.getOb1().setCuidadescala(ciudades);
                        hor = "18:00-00:00 h";
                        viaje.getOb1().setHor(hor);
                        break;
                    case 24:
                        ob.mostrar("Vuelos disponibles que salen a las 24 horas");
                        ob.mostrar("Bogota-Montevideo");
                        ciudades = "La paz";
                        ob.mostrar("Cuidad en escala: " + ciudades);
                        viaje.getOb1().setCuidadescala(ciudades);
                        hor = "00:00-06:00 h";
                        viaje.getOb1().setHor(hor);
                        break;

                    default:
                        ob.mostrar("No hay vuelos en la hora ingresada");

                }

            } while (hora != 6 && hora != 12 && hora != 18 && hora != 24);

            km = ob.pedirentero("Digite los kilometros del viaje");
            while (km < 0 || km < 3000) {
                ob.mostrar("Error, la distancia del ciaje mas corto es de 3000 km");
                km = ob.pedirentero("Digite los kilometros del viaje");
            }
            km = multiplicar(km, 1000);
            viaje.getOb1().setKm(km);
            costo = multiplicar(km, 0.2);
            asientos = ob.pedirentero("Digite el numero de asientos");
            viaje.getOb1().setAsientos(asientos);

            while (asientos < 0 || asientos > 5) {
                ob.mostrar("Error");
                asientos = ob.pedirentero("Digite el numero de asientos");
                viaje.getOb1().setAsientos(asientos);
            }
            conf = ob.pedirentero("Digite 1 para escoger los puestos, otro numero para que la aerolinea se los asigne");
            if (conf == 1) {
                costo = acumular(costo, 50000);
            } else {
                costo = costo;
            }

            modovuelo = ob.Pedirstring("Digite el modo de vuelo, ya sea escala o directo");
            while ((modovuelo.equalsIgnoreCase(escala) || modovuelo.equalsIgnoreCase(directo)) == false) {
                ob.mostrar("Error,digite el modo de vuelo, ya sea escala o directo ");
                modovuelo = ob.Pedirstring("Digite el modo de vuelo, ya sea escala o directo");
            }
            viaje.setModovuelo(modovuelo);
            if (modovuelo.equalsIgnoreCase(escala)) {
                edad = ob.pedirentero("A continuacion digite la edad del pasajero:");
                viaje.setEdad(edad);
                if (edad > 18) {
                    conf = ob.pedirentero("Digite 1 si es discapacitado, otro numero para continuar");
                    if (conf == 1) {
                        acom = ob.Pedirstring("Digite el nombre del acompañante");
                        viaje.setAcompañante(acom);
                        estado = "Discapacitado";
                        viaje.setEstado(estado);

                        costo1 = costo / 2;
                        ob.mostrar("El costo del acompañante es" + costo1);

                    } else {
                        estado = "-----------";
                        viaje.setEstado(estado);
                        acom = "Sin acompañante";
                        viaje.setAcompañante(acom);

                    }

                } else {
                    acom = ob.Pedirstring("Digite el nombre del representante legal");
                    viaje.setAcompañante(acom);
                    estado = "Menor de edad";
                    viaje.setEstado(estado);
                }
                viaje.getOb1().setCosto(costo);

            }
            if (modovuelo.equalsIgnoreCase(directo)) {
                costo = multiplicar(costo, 1.5);
                edad = ob.pedirentero("A continuacion digite la edad del pasajero:");
                viaje.setEdad(edad);
                if (edad > 18) {
                    conf = ob.pedirentero("Digite 1 si es discapacitado, otro numero para continuar");
                    if (conf == 1) {
                        acom = ob.Pedirstring("Digite el nombre del acompañante");
                        viaje.setAcompañante(acom);
                        estado = "Discapacitado";
                        viaje.setEstado(estado);
                        costo1 = costo / 2;
                        ob.mostrar("El costo por acompañante es" + costo1);

                    } else {
                        estado = "-----------";
                        viaje.setEstado(estado);
                        acom = "Sin acompañante";
                        viaje.setAcompañante(acom);

                    }

                } else {
                    acom = ob.Pedirstring("Digite el nombre del representante legal");
                    viaje.setAcompañante(acom);
                    estado = "Menor de edad";
                    viaje.setEstado(estado);
                }

                viaje.getOb1().setCosto(costo);
            }
            vuelo = ob.Pedirstring("Digite el tipo de vuelo, ya sea comercial, oficial o de trabajo");
            viaje.getOb1().setTipovuelo(vuelo);
            while ((vuelo.equalsIgnoreCase(comercial) || vuelo.equalsIgnoreCase(oficial) || vuelo.equalsIgnoreCase(trabajo)) == false) {
                ob.mostrar("Error, Digite el tipo de vuelo, ya sea comercial, oficial o de trabajo");
                vuelo = ob.Pedirstring("Digite el tipo de vuelo, ya sea comercial, oficial o de trabajo");
            }
            viaje.getOb1().setTipovuelo(vuelo);

            if (vuelo.equalsIgnoreCase(comercial)) {
                lista1.add(viaje);

            }
            if (vuelo.equalsIgnoreCase(oficial)) {
                lista2.add(viaje);
            }
            if (vuelo.equalsIgnoreCase(trabajo)) {
                lista3.add(viaje);
            }
            lista4.add(viaje);
            res = ob.pedirentero("Digite 1 para agregar, otro numero para finalizar.");
        } while (res == 1);

    }

    public void mostrar() {
        for (int i = 0; i < lista1.size(); i++) {
            
            ob.mostrar("\nDatos del viajero: " + "\nNombre: "+lista1.get(i).getNombre()+"\nApellido: "+lista1.get(i).getApellido()+"\nC.C: "+lista1.get(i).getCc()+"\nCorreo: "+lista1.get(i).getCorreo()+"\nTelefono: "+lista1.get(i).getTel()+"\nEdad del pasajero: "+lista1.get(i).getEdad()+"\nEstado del pasajero: "+lista1.get(i).getEstado()+"\nAcompañante :"+lista1.get(i).getAcompañante());
            ob.mostrar("\nDatos del vuelo: "+"\nId del vuelo: "+lista1.get(i).getOb1().getId()+"\nCuidad de escala: "+lista1.get(i).getOb1().getCuidadescala()+"\nHora de vuelo: "+lista1.get(i).getOb1().getHor()+"\nNo. de asientos reservados: "+lista1.get(i).getOb1().getAsientos()+"\nModalidad de vuelo :"+lista1.get(i).getModovuelo()+"\nDistancia del viaje :"+lista1.get(i).getOb1().getKm()+" Metros "+"\nTipo de vuelo: "+lista1.get(i).getOb1().getTipovuelo()+"\nCosto del viaje: "+lista1.get(i).getOb1().getCosto());
        }
    }
    
    public void mostrar2() {
        for (int i = 0; i < lista2.size(); i++) {
            
            ob.mostrar("\nDatos del viajero: " + "\nNombre: "+lista2.get(i).getNombre()+"\nApellido: "+lista2.get(i).getApellido()+"\nC.C: "+lista2.get(i).getCc()+"\nCorreo: "+lista2.get(i).getCorreo()+"\nTelefono: "+lista2.get(i).getTel()+"\nEdad del pasajero: "+lista2.get(i).getEdad()+"\nEstado del pasajero: "+lista2.get(i).getEstado()+"\nAcompañante :"+lista2.get(i).getAcompañante());
            ob.mostrar("\nDatos del vuelo: "+"\nId del vuelo: "+lista2.get(i).getOb1().getId()+"\nCuidad de escala: "+lista2.get(i).getOb1().getCuidadescala()+"\nHora de vuelo: "+lista2.get(i).getOb1().getHor()+"\nNo. de asientos reservados: "+lista2.get(i).getOb1().getAsientos()+"\nModalidad de vuelo :"+lista2.get(i).getModovuelo()+"\nDistancia del viaje :"+lista2.get(i).getOb1().getKm()+" Metros "+"\nTipo de vuelo: "+lista2.get(i).getOb1().getTipovuelo()+"\nCosto del viaje: "+lista2.get(i).getOb1().getCosto());
        }
    }
    
    
    public void mostrar3() {
        for (int i = 0; i < lista3.size(); i++) {
            
            ob.mostrar("\nDatos del viajero: " + "\nNombre: "+lista3.get(i).getNombre()+"\nApellido: "+lista3.get(i).getApellido()+"\nC.C: "+lista3.get(i).getCc()+"\nCorreo: "+lista3.get(i).getCorreo()+"\nTelefono: "+lista3.get(i).getTel()+"\nEdad del pasajero: "+lista3.get(i).getEdad()+"\nEstado del pasajero: "+lista3.get(i).getEstado()+"\nAcompañante :"+lista3.get(i).getAcompañante());
            ob.mostrar("\nDatos del vuelo: "+"\nId del vuelo: "+lista3.get(i).getOb1().getId()+"\nCuidad de escala: "+lista3.get(i).getOb1().getCuidadescala()+"\nHora de vuelo: "+lista3.get(i).getOb1().getHor()+"\nNo. de asientos reservados: "+lista3.get(i).getOb1().getAsientos()+"\nModalidad de vuelo :"+lista3.get(i).getModovuelo()+"\nDistancia del viaje :"+lista3.get(i).getOb1().getKm()+" Metros "+"\nTipo de vuelo: "+lista3.get(i).getOb1().getTipovuelo()+"\nCosto del viaje: "+lista3.get(i).getOb1().getCosto());
        }
    }
    
    
    public double acumular(double d1, double d2){
        return d1+d2;
    }
    
    public double multiplicar(double d1, double d2){
        return d1*d2;
    }
    
    public boolean validarid(int id) {
        int a = 0;
        for (int i = 0; i < lista4.size(); i++) {
            if (lista4.get(i).getOb1().getId() == id) {
                ob.mostrar(id + "==" +lista4.get(i).getOb1().getId());
                a = 1;
            }
        }
        if (a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
