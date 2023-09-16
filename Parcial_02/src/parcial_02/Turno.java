/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_02;

import java.sql.Date;

/**
 *
 * @author Alumno
 */
public class Turno {
    
    private int id;
    private Date fecha;
    private Paciente p;
    private Secretario s;

    public Turno(int id, Date fecha, Paciente p, Secretario s) {
        this.id = id;
        this.fecha = fecha;
        this.p = p;
        this.s = s;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public Secretario getS() {
        return s;
    }

    public void setS(Secretario s) {
        this.s = s;
    }

    
    
}
