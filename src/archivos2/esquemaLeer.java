/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fernando stiven
 */
public class esquemaLeer {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File archivo=new File("joe.txt");//crea el archivo 
        FileInputStream fi=new FileInputStream(archivo);//lee los bytes que posee el archivo 
        DataInputStream data=new DataInputStream(fi);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String nombre=br.readLine();
        int o=Integer.parseInt(nombre);
        o=data.readInt();
        System.out.println(o);
        data.close();
        fi.close();
        
        
        
        
        
        
        
        
        
    }
   
}
