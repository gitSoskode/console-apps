/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.traffic.light;
import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class TheTrafficLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a program to enable a self-driving car use the traffic light 
    Scanner load=new Scanner(System.in);
    System.out.println("What is the color of the traffic light?\n");
    String man=load.nextLine();
    

    switch (man){
      case "red":
      System.out.println("Please stop the car yet!!"); break;
      case "RED":
      System.out.println("Please stop the car yet!!");break;
      case "Red":
      System.out.println("Please stop the car yet!!");
      break;
      case "green":
      System.out.println("Please move car ahead!!");break;
      case "GREEN":
      System.out.println("Please move car ahead!!");break;
      case "Green":
      System.out.println("Please move car ahead!!");
      break;
      case "yellow":
      System.out.println("Please get ready to move the car ahead!!");break;
      case "YELLOW":
      System.out.println("Please get ready to move the car ahead!!");break;
      case "Yellow":
      System.out.println("Please get ready to move the car ahead!!");
      break;
      case "Off":
      System.out.println("Please watchout for police directive!!");break;
      case "OFF":
      System.out.println("Please watchout for police directive!!");break;
      case "off":
      System.out.println("Please watchout for police directive!!");
      break;
      default:
      System.out.println("Please continue to drive carefully!!");
    }
    
}
}
