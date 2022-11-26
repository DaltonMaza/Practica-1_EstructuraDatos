/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.modelo;

/**
 *
 * @author leomah
 */
public class Empresa {
    private Integer id;
    private String nombre;
    private Trabajador trabajadorArray[];

    public Empresa() {
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador[] getTrabajadorArray() {
        return trabajadorArray;
    }

    public void setTrabajadorArray(Trabajador[] trabajadorArray) {
        this.trabajadorArray = trabajadorArray;
    }
    
    
    
}
