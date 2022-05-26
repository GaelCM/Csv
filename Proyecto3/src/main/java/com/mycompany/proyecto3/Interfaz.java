/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author GaelCM
 */
public class Interfaz extends javax.swing.JFrame {
    
    
    LinkedList<Datos> info=new LinkedList<>();
    
    
    ;
    
    DefaultTableModel miTabla;
    Vector cabecera=new Vector();

    public Interfaz() {
        initComponents();
        cabecera.addElement("Nombre");
        cabecera.addElement("Año");
        cabecera.addElement("Autor");
        cabecera.addElement("Genero");
        cabecera.addElement("Discografica");
        cabecera.addElement("Plataforma");
        miTabla=new DefaultTableModel(cabecera,0);
        jTable1.setModel(miTabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        disc = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cargar = new javax.swing.JButton();
        año = new javax.swing.JTextField();
        plataforma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Canción");

        jLabel2.setText("Año");

        jLabel3.setText("Autor");

        jLabel4.setText("Genero");

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reggaeton", "Rap", "Pop", "Rock", "RegionalMexicano", "Banda", "Indie", "Trap", "Kpop" }));

        jLabel5.setText("Discografica");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        plataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spotify", "iTunes", "AmazonMusic", "Youtube", "otro" }));

        jLabel6.setText("Plataforma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(año, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genero, 0, 372, Short.MAX_VALUE)
                    .addComponent(disc)
                    .addComponent(plataforma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
       
          Datos objB=new Datos();
          
         objB.setNombre(nombre.getText());
         objB.setAño(año.getText());
         objB.setAutor(autor.getText());
         objB.setGenero(genero.getSelectedItem().toString());
         objB.setDiscografica(disc.getText());  
         objB.setPlataforma(plataforma.getSelectedItem().toString());
         info.add(objB);
                 
         
         llenarTabla();
    }//GEN-LAST:event_CrearActionPerformed

    
    
    
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        JFileChooser seleccionarArchivo=new JFileChooser();
       FileNameExtensionFilter filtro=new  FileNameExtensionFilter(".csv","csv");
       
       seleccionarArchivo.setFileFilter(filtro);
       int seleccionar=seleccionarArchivo.showOpenDialog(this);
       
       if(seleccionar== JFileChooser.APPROVE_OPTION){
           File archivo= seleccionarArchivo.getSelectedFile();
           guardarArchivos(archivo);
       }

    }//GEN-LAST:event_guardarActionPerformed

    private void guardarArchivos(File archivo) {
        try {
            FileWriter fw=new FileWriter(archivo);
            PrintWriter pw=new PrintWriter(fw);
            
            for(Datos u: info){
                String linea= u.getNombre()+", "+u.getAño()+", "+ u.getAutor()+", "+u.getGenero()+", "+u.getDiscografica()+", "+u.getPlataforma();
                pw.println(linea);
                
            }
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
       JFileChooser seleccionarArchivo=new JFileChooser();
       FileNameExtensionFilter filtro=new  FileNameExtensionFilter("Archivos tipo .CSV","csv");
       
       seleccionarArchivo.setFileFilter(filtro);
       int seleccionar=seleccionarArchivo.showOpenDialog(this);
       
       if(seleccionar== JFileChooser.APPROVE_OPTION){
           File archivo= seleccionarArchivo.getSelectedFile();
           cargarArchivos(archivo);
       }
       
    }//GEN-LAST:event_CargarActionPerformed
    
   
    
    public void cargarArchivos(File archivo){
        
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            
            String array;
            

            try {
                while((array = br.readLine())!=null){
                    
                    String arreglo[]=array.split(",");
                    if(arreglo.length==6){
                        Datos i=new Datos();
                        i.setNombre(arreglo[0]);
                        i.setAño(arreglo[1]);
                        i.setAutor(arreglo[2]);
                        i.setGenero(arreglo[3]);
                        i.setDiscografica(arreglo[4]);
                        i.setPlataforma(arreglo[5]);
                        info.add(i);
                    }
                    
                    llenarTabla();
                }
                
             fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField autor;
    private javax.swing.JTextField año;
    private javax.swing.JTextField disc;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> plataforma;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel mD=new DefaultTableModel(new String[]{"Nombre"," Año"," Genero", " Autor"," Discografica","Plataforma"},info.size());
        
        jTable1.setModel(mD);
        
        TableModel tm= jTable1.getModel();
        
        for(int i=0;i<info.size();i++){
            Datos p=info.get(i);
            
            tm.setValueAt(p.getNombre(), i, 0);
            tm.setValueAt(p.getAño(), i, 1);
            tm.setValueAt(p.getAutor(), i, 2);
            tm.setValueAt(p.getGenero(), i, 3);
            tm.setValueAt(p.getDiscografica(), i, 4);
            tm.setValueAt(p.getPlataforma(),i,5);
        }
        
        
    }   
}
