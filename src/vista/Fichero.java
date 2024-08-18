/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fichero {
    //atributos
    File objFichero;
    String path;
    String contenido;
    // comportamientos
    public File nuevo(String path){
        this.objFichero=new File(path);
        System.out.println(this.objFichero.getAbsolutePath());
        return this.objFichero;
    }
    
    public String leer(File objFichero){
        Scanner myReader;
        try{
            myReader = new Scanner(objFichero);
            while(myReader.hasNextLine()){
                contenido= myReader.nextLine();
                System.out.println(contenido);
            }
            
        } catch (FileNotFoundException ex){
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE,null,ex);
            return contenido;
        }
        public void escribir(File objFichero, String datos){
            FileWriter myWriter;
            try{
            myWriter=new FileWriter(objFichero);
            myWriter.write(datos);
            myWriter.close();
        }   catch (IOException ex){
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
}
