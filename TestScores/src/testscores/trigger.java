/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testscores;

import java.util.Scanner;

public class trigger {
    public void main(String[] args )
    {
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Enter test1");
        double test1=input.nextDouble();
        
        System.out.println("Enter test1");
        double test2=input.nextDouble();
        
        System.out.println("Enter test3");
        double test3=input.nextDouble();
        
        TestScores student1 = new TestScores(test1,test2,test3);
        student1.grader(test1,test2,test3);
        
    }
}
