/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathgme;
import java.util.Scanner;

public class MathGme {
    //Some necessary methods
    //Addition of two
    
    public static void floatAdder(double n1,double n2, double n3){
        ans1=n1+n2+n3;
    }
    public static void floatAdder(double n1,double n2){
        ans1=n1+n2;
    }
    public static void multQuiz(int a, double b){
        ans1=a*b;
    }
    public static void divQuiz(int a, int c){
        ans1=c/a;
    }
    
    static Scanner input    = new Scanner(System.in);
    static double ans1, ans2,ans;
    
    public static void main(String[] args) {
        int cor=0,incor=0;
        int i=1;
        //Dashboard
        double n1=3,   n2=5,   n3=4;int repeat1=0,repeat2=0,repeat3=0,repeat=0;
        System.out.println("Welcome to level 1 stage 1 \n-the Beginners quiz game".toUpperCase());                                          //1
        do{
            if(repeat1>0){
                System.out.println("Welcome back to retrial number:\t"+repeat);
            }
            System.out.println("Add the numbers as they drop in the series");
            floatAdder(n1,n2,n3);
            System.out.println("Q"+i+".\t "+n1+",\t "+n2+",\t "+n3);
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            floatAdder(n1/12,n2,n3+12);
            System.out.println("Q"+i+".\t"+n1/12+",\t"+n2+",\t"+(n3+12));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            floatAdder(n1*.25,n2*.125,n3*.75);
            System.out.println("Q"+i+".\t"+n1*.25+",\t"+n2*.125+",\t"+n3*.75);
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            floatAdder(n1*3,n2+7,n3-4);
            System.out.println("Q"+i+".\t"+n1*3+",\t"+(n2+7)+",\t"+(n3-4));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            floatAdder(n1/2,n2/3,n3/4);
            System.out.println("Q"+i+".\t"+n1/2+",\t"+n2/3+",\t"+n3/4);
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;                                                                       //L1S1 Ended
            //Using System.exit(0) to control the procession of the game
            int count=0;String go;

            if(cor>incor){
                System.out.println("Bravo!! You conquered the noble stage\n");
                System.out.println("-----------------------------------------");
                System.out.println("Performance log\n\tCorrect:\t"+cor+"\n\tIncorrect:\t"+incor+"\nYou have accumulated "+cor*100/5+" points");
                System.out.println("==========================================");
                if(cor*100/5<60){
                    System.out.println("The key has been handed to you to open the next challenge.");
                }else if(cor*100/5>60 && cor*100/5<=80){
                    System.out.println("Incredible smartness at display. Keep it up\n");
                }else if(cor*100/5>80){
                    System.out.println("Have you ever been informed?\n There are only two of you genus left on planet earth!");
                }
                System.out.println("----------------------------------------------------------");
            }else{
                repeat1++;
                if(repeat1==3){
                    System.out.println("You are advised to relook at addition of numerals once again.");
                    System.out.println("Better luck next time Buddy!!");
                    System.exit(0);
                }
                continue;//
                
            }
            
            System.out.println("\nPress Y or y to accept or any other key to decline offer");
            
            do{
                go=input.next();
                if("Y".equals(go) || "y".equals(go)){
                }else{
                    System.exit(0);
                }

                repeat=0;
                //First promotion to the level 1 stage 2
                System.out.println("Welcome to level 1 stage 2\nIncrease your challenge".toUpperCase());

                cor=0; incor=0;
                floatAdder(n1+2,n2+4,n3*2);
                System.out.println("Q"+i+".\t"+(n1+2)+",\t"+(n2+4)+",\t"+n3*2);
                ans2=input.nextDouble();
                if(ans1==ans2){
                    System.out.println("Correct");
                    cor++;
                }else{
                    System.out.println("Oops!! The correct ans is: "+ans1);
                    incor++;
                }i++;
                floatAdder(n1-9,n2+.5,n3+47);
                System.out.println("Q"+i+".\t"+(n1-9)+",\t"+(n2+.5)+",\t"+(n3+47));
                ans2=input.nextDouble();
                if(ans1==ans2){
                    System.out.println("Correct");
                    cor++;
                }else{
                    System.out.println("Oops!! The correct ans is: "+ans1);
                    incor++;
                }i++;
                floatAdder(n1+13,n2+13,n3+45);
                System.out.println("Q"+i+".\t"+(n1+13)+",\t"+(n2+13)+",\t"+(n3+45));
                ans2=input.nextDouble();
                if(ans1==ans2){
                    System.out.println("Correct");
                    cor++;
                }else{
                    System.out.println("Oops!! The correct ans is: "+ans1);
                    incor++;
                }i++;
                floatAdder(n1*7,n2*7,n3*8);
                System.out.println("Q"+i+".\t"+n1*7+",\t"+n2*7+",\t"+n3*8);
                ans2=input.nextDouble();
                if(ans1==ans2){
                    System.out.println("Correct");
                    cor++;
                }else{
                    System.out.println("Oops!! The correct ans is: "+ans1);
                    incor++;
                }i++;
                floatAdder(n1/5,n2/5,n3/5);
                System.out.println("Q"+i+".\t"+n1/5+",\t"+n2/5+",\t"+n3/5);
                ans2=input.nextDouble();
                if(ans1==ans2){
                    System.out.println("Correct");
                    cor++;
                }else{
                    System.out.println("Oops!! The correct ans is: "+ans1);
                    incor++;
                }i++;                                                               //L1S2 Ended

                //Using System.exit(0) to control the procession of the game

                if(cor>incor){
                    System.out.println("Bravo!! You conquered the noble stage\n");
                    System.out.println("-----------------------------------------");
                    System.out.println("Performance log\n\tCorrect:"+cor+"\n\tIncorrect:"+incor+"\nYou have accumulated "+cor*100/5+" points");
                    System.out.println("==========================================");
                    if(cor*100/5<60){
                        System.out.println("The key has been handed to you to open the next challenge.");
                    }else if(cor*100/5>60 && cor*100/5<=80){
                        System.out.println("Incredible smartness at display. Keep it up\n");
                    }else if(cor*100/5>80){
                        System.out.println("Have you ever been informed?\n There are only two of you genus left on planet earth!");
                    }
                }else{
                    System.out.println("Better luck next time Buddy!!");
                    System.exit(0);
                }
                System.out.println("----------------------------------------------------------");
                System.out.println("\nPress Y or y to accept or any other key to decline offer");
                go=input.next();
                if("Y".equals(go) || "y".equals(go)){
                }else{
                    System.exit(0);
                }
            }while(repeat2<3);

            //Section B
            int a=3;  double b=2;cor=1; incor=1;
            System.out.println("welcome to level 2 stage 1".toUpperCase());
            System.out.println("Multiply the numerals as they appear in the question and enter the ans.\nNB: Speed is key");
            multQuiz(a,b);
            System.out.println("Q" +i+ "\n\t" + (a) + "\t" + (b));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            multQuiz(a+8,b-a);
            System.out.println("Q" +i+ "\n\t" + (a+8) + "\t" + (b-a));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            multQuiz(a+7,b*0.25);
            System.out.println("Q" +i+ "\n\t" + (a+7) + "\t" + (b*.25));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            multQuiz(a^2,b*2);
            System.out.println("Q" +i+ "\n\t" + (a^2) + "\t" + (b*2));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            multQuiz(a*3,b+9);
            System.out.println("Q" +i+ "\n\t" + (a*3) + "\t" + (b+9));
            ans2=input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;

            //Using System.exit(0) to control the procession of the game

            if(cor>incor){
                System.out.println("Bravo!! You conquered the noble stage\n");
                System.out.println("-----------------------------------------");
                System.out.println("Performance log\n\tCorrect:"+cor+"\nIncorrect:"+incor+"\nYou have accumulated "+cor*100/5+" points");
                System.out.println("==========================================");
                if(cor*100/5<60){
                    System.out.println("The key has been handed to you to open the next challenge.");
                }else if(cor*100/5>60 && cor*100/5<=80){
                    System.out.println("Incredible smartness at display. Keep it up\n");
                }else if(cor*100/5>80){
                    System.out.println("Have you ever been informed?\n There are only two of you genus left on planet earth!");
                }
            }else{
                System.out.println("Better luck next time Buddy!!");
                System.exit(0);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("\nPress Y or y to accept or any other key to decline offer");
            go=input.next();
            if("Y".equals(go) || "y".equals(go)){
            }else{
                System.exit(0);
            }

            //Section C
            a=4; int c=10; cor=0; incor=0;
            System.out.println("\nwelcome to level 2 stage 2".toUpperCase());
            System.out.println("\nPerform the following operations as fast as possible.\nSpeed is treasure here.");
            System.out.println("\nHow many times can the second value be contained in the first?");
            divQuiz(a, c);
            System.out.println("Q"+i+"\t"+c+",  "+a);
            ans2 = input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            divQuiz(a+10,c*20);
            System.out.println("Q"+i+"\t"+c*20+",  "+(a+10));
            ans2 = input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            divQuiz(a,c-7);
            System.out.println("Q"+i+"\t"+(c-7)+",  "+a);
            ans2 = input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            divQuiz(a,c*3);
            System.out.println("Q"+i+"\t"+c*3+",  "+a);
            ans2 = input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;
            divQuiz(a+9,c-2);
            System.out.println("Q"+i+"\t"+(c-2)+",  "+(a+9));
            ans2 = input.nextDouble();
            if(ans1==ans2){
                System.out.println("Correct");
                cor++;
            }else{
                System.out.println("Oops!! The correct ans is: "+ans1);
                incor++;
            }i++;


            if(cor>incor){
                System.out.println("Bravo!! You conquered the noble stage\n");
                System.out.println("-----------------------------------------");
                System.out.println("Performance log\n\tCorrect:"+cor+"\n\tIncorrect:"+incor+"\nYou have accumulated "+cor*100/5+" points");
                System.out.println("==========================================");
                if(cor*100/5<60){
                    System.out.println("The key has been handed to you to open the next challenge.");
                }else if(cor*100/5>60 && cor*100/5<=80){
                    System.out.println("Incredible smartness at display. Keep it up\n");
                }else if(cor*100/5>80){
                    System.out.println("Have you ever been informed?\n There are only two of you genus left on planet earth!");
                }
            }else{
                System.out.println("Better luck next time Buddy!!");
                System.exit(0);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("\nPress Y or y to accept or any other key to decline offer");
            go=input.next();
            if("Y".equals(go) || "y".equals(go)){
            }else{
                System.exit(0);
            }
            System.out.println("Next Level yet to be released.\nCall 0206404992 for a paid Quizlet with pro features.");

            repeat++;
        }while(repeat<3);

        
}
}
    

