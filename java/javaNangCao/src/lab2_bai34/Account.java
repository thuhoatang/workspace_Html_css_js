/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;


import java.io.Serializable;
import java.util.Comparator;

import java.util.Scanner;

/**
 *
 * @author Tran Dai
 */
public class Account  implements Serializable{
    private static final long serialVersionUID = -6500665823330706018L;
    private String accountID,firstName,lastName;
    private int balance = 0;

    public Account() {
    }

    
    public Account(String accountID, String firstName, String lastName) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    
    
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    void fillInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.print("ID              : ");
        setAccountID(sc.nextLine());
        System.out.print("First Name      : ");
        setFirstName(sc.nextLine());
        System.out.print("Last Name       : ");
        setLastName(sc.nextLine());
        System.out.print("Balance         : ");
        setBalance(Integer.parseInt(sc.nextLine()));
        System.out.println("");
    }
    
    void query(){
        System.out.println("ID              : "+getAccountID());       
        System.out.println("First Name      : "+getFirstName());
        System.out.println("Last Name       : "+getLastName());
        System.out.println("Balance         : "+getBalance());
        System.out.println("");

    }
}

class Sortbyroll implements Comparator<Account> {

    @Override
    public int compare(Account t, Account t1) {
        return t.getAccountID().compareTo(t1.getAccountID());
    }

}