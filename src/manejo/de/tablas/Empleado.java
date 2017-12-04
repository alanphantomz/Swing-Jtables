/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.tablas;

/**
 *
 * @author alan
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String turno;
    private double sueldo;
            
    public Empleado(){
        nombre = "Nulo";
        apellido = "Nulo";
        turno = "Nulo";
        sueldo = 0.0;
    }
    
    public Empleado(String nom, String ap, String turno, double sueldo){
        this.nombre = nom;
        this.apellido = ap;
        this.turno = turno;
        this.sueldo = sueldo;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }       
}
