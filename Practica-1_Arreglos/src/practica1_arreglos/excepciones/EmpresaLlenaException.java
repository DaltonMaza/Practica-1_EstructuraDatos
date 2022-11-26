/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.excepciones;

/**
 *
 * @author leomah
 */
public class EmpresaLlenaException extends Exception{

    public EmpresaLlenaException() {
        super("Empresa llena");
    }

    public EmpresaLlenaException(String string) {
        super(string);
    }
    
}
