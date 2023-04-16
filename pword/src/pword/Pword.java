/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pword;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class Pword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        //ask user to enter any name
        System.out.println("Enter any name in any case\n");
        String name=read.next();
        
        String password=String.format(name.substring(2,2)+name.substring(0,2));
        String pwGuess/*, pw="Tiehisung"*/;
        System.out.println("Guess password");
        pwGuess=read.next();
        
       
        while(!pwGuess.equals(password)){
            System.out.println("Guess password");
            pwGuess=read.next();
        }
        System.out.println("Congratulations!");
    }
    
}
