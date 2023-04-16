/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordScenario;

import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class NewClass {
    public static void main(String[] args){
    Scanner accept=new Scanner(System.in);
    String correct="Love";
    //display to the user
    System.out.println("Guess password");
    String pd=accept.nextLine();
    System.out.println(correct.equals(pd));
    
    }
    
}
