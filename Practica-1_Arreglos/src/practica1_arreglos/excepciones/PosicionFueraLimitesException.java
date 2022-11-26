/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.excepciones;

/**
 *
 * @author leomah
 */
public class PosicionFueraLimitesException extends Exception{

    public PosicionFueraLimitesException() {
        System.out.println("Posicion fuera de limites");
    }

    public PosicionFueraLimitesException(String string) {
        super(string);
    }
    
}
