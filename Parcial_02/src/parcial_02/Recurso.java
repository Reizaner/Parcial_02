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
public class Recurso {
    
    private String clasificacion;
    private String subclasificacion;
    private ArrayList<String> recurso;

    public Recurso(String clasificacion,String subclaficacion, ArrayList<String> recurso) {
        this.subclasificacion = subclaficacion;
        this.clasificacion = clasificacion;
        this.recurso = recurso;
    }

    public String getSubclasificacion() {
        return subclasificacion;
    }

    public void setSubclasificacion(String subclasificacion) {
        this.subclasificacion = subclasificacion;
    }

    
    
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public ArrayList<String> getRecurso() {
        return recurso;
    }

    public void setRecurso(ArrayList<String> recurso) {
        this.recurso = recurso;
    }
    
    
    

    
    
    
}
