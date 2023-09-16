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
public class Paciente extends Persona {
    
    private String dolencia;

    public Paciente(int id, String nombre, String apellido, int dni, String dolencia) {
        super(id,nombre, apellido, dni);
        this.dolencia = dolencia;
    }

    

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }
    
    
    
}
