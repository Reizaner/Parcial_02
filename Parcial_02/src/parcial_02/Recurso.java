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
public class Recurso {
    
    private int cantidad;
    private String recurso;

    public Recurso(int cantidad, String recurso) {
        this.cantidad = cantidad;
        this.recurso = recurso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
    
    
}
