/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesspassword;

import java.util.Scanner;
/**
 *
 * @author SosKode
 */
public class GuessPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        //System.out.println("Please enter your nickname");
        String nick;
        final int attempts;
        attempts = 4;
        int count=0,flag=0, diff;
//        System.out.println("Please enter your nickname");
//        nick=read.next();
        
        do{
            System.out.println( "Pls enter the correct name. ");
            nick=read.next();
            count+=1;
            diff=attempts-count;
            
            if(!nick.equals("name")){
                System.out.println(diff+" attempts left.");
            }if (!nick.equals("name") && diff==0){
                System.out.println("Oops!! You made "+count+" attempts.");
                flag=flag+1;            //flag=flag+1;
                break;
            }
         } while(!nick.equals("name"));  
        switch(flag){
            case 1:
                System.out.println("May try again later.");
                break;
            default:
                System.out.println("Congratulations!! You made it in "+count+" attempts.");
                System.out.println("Correct guess.");
                
        }
    }
    
}

