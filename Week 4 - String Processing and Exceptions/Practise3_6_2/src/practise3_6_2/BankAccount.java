/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise3_6_2;

/**
 *
 *Ali Albayrak - P304320
 */
public class BankAccount {
    private int balance;
    private int number;
    
    
    public BankAccount(int number, int balance) throws myException{
        if(balance<0){
            throw new myException("Balance cannot be negative: " + balance);
        }
        else{
            this.balance = balance;
            this.number = number;
            System.out.println("Account has created.");
        }
    }
    
}
