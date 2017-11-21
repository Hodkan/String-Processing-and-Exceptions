/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise3_6_2;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise3_6_2 {

    /**
     * @param args the command line arguments
     * @throws practise3_6_2.myException
     */
    public static void main(String[] args) throws myException {
        BankAccount account1;

        try {
                account1 = new BankAccount(223445, -100);
                }
        
        catch(myException e){
                   System.out.println(e.getMessage());
                   }
        }

    }
