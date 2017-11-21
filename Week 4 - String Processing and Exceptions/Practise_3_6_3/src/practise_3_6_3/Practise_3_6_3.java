/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise_3_6_3;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise_3_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int a = 4;
       //Internal Invariant
       assert a > 0 : "a cannot be negative";
       
       int b = 7;
       
       Digit myDigit = new Digit(a);
       
       Digit myDigit2 = new Digit(b);
       
       
    }
    
}
