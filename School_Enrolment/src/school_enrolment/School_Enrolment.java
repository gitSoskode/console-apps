/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_enrolment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author SosKode
 */

class sch implements Serializable{
    int fStaff;
    int mStaff;
    String headName;
    int stud_pop;
    //sch constructor
    sch(String headName, int stud_pop,int mStaff,int fStaff ){ //setter constructor
        //initializing instant ojb with parameters
        this.fStaff=fStaff;
        this.mStaff=mStaff;
        this.headName=headName;
        this.stud_pop=stud_pop;
    }
    public String toString(){ //stringifying and concatenating data in a block
        return headName+" "+stud_pop+" "+mStaff+" "+fStaff;
    }
    
}

public class School_Enrolment{
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    //Now in the main to interact with the user
    Scanner read=new Scanner(System.in);
    int option;
    ArrayList<sch> al=new ArrayList<>();            //for data collection
    File file = new File("C:\\Users\\SosKode\\OneDrive\\Desktop\\School enrolment.txt");                       //for the text file to temporally safe data
    ObjectOutputStream oos ; 
    ObjectInputStream ois ;
    ListIterator li ;
    if(file.isFile()){
        ois=new ObjectInputStream(new FileInputStream(file));
        al=(ArrayList<sch>)ois.readObject();
        ois.close();
    }
    do{
        System.out.println("Provide as appropriate the following data of your enrolment\n");
        System.out.println("1. Insert data");
        System.out.println("2. Preview data");
        System.out.println("0. Exit");
        option  =read.nextInt();
        
        //Using switch to proceed on choice
        switch(option){
            case 1:
                System.out.println("How many times do you want to insert data?");
                int times = read.nextInt();
                for(int i=1; i<=times;i++){                 //Using for loop to iterate the times required
                    System.out.println("Headteacher's name:");
                    String headName = read.next();
                    System.out.println("Student population");
                    int stud_pop = read.nextInt();
                    System.out.println("Enter male staffing no:");
                    int mStaff= read.nextInt();
                    System.out.println("Enter female staffing no:");
                    int fStaff = read.nextInt();
                    
                    al.add(new sch(headName,stud_pop,mStaff,fStaff));
                }
                oos =  new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(al);        //to write data after iteration
                oos.close();
                //How to write the data
               // FileWriter fw = new FileWriter();
               break;
            case 2:
                System.out.println("---------------------------------------");
                li=al.listIterator();
                System.out.println(al);
                while(li.hasNext()){
                    System.out.println(li.next());
                }
                System.out.println("---------------------------------------");
                break;
               
        }
        
    }while(option!=0);
    
    
    }
}
