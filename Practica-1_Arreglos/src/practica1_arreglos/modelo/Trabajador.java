/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author leomah
 */
public class Trabajador {
    private Integer id;
    private String nombres;
    private String apellidos;
    private Float sueldo;
    private Integer aniosEmpleo;
    private Calendar fechaIngreso;
    private Rango rango;
    private Float bono;
    private Float sueldoFinal;
    private Boolean pagado;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, Float sueldo, Calendar fechaIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
    
    

    public Float getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(Float sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getAniosEmpleo() {
        return aniosEmpleo;
    }

    public void setAniosEmpleo(Integer aniosEmpleo) {
        this.aniosEmpleo = aniosEmpleo;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }
    
    

    public String imprimirFechaIngreso() {
        String cadena;
        cadena = "" + fechaIngreso.get(Calendar.YEAR) + "/" + fechaIngreso.get(Calendar.MONTH) + "/" + fechaIngreso.get(Calendar.DATE);
        return cadena;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public Float getBono() {
        return bono;
    }

    public void setBono(Float bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", aniosEmpleo=" + aniosEmpleo + ", fechaIngreso=" + imprimirFechaIngreso() + ", rango=" + rango + ", bono=" + bono + '}';
    }
    
    
    
}
