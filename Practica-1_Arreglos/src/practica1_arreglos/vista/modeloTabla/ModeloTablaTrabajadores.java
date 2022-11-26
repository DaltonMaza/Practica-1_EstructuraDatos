/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.vista.modeloTabla;

import javax.swing.table.AbstractTableModel;
import practica1_arreglos.modelo.Trabajador;

/**
 *
 * @author leomah
 */
public class ModeloTablaTrabajadores extends AbstractTableModel{
    private Trabajador trabajadores[];
    
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return trabajadores.length;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "nro";
            case 1: return "Nombres";
            case 2: return "Rango";
            case 3: return "Sueldo";
            case 4: return "Bono";
            case 5: return "Saldo Final";
            case 6: return "Pagado";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trabajador t = trabajadores[rowIndex];
        switch(columnIndex){
            case 0: return (rowIndex + 1);
            case 1: return (t != null) ? t.getNombres() + " " + t.getApellidos() : "No definido";
            case 2: return (t != null) ? t.getRango() : "No definido";
            case 3: return (t != null) ? t.getSueldo() : "No definido";
            case 4: return (t != null) ? (t.getBono() * 100) + "%" : "No Definido";
            case 5: return (t != null) ? t.getSueldoFinal() : "No definido";
            case 6: return (t != null) ? t.getPagado() : "No definido";
            default: return null;
        }
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    
}
