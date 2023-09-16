/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_02;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Especialidad {
    
    private int id;
    private String esp;
    private ArrayList<Turno> t;

    public Especialidad() {
        this.id = 0;
        this.esp = null;
    }

    
    public Especialidad(int id, String esp) {
        this.id = id;
        this.esp = esp;
    }

    public ArrayList<Turno> getT() {
        return t;
    }

    public void setT(ArrayList<Turno> t) {
        this.t = t;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }
    
    
    
}
