/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GaelCM
 */
public class Metodos {
    
    
    public void cargarArchivos(File archivo){
        
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            
            String array;
            
            try {
                while((array = br.readLine())!=null){
                    
                    String arreglo[]=array.split(",");
                    if(arreglo.length==5){
                        Datos i=new Datos();
                        i.setNombre(arreglo[0]);
                        i.setAño(arreglo[1]);
                        i.setAutor(arreglo[2]);
                        i.setGenero(arreglo[3]);
                        i.setDiscografica(arreglo[4]);
                        
                    }
                    
                }
            } catch (IOException ex) {                
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
