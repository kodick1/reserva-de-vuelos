/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Pc Smart
 */
public class Viajero extends Persona {

    private int edad;
    private String acompañante;
    private String modovuelo;
    private String estado;

    public String getModovuelo() {
        return modovuelo;
    }

    public void setModovuelo(String modovuelo) {
        this.modovuelo = modovuelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }
    private ArrayList<Aerolinea> listaA;
    private Aerolinea ob1;

    public Viajero(int edad, ArrayList<Aerolinea> listaA, Aerolinea ob1, String nombre, String apellido, int cc, int tel, String correo, String acompañante,String modovuelo,String estado) {
        super(nombre, apellido, cc, tel, correo);
        this.edad = edad;
        this.listaA = listaA;
        this.ob1 = ob1;
        this.acompañante=acompañante;
        this.modovuelo=modovuelo;
        this.estado=estado;
    }

    
    
     public Viajero() {
        super();
        this.edad = 0;
        this.acompañante="";
        this.listaA = new ArrayList<Aerolinea>();
        this.ob1 = new Aerolinea();
        this.estado="";
        this.modovuelo="";
        
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Aerolinea> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Aerolinea> listaA) {
        this.listaA = listaA;
    }

    public Aerolinea getOb1() {
        return ob1;
    }

    public void setOb1(Aerolinea ob1) {
        this.ob1 = ob1;
    }

}
