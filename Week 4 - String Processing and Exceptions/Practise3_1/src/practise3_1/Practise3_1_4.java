/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise3_1;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise3_1_4 {

    public static String reverse(String str) {
        String strRev = "";
    for (int i = str.length()-1 ;i >= 0; i--) {
            strRev += str.charAt(i);
        }
        //endfor
        return strRev;
    }
    
    public static void main(String[] args) {

        String message = "Good Afternoon";
        System.out.println(reverse(message));
        
    }

    
    
}
