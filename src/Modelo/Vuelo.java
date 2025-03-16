/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



public class Vuelo {
   
    private int id;
    private String cuidadescala;
    private int horario;
    private double costo;
    private int asientos;
    private String hor;

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }
    
    public Vuelo(int id, String cuidadescala, int horario, double costo, int asientos, String hor) {
        this.id = id;
        this.cuidadescala = cuidadescala;
        this.horario = horario;
        this.costo = costo;
        this.asientos = asientos;
        this.hor=hor;
    }

    public Vuelo() {
        this.id = 0;
        this.cuidadescala ="";
        this.horario = 0;
        this.costo = 0;
        this.asientos = 0;
        this.hor="";
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuidadescala() {
        return cuidadescala;
    }

    public void setCuidadescala(String cuidadescala) {
        this.cuidadescala = cuidadescala;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    
    
    
    
}
