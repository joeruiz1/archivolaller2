/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.BufferedReader;
/**
 *
 * @author fernando stiven
 */
public class esquemAr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try{
         RandomAccessFile raf = new RandomAccessFile("test.esquema", "rw");
           BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese numero de registro:");
            int nr=br.read();
            raf.write(nr);
            raf.seek(0);
            System.out.println(""+raf.readLine());
           
           System.out.println("ingrese el nombre del esquema:");
            String nombre =br.readLine();
            raf.writeUTF(nombre);//escribe en el archivo lo que escribio en consola
           //coloca el nombre en la posicion 0
            raf.seek(60);
            
            
            System.out.println(""+raf.readUTF());
           
         
          
         
         
         
         
    } catch (IOException ex) {
         ex.printStackTrace();
      }   
    
    
    
    
    }
    
}
