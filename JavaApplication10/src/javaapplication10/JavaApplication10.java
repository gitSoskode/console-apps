/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Eid Seagate
 */
public class JavaApplication10 {

    
    public static void main(String[] args) {
      /*System.out.println("What is your name buddy?");
        Scanner name=new Scanner(System.in);
        String man=name.nextLine();
        System.out.println("What a great friend of mine, "+man+"!");
    */
      //let's create a string object called name
      
     Scanner scanner=new Scanner(System.in);
     //let's concatenate now
     String man=new String("Hello boy!");
     man+="I'm your boss here pls respect authority.";
     //System.out.println(man +" We are not but partners in business for survival. We ain't just existing, we are surviving.\n"+man);
     
     //finding the length of characters in a string e.g above string man
     //System.out.println(man.length());
     //extracting a character from a string
     //System.out.println(man.charAt(29));
     
     //////finding the what a variable contains of a string literal using the .contains function
//   System.out.println(man.contains("boss"));
     
     //stripping empty spaces at the beginning of literal and ending
     String yam="    I love fufu with palm nut soup, prepared with chicken or beef.   ";
//      System.out.println(yam.trim());
//      System.out.println(man.length()+yam.length());
//      System.out.println(man.charAt(20)+yam.charAt(12));
//    String a,b,c,e,d;
//    a="I love another "; b="woman"; c=". She is currently in her early twentys.";
//    System.out.println("what's her precise age now?");
//    e=scanner.nextLine();
//    System.out.println(" her nature Sir?");
//    d=scanner.nextLine();
//    
//    System.out.println(a+b+e+c+d);

//cutting a string
System.out.println(yam.substring(4,13));

//cut the first n literals
System.out.println(yam.substring(4));
//repeating a string output several times
//System.out.println(yam.repeat(4)); //works but not functioning on the IDE now
    //comparing literal values 
    System.out.println(yam.equals(man));  ///returns boolean
    System.out.println(yam.equals("hello"));
    }
    
}
