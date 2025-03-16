/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Aerolinea extends Vuelo {
    private String tipovuelo;
    private double km;
    

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public Aerolinea(String tipovuelo, int id, String cuidadescala, int horario, double costo, int asientos, String hor) {
        super(id, cuidadescala, horario, costo, asientos,hor);
        this.tipovuelo = tipovuelo;
        this.km=km;
    }
    public Aerolinea() {
        super();
        this.tipovuelo ="";
        this.km=0;
    }
    public String getTipovuelo() {
        return tipovuelo;
    }

    public void setTipovuelo(String tipovuelo) {
        this.tipovuelo = tipovuelo;
    }
    
}
