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
public class Practise3_1 {

    public static void backwardsDay(String original) {
        String backwards = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            backwards += original.substring(i, i + 1);
        }
        System.out.println(backwards);
    }//end method backwardsDay

    public static void main(String[] args) {

        String message = "Good Morning";
        backwardsDay(message);
    }

}
