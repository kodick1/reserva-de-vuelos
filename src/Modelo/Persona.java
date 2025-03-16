/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pc Smart
 */
public class Persona {
   private String nombre;
   private String apellido;
    private int cc;
    private int tel;
    private String correo;

    public Persona(String nombre, String apellido, int cc, int tel, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.tel = tel;
        this.correo = correo;
    }
public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.cc = 0;
        this.tel = 0;
        this.correo = "";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

        
        
    
    
}
