/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_listas.controlador;

import controlador.listas.Exepciones.ListaVaciaException;
import controlador.listas.Exepciones.PosicionNoEncontradaException;
import controlador.listas.ListaEnlazada;
import practica1_listas.Excepciones.EmpresaVaciaException;
import practica1_listas.modelo.Empresa;
import practica1_listas.modelo.Trabajador;

/**
 *
 * @author leomah
 */
public class EmpresaController {
    private Empresa empresa;

    public EmpresaController() {
        getEmpresa().setTrabajadorList(new ListaEnlazada());
    }

    public EmpresaController(String nombre) {
        getEmpresa().setNombre(nombre);
        getEmpresa().setTrabajadorList(new ListaEnlazada());
    }
        
    public int obtenerTamanio(){
        return getEmpresa().getTrabajadorList().getTamanio();
    }
    
    public boolean estaVacia(){        
        return getEmpresa().getTrabajadorList().estaVacia();
    }
    
    public void guardarTrabajador(Trabajador trabajador){
        getEmpresa().getTrabajadorList().insertar(trabajador);
    }
    
    public Trabajador obtenerTrabajadorPos(Integer pos) throws EmpresaVaciaException, ListaVaciaException, PosicionNoEncontradaException{
        if (!estaVacia()) {
            return (Trabajador)getEmpresa().getTrabajadorList().obtener(pos);
        }else{
            throw new EmpresaVaciaException();
        }
    }
//    
//    public Trabajador obtenerTrabajadorPos(Integer pos) throws EmpresaVaciaException, PosicionFueraLimitesException{
//        if (!estaVacia()) {
//            if (pos > getEmpresa().getTrabajadorArray().length) {
//                throw new PosicionFueraLimitesException();
//            }else{
//                if (getEmpresa().getTrabajadorArray()[pos] == null) {
//                    return null;
//                } else {
//                    return getEmpresa().getTrabajadorArray()[pos];
//                }
//            }
//            
//        }else{
//            throw new EmpresaVaciaException();
//        }
//    }
//    
//    public boolean cabezaVacia(){
//        boolean vacia = true;
//        if (!estaVacia()) {
//            if (getEmpresa().getTrabajadorArray()[0] != null) {
//                vacia = false;
//            }
//        }
//        return vacia;
//    }
//    
//    
//    public int obtenerUltimaPosicion(){
//        int ultimaPos = 0;
//        for (int i = 0; i < getEmpresa().getTrabajadorArray().length; i++) {
//            if (getEmpresa().getTrabajadorArray()[i] == null) {
//                break;
//            }else{
//                ultimaPos = i;
//            }
//        }
//        getEmpresa().getTrabajadorList().
//        return ultimaPos;
//    }
    
    public void imprimir(){
        System.out.println(getEmpresa().getNombre());
        getEmpresa().getTrabajadorList().imprimir();
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
