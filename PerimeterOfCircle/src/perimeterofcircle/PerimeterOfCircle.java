/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterofcircle;

/**
 *
 * @author Eid Seagate
 */
public class PerimeterOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //variable declaration
    double Perimeter, Radius;
    
    //Assign data
    Radius=5.5;
   final double Pi=3.142;
   
   //calculate the perimeter
   Perimeter=2*Radius*Pi;
   
   //display results
        System.out.println("The Perimeter of the Circle is "+Perimeter);
    
    }
    
}
