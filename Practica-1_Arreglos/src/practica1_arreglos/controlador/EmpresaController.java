/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.controlador;

import practica1_arreglos.excepciones.EmpresaLlenaException;
import practica1_arreglos.excepciones.EmpresaVaciaException;
import practica1_arreglos.excepciones.PosicionFueraLimitesException;
import practica1_arreglos.modelo.Empresa;
import practica1_arreglos.modelo.Trabajador;

/**
 *
 * @author leomah
 */
public class EmpresaController {
    private Empresa empresa;

    public EmpresaController() {
    }

    public EmpresaController(String nombre, Integer tamanio) {
        getEmpresa().setNombre(nombre);
        getEmpresa().setTrabajadorArray(new Trabajador[tamanio]);
    }
    
    public void modificarTamanio(Integer tamanio){
        if (estaVacia()) {
            getEmpresa().setTrabajadorArray(new Trabajador[tamanio]);
        }else{
            Trabajador aux [] = new Trabajador[getEmpresa().getTrabajadorArray().length];
            for (int i = 0; i < getEmpresa().getTrabajadorArray().length; i++) {
                aux[i] = getEmpresa().getTrabajadorArray()[i];
            }
            getEmpresa().setTrabajadorArray(new Trabajador[tamanio]);
            for (int i = 0; i < aux.length; i++) {
                getEmpresa().getTrabajadorArray()[i] = aux[i];
            }
        }
        
    }
    
    public int obtenerTamanio(){
        return getEmpresa().getTrabajadorArray().length;
    }
    
    public boolean estaVacia(){
        boolean vacia = true;
        for (int i = 0; i < empresa.getTrabajadorArray().length; i++) {
            if (getEmpresa().getTrabajadorArray()[i] != null) {
                vacia = false;
                break;
            }
        }
        return vacia;
    }
    
    public boolean guardarTrabajador(Trabajador trabajador) throws EmpresaLlenaException{
        if(!estaLlena()){
            if(cabezaVacia()){
                getEmpresa().getTrabajadorArray()[0] = trabajador;
            }else{
                getEmpresa().getTrabajadorArray()[obtenerUltimaPosicion() + 1] = trabajador;
            }
            return true;
        }else{
            throw new EmpresaLlenaException();
        }
    }
    
    public Trabajador obtenerTrabajadorPos(Integer pos) throws EmpresaVaciaException, PosicionFueraLimitesException{
        if (!estaVacia()) {
            if (pos > getEmpresa().getTrabajadorArray().length) {
                throw new PosicionFueraLimitesException();
            }else{
                if (getEmpresa().getTrabajadorArray()[pos] == null) {
                    return null;
                } else {
                    return getEmpresa().getTrabajadorArray()[pos];
                }
            }
            
        }else{
            throw new EmpresaVaciaException();
        }
    }
    
    public boolean cabezaVacia(){
        boolean vacia = true;
        if (!estaVacia()) {
            if (getEmpresa().getTrabajadorArray()[0] != null) {
                vacia = false;
            }
        }
        return vacia;
    }
    
    public boolean estaLlena(){
        return getEmpresa().getTrabajadorArray().length <= obtenerUltimaPosicion() + 1;
    }
    
    public int obtenerUltimaPosicion(){
        int ultimaPos = 0;
        for (int i = 0; i < getEmpresa().getTrabajadorArray().length; i++) {
            if (getEmpresa().getTrabajadorArray()[i] == null) {
                break;
            }else{
                ultimaPos = i;
            }
        }
        return ultimaPos;
    }
    
    public void imprimir(){
        System.out.println(getEmpresa().getNombre());
        for (int i = 0; i < getEmpresa().getTrabajadorArray().length; i++) {
            System.out.println(getEmpresa().getTrabajadorArray()[i]);
        }
    }

    public Empresa getEmpresa() {
        if(empresa == null){
            empresa = new Empresa();
        }
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}
