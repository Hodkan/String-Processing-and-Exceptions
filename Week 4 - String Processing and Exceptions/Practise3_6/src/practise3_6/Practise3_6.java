/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise3_6;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("Finding the file...");
            InputStream in = new FileInputStream("myFile.txt");
            System.out.println("File opened");
        }
        catch(Exception e){
            System.out.println("Cannot find  the file");
        }
    }
    
}
