/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalhost;

import java.util.Scanner;

/**
 *
 * @author Eid Seagate
 */
public class GeneralHost {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Strings
        /*String go="Going to school five times a week.";
        String concat=String.format("I love those people fond of %s",go);
        System.out.println(concat);*/
        
        //Decimal place
//        String decimal=String.format("Decimal upto 10 place %.10f", 97.25);
//        System.out.println(decimal);
//        //spacing of value
//        
//        String space =String.format("Space upto 7 spaces %17.3f", 5.88);
//        System.out.println(space);

    // Assigning a value to a string variable
    
    /*String str_1=String.valueOf(5.6);
    String str_2=String.valueOf(45);
    String str_3=String.valueOf(str_1+str_2);
    System.out.println(str_3);*/
    
    
    //Accept first name
    System.out.println("Enter first name\n");
    Scanner read=new Scanner(System.in);
    String first_name=read.nextLine();
    System.out.println("Enter last name\n");
    String last_name=read.nextLine();
    //change both names to lowercase
    String first_lower=first_name.toLowerCase();
    String last_upper=last_name.toUpperCase();
    
    //get last four literals of first_lower
    String last_4lit=first_lower.substring(first_lower.length()-4,first_lower.length());
    //get first three literals of last_upper
    String first_3lit=last_upper.substring(0,3);
    
    //get DOB note format must be ddmmyyyy, excluding the forward slash
    double[] arr_DOB=new double[3];
    int testValue;
    System.out.println("Enter Month of birth in mm format without /\n");
    testValue=read.nextInt();
    // Check to ensure double digits mm
        String mm_form="";
    if(testValue==1||testValue<=12){
        arr_DOB[1]=testValue;
        if(testValue<=9){
            mm_form=String.format("0"+testValue);
        }else {mm_form=String.valueOf(testValue);
        }
    }else{System.out.println("Incorrect month entry. \nExpects entry in range of '01' to '12'");}
    
    System.out.println("Enter Day of birth in dd format without /\n");
    testValue=read.nextInt();
        String dd_form;
        dd_form = "";
    if(testValue==1||testValue<=31){
        arr_DOB[0]=testValue;
        if(testValue<=9){
            dd_form=String.format("0"+testValue);
        }else {dd_form=String.valueOf(testValue);
        }
    }
    else{
    System.out.println("Invalid date of a month.");
    }
    //Checking validity of days range for some months such as Sept, April, June, Nov and Feb
    if (arr_DOB[1]==9 || arr_DOB[1]==4||arr_DOB[1]==11 || arr_DOB[1]==6 &&arr_DOB[0]==31 ){
    System.out.println((int)arr_DOB[1]+" month must not be more than 30 days.");
    }else if(arr_DOB[1]==2 &&arr_DOB[0]>29 ){    //checking for Feb
    System.out.println((int)arr_DOB[1]+" month must not be more than 29 days.");
    }else{
    System.out.println("Check month range and try again.");
    }
    System.out.println("Enter Year of birth in yyyy format\n");
    testValue=read.nextInt();
    if(testValue==1922||testValue<=2022){
        arr_DOB[2]=testValue;
    }else{
    System.out.println("Invalid year of birth.");
    }
    //Stringify dates together and concatenate it
    
    /*String dd=String.valueOf(arr_DOB[0]);
    String mm=String.valueOf(arr_DOB[1]);
    */
    String yyyy;
        yyyy = String.valueOf(arr_DOB[2]);
    String concat_DOB=String.format(dd_form+mm_form+yyyy);
    //summing all elements of the arr_DOB
    double sum_arr_DOB = arr_DOB[0] + arr_DOB[1] + arr_DOB[2];
    //convert sum_arr_DOB to a string literal using the valueOf method
    
    //String sum_DOB=String.valueOf(sum_arr_DOB);
    String sum_DOB; 
    sum_DOB= "" + (int)sum_arr_DOB;
    //let's create a password from the combination of the DOB sum and excerpts from first_3lit and last_4lit
    String password = first_3lit + sum_DOB + last_4lit;
    
    System.out.println("First three literals from last name is: " + first_3lit);
    System.out.println("Last four literals from first name is: " + last_4lit);
    System.out.println("Sum of the digits of DOB is: " + sum_DOB);
    System.out.println("Your user default password is:\n" + password);
    
    
    //generating gmail username suggestions
    /*String suggest_1,suggest_2,suggest_3,suggest_4;
    suggest_1=first_lower+(int)(arr_DOB[0]+arr_DOB[1])+"@gmail.com";
    suggest_2=last_name.toLowerCase()+(int)(arr_DOB[0]+arr_DOB[1])+"@gmail.com";
    suggest_3=first_lower+last_name+(int)(arr_DOB[0]+arr_DOB[1])+"@gmail.com";
    suggest_4=last_name.substring(0,3)+first_lower+(int)(arr_DOB[0]+arr_DOB[1])+"@gmail.com";
    */
    //Alternative to the above username suggestion using for loop
        String username1,username2,username3,username4;
    
        username1=String.format(first_name.substring(0,(int)first_name.length()*1/3)+last_name+concat_DOB.charAt(3)+concat_DOB.charAt(4)+concat_DOB.charAt(7)+"@gmail.com");
        username2=String.format(last_name+first_name+concat_DOB.substring(3,3)+"@gmail.com");
        username3=String.format(last_name.substring(last_name.length()-3)+first_name.substring(0,(int)(first_name.length()/2))+(int)(sum_arr_DOB/2)+"@gmail.com");
        username4=String.format(first_name+last_name.charAt(0)+(int)arr_DOB[2]/3+"@gmail.com");
    
    //display to user the suggestions to choose from
    System.out.println("Choose a username or create your preferred username\n "+"\n1."+ username1.toLowerCase()+"\n2. "+username2.toLowerCase()+"\n3. "+username3.toLowerCase()+"\n4. "+username4.toLowerCase());
    }
}