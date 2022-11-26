/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_arreglos.Utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import practica1_arreglos.controlador.EmpresaController;
import practica1_arreglos.modelo.Rango;
import practica1_arreglos.modelo.Trabajador;

/**
 *
 * @author leomah
 */
public class Utilidades {
    public static int calcularAniosEmpleo(Calendar fechaIngreso){
        int aniosEmpleo;
        Calendar c1 = Calendar.getInstance();
        
        aniosEmpleo = c1.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR);
        
        return aniosEmpleo;
    }
    
    public static Rango obtenerRango(Trabajador trabajador){
        if (trabajador.getAniosEmpleo() <= 5) {
            return Rango.JUNIOR;
        }else if(trabajador.getAniosEmpleo() <= 15){
            return Rango.SENIOR;
        }else{
            return Rango.VETERANO;
        }
    }
    
    public static Float obtenerBono(Rango rango){
        
        switch (rango) {
            case JUNIOR: return 0f;
            case SENIOR: return 0.1f;
            case VETERANO: return 0.2f;
            default:
                return 0f;
        }
    }
    
    public static Float obtenerSueldoFinal(Trabajador t1){
        return t1.getSueldo() + (t1.getSueldo() * t1.getBono());
    }
    
    public static void guardarJSON(EmpresaController ec) throws FileNotFoundException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(ec);
        try {
            PrintWriter escritor = new PrintWriter(new File("empresa.json"));
            escritor.write(json);
            escritor.flush();
            escritor.close();
            JOptionPane.showMessageDialog(null, "Se guardó");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            System.out.println(e);
        }        
    }
    
    public static EmpresaController leerJson() throws IOException{
        EmpresaController ec = new EmpresaController();
        Reader lector = Files.newBufferedReader(Paths.get("empresa.json"));
        Gson gson = new Gson();
        ec = (gson.fromJson(lector, EmpresaController.class));
        return ec;
    }
}
