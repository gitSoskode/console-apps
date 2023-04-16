/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedcal1;

import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class SpeedCal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a program to calculate the speed of a car in miles per hour
        // declare necessary variables
        double mil, kil,hr,sec,min,speedMilHr;
        //import scanner for input
        Scanner take=new Scanner (System.in);
        System.out.println("Enter distance covered in km\n");   // display to user
        kil=take.nextDouble();      //accept distance in km
        mil=kil/1.6;    //converting distance to miles
        System.out.println("Enter time used in min\n");     //accept the time used
        min=take.nextDouble();  //accepting the minutes
        hr=min/60;      //converting the time to hours
        System.out.println("Enter the time in sec\n");
        sec=take.nextDouble();
        hr=hr+sec/3600;
        speedMilHr=mil/hr;      //setting the speed variable
        //the final output
        System.out.println("The speed is "+speedMilHr+" miles per hour.");
        
    }
    
}
