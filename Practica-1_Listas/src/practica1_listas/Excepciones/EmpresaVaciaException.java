/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_listas.Excepciones;

/**
 *
 * @author leomah
 */
public class EmpresaVaciaException extends Exception{
    public EmpresaVaciaException() {
        super("Empresa vacia");
    }

    public EmpresaVaciaException(String string) {
        super(string);
    }
}
