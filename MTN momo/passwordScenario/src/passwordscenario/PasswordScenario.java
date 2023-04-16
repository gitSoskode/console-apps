/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordscenario;

import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class PasswordScenario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //a program to compare password from the user to the correct one stored on memory
      String password="Tiehi";
      System.out.println("Guess password:");
      Scanner scanner=new Scanner(System.in);
      String hold=scanner.nextLine();
      if(password.equals(hold)){
      System.out.println("Got it!");
      }else{
      System.out.println("Oops! Try again later.");}
    }

}
