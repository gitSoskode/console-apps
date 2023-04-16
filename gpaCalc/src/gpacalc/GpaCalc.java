/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalc;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class GpaCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int n=0;
        double sum=0,g=0,cum=0,gpa,cur_gpa=0;
        String grade,go="";
        do {
                for(int i=1; i<8;i++) {
                        System.out.println("Enter Grade ");
                        grade=read.next();
                        if("A".equals(grade) ||"a".equals(grade)) {
                                g=4.0;
                        }else if("B".equals(grade) ||"b".equals(grade)) {
                                g=3.0;
                        }else if("B+".equals(grade) ||"b+".equals(grade)) {
                                g=3.5;
                        }else if("C".equals(grade) ||"c".equals(grade)) {
                                g=2.0;
                        }else if("C+".equals(grade) ||"c+".equals(grade)) {
                                g=2.5;
                        }else if("D".equals(grade) ||"d".equals(grade)) {
                                g=1.0;
                        }else if("D+".equals(grade) ||"d+".equals(grade)) {
                                g=1.5;
                        }else if("E".equals(grade) ||"e".equals(grade)) {
                                g=0.0;
                        }else {
                                System.out.println("Invalid grade type");
                        }
                        sum=sum+3*g;
                        cur_gpa=sum/21;
                }
                gpa=sum/21;
                n++;
                System.out.println("Press n or N for next semester results");
                go=read.next();
        }while(n<=8 && (go.equals("n")|| go.equals("n")));



        cum=(cum+gpa)/n;


        //Results pane
        System.out.println("Semester GPA "+cur_gpa);
        System.out.println("Cummulative GPA "+cum);
		

    }
    
}
