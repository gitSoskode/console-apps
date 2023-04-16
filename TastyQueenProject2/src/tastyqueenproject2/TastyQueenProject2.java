/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tastyqueenproject2;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class TastyQueenProject2 {

    Scanner reader = new Scanner(System.in);
    String reply;
    double p1,p2,p3,p4,amount=0;
    double subtotal_Fr1, subtotal_Jr1, subtotal_Pr1,subtotal_Pz1;
    double subtotal_Fr2, subtotal_Jr2, subtotal_Pr2,subtotal_Pz2;
    double subtotal_Fr3, subtotal_Jr3, subtotal_Pr3,subtotal_Pz3;
    double subtotal_Fr4, subtotal_Jr4, subtotal_Pr4,subtotal_Pz4;
    int num=0,     num1, num2, num3, num4, count=1,flag1,flag2,flag3,flag4;
    String askPack="Do you want other Fried Rice packs?";
    public  void FRmethod(){
        do{
            System.out.println("Choose your package");
            System.out.println("@GHS:\n1\t15\n2\t20\n3\t25\n4\t30");
            System.out.println("Enter package amount");
            amount =reader.nextDouble();

            p1=15;      p2=20;      p3=25;    p4=30;
            //flag1=0;    flag2=1;    flag3=1;  flag4=1;
                if(amount==p1 && flag1!=1){         //@p1=GHS15
                    
                    System.out.println("How many folds of GHS"+p1+"?");
                    num=reader.nextInt();
                    subtotal_Fr1 = amount*num;
                    num1=num;
                    count=count + 1;
                    
                    //for more other Fried rice packs
                    System.out.println(askPack);
                    reply = reader.next();
                    
                    if(!("Y".equals(reply) || "y".equals(reply))){
                        count=4;
                    }flag1++;

                }else if(amount==p2  && flag2!=1){          //@p1=GHS20
                    
                    System.out.println("How many folds of GHS"+p2+"?");
                    num=reader.nextInt();
                    subtotal_Fr2 = amount*num;
                    num2=num;
                    count=count + 1;
                    flag2++;
                    //for more other Fried rice packs
                    System.out.println(askPack);
                    reply = reader.next();
                    if(!("Y".equals(reply) || "y".equals(reply))){
                        count=4;
                    }

                }else if(amount==p3 && flag3!=1){          //@p1=GHS25
                    
                    
                    System.out.println("How many folds of GHS"+p3+"?");
                    num=reader.nextInt();
                    subtotal_Fr3 = amount*num;
                    num3=num;
                    count=count + 1;
                    flag3++;
                    //for more other Fried rice packs
                    System.out.println(askPack);
                    reply = reader.next();
                    if(!("Y".equals(reply) || "y".equals(reply))){
                        count=4;
                    }

                }else if(amount==p4 && flag4!=1){       //@p1=GHS30
                    
                    System.out.println("How many folds of GHS"+p4+"?");
                    num=reader.nextInt();
                    subtotal_Fr4 = amount*num;
                    num4=num;
                    count=count + 1;
                    flag4++;
                    //for more other Fried rice packs
                    System.out.println(askPack);
                    reply = reader.next();
                    if(!("Y".equals(reply) || "y".equals(reply))){
                        count=4;

                    }
                }else{
                    System.out.println("You either bought the same item already or wrong input made.");
                }
                
            }while(count!=4);
        
            if(count==4){
                System.out.println("Item\tQntty\tTotal");
                System.out.println("FRIED RICE");
                System.out.println("@GHS15\t"+num1+"\t"+subtotal_Fr1);
                System.out.println("@GHS20\t"+num2+"\t"+subtotal_Fr2);
                System.out.println("@GHS25\t"+num3+"\t"+subtotal_Fr3);
                System.out.println("@GHS30\t"+num4+"\t"+subtotal_Fr4);
                System.out.println("-------------------------------------");
                System.out.println("");
                System.out.println("Total Items\t"+(num1+num2+num3+num4)+"\t"+(subtotal_Fr1+subtotal_Fr2+subtotal_Fr3+subtotal_Fr4));
            }
    }
    
    public static void JRmethod(){
        
    }
    
    public static void PRmethod(){
        
    }
    
    public static void Pzmethod(){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TastyQueenProject2 me =new TastyQueenProject2();
        me.FRmethod();
        System.out.println("leak");
    }
    
}
