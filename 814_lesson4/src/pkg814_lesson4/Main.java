/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg814_lesson4;

import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //String light="yellow";
        
       /* if(light=="Red"){
            System.out.println("Stop");
        }
        else if(light=="Yellow"){
        System.out.println("Get ready");
        }
        else if(light=="Green"){
        System.out.println("Go");
        }
        else{
        System.out.println("Go");
        }
    */
      
      
      
      // using a switch control
      String light="";
      switch(light){
          case "off":
              System.out.println("Stop");
              break;
          case "OFF":
              System.out.println("Stop!!");
              break;
          case "yellow":
              System.out.println("Get ready!!");
              break;
          case "YELLOW":
              System.out.println("Get ready!!");
              break;
          case "green":
              System.out.println("Go!!");
              break;
          case "GREEN":
              System.out.println("Go!!");
              break;
          default:
              System.out.println("Stop!!");
      }
    }
    
}
