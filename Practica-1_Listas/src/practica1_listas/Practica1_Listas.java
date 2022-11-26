/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_listas;

import controlador.listas.Exepciones.ListaVaciaException;
import controlador.listas.Exepciones.PosicionNoEncontradaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import practica1_listas.Excepciones.EmpresaVaciaException;
import practica1_listas.controlador.EmpresaController;
import practica1_listas.modelo.Empresa;
import practica1_listas.modelo.Trabajador;

/**
 *
 * @author leomah
 */
public class Practica1_Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            EmpresaController ec = new EmpresaController();
            //ec.setEmpresa(new Empresa());
            ec.guardarTrabajador(new Trabajador());
            ec.imprimir();
            System.out.println(ec.obtenerTrabajadorPos(0));
        } catch (EmpresaVaciaException ex) {
            Logger.getLogger(Practica1_Listas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaException ex) {
            Logger.getLogger(Practica1_Listas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PosicionNoEncontradaException ex) {
            Logger.getLogger(Practica1_Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
