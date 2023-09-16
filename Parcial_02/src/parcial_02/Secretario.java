/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_02;

/**
 *
 * @author Alumno
 */
public class Secretario extends Persona {
    
    private String rango;

    public Secretario(int id, String nombre, String apellido, int dni, String rango) {
        super(id, nombre, apellido, dni);
        this.rango = rango;

    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

 
    
}
