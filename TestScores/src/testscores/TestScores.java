/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testscores;


public class TestScores {
    //Intance Fields
    private double test1, test2, test3;
    //Constructor that initializes the instance fields
    public TestScores(double t1, double t2, double t3)
    {
        test1=t1;
        test2=t2;
        test3=t3;
    }
    //Method for calculating the average
    public char grader(double avg)
    {
        avg=(test1 + test2 + test3)/3;
        if(avg<50)
        {
            return 'E';
        }
        else if(avg<60)
        {
            return 'D';
        }
        else if(avg<70)
        {
            return 'C';
        }
        else if(avg<80)
        {
            return 'B';
        }
        else if(avg<=100)
        {
            return 'A';
        }
        else 
        {
            return '?';
        }
    }
    
}
