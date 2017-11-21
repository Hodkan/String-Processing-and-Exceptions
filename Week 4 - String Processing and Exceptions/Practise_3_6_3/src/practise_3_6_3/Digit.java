/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise_3_6_3;

/**
 *
 *Ali Albayrak - P304320
 */
public class Digit {

    private int value;

    public Digit(int value) {
        // Class invariant assert
        assert value > 0 && value < 10 : "Digit value cannot be negative or greater than 9";       
        int x = value % 2;      
        switch (x) {
            case 0:
                System.out.println("Digit is even number: " + value);
                break;
            case 1:
                System.out.println("Digit is not even number: "  + value);
                break;
          //Control Flow Invariants
            default:
                assert false : "Unknown Digit. Something is wrong!";
                break;
        }

    }
}
