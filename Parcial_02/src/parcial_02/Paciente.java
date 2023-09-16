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
    private Boolean activo;
    private String obrasocial;

    public Paciente(int id, String nombre, String apellido,int edad, int dni, String dolencia, Boolean ac) {
        super(id,nombre, apellido,edad, dni);
        this.dolencia = dolencia;
        this.activo = ac;
        this.obrasocial = "Particular";
    }
    
    public Paciente(int id, String nombre, String apellido,int edad, int dni, String dolencia, Boolean ac,String ob) {
        super(id,nombre, apellido,edad, dni);
        this.dolencia = dolencia;
        this.activo = ac;
        this.obrasocial = ob;
    }

    public String getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(String obrasocial) {
        this.obrasocial = obrasocial;
    }

    
    
    public Boolean getActivo() {
        return activo;                  
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    

    public String getDolencia() {
        return dolencia;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }
    
    
    
}
