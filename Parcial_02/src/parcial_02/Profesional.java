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
public class Profesional extends Persona {
    
    private String matricula;
    private ArrayList<Especialidad> esp;

    public Profesional(int id,String nombre, String apellido,int edad, int dni,String matricula, ArrayList esp) {
        super( id, nombre, apellido,edad, dni);
        this.matricula = matricula;
        this.esp = esp;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Especialidad> getEsp() {
        return esp;
    }

    public void setEsp(ArrayList<Especialidad> esp) {
        this.esp = esp;
    }

    
    
    

    

    
    
    
}
