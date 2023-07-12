/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.test.ambishar.testambishar;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Testambishar {

    public static void main(String[] args) {
        
        
        try {
            
            File file = new File("src/input/Data Alert.txt");
            
     
            Scanner scan = new Scanner(file);
            
            System.out.print("Output Hasil: ");
            
            System.out.println();
            
             while(scan.hasNextLine()){
                 
                String getDataString = scan.nextLine();    
                
                String[] splitNamaBank = getDataString.split(";");
                
                String hasilNamaBank = splitNamaBank [0];
                
                String hasilEnv = splitNamaBank [1];
                
                String portEnv = splitNamaBank [2];
                
                String statusEnv = splitNamaBank [4];
                
                System.out.println("\n Selamat Siang Rekan Bank "+hasilNamaBank + ",");
                
                
                System.out.println("\n Mohon Bantuan untuk Sign on pada envi berikut: ");
                
                System.out.println("\n Envi " + hasilEnv + " port " + portEnv +" terpantau " + statusEnv );
                
                
                System.out.println("\n Terima kasih ");
                
                
                System.out.print("--------------------------------------------------------------");
                
            }
            
        } catch (Exception e) {
            
            System.out.print("Erorr : " + e);
            
            
        }
        
        
    }
}
