/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class NotaFin {
    public static void main(String[] args) throws IOException {
        try{
            BufferedWriter fin = new BufferedWriter(new FileWriter("nota.txt"));
            String cad = null;
            Scanner aa = new Scanner(System.in);
            cad = aa.next(cad);
            while(!cad.equals("fin")){
                cad = aa.next();
                fin.write(cad);
                fin.newLine();
                fin.flush();
            }
            fin.close();
        }catch (Exception e){
            
        }
    }
}
