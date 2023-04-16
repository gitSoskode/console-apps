package planefigurecal;

import static java.lang.Math.PI;
import java.util.Scanner;

public class PlaneFigureCal {
public static void rec(double l,double w){
        System.out.println("Input the width ");
        w=reader.nextDouble();
        System.out.println("Input the length");
        l=reader.nextDouble();
        System.out.println("1 Calculate the Area");
        System.out.println("2 Calculate the Perimeter");
        System.out.println("0 Cancel process");
        opt=reader.nextInt();
        if(opt==1){
            area=l*w;
            System.out.println("The area of the rectangle with length " +l+ "cm and width "+w+ "cm is "+area+"cm2");
            
        }else if(opt==2){
        
            peri=2*(l+w);
            System.out.println("The perimeter of the rectangle with length " +l+ "cm and width "+w+ "cm is "+peri+"cm");
        }else if(opt==0){
            System.out.println("Please subscribe to SosKode for more intriguing innovations");
            System.exit(0);
        }else{
            System.out.println("Invalid option, try again later");
            //System.exit(0);
        }
        To_quit();
        
        
    }
    public static double tri(double h, double b){
        System.out.println("Select query");
        System.out.println("1 Area");
        System.out.println("2 Perimeter");
        opt=reader.nextInt();
        if(opt==1){
            System.out.println("Enter base dimension");
            b=reader.nextDouble();
            System.out.println("Enter height dimension");
            h=reader.nextDouble();
            area=0.5*b*h;
            System.out.println("The area of th triangle is "+area+"cm2");
        }else if(opt==2){
            System.out.println("Enter first side dimension");
            l=reader.nextDouble();
            peri=l;
            System.out.println("Enter second side dimension");
            l=reader.nextDouble();
            peri=peri+l;
            System.out.println("Enter last side dimension");
            l=reader.nextDouble();
            peri=peri+l;
            
            System.out.println("The perimeter of the triangle is "+peri+"cm");
        }else{
            System.out.println("Invalid input");
            //System.exit(0);
        }
        To_quit();
        return 0;
    }
    public static double cir(double r){
        System.out.println("Select operation type to go");
        System.out.println("A   Area");
        System.out.println("P   Perimeter");
        choice=reader.next();
        switch(choice){
            case "a":
            case "A":
                System.out.println("Enter the radius");
                r=reader.nextDouble();
                System.out.println("The area of the circle with radius "+r+"cm is "+PI*r*r+"cm2");
                break;
            case "p":
            case "P":
                System.out.println("Enter the radius");
                r=reader.nextDouble();
                System.out.println("The perimeter of the circle with radius "+r+"cm is "+2*PI*r+"cm");
                break;
            default:
                System.out.println("Invalid input");
               // System.exit(0);
        }
        To_quit();
        return 0;
    }
    public static void cube(double l, double w, double h){
        System.out.println("Enter choice letter".toUpperCase());
        System.out.println("A  Surface area");
        System.out.println("V  Volume");
        choice=reader.next();
        if("A".equals(choice) || "a".equals(choice)){
            System.out.println("Enter length");
            l=reader.nextDouble();
            System.out.println("Enter width");
            w=reader.nextDouble();
            System.out.println("Enter height");
            h=reader.nextDouble();
            area=l*w*2+l*h*2+w*h*2;
            System.out.println("The total surface area of the cube or cuboid is "+area+"cm2");
        }else if("V".equals(choice) || "v".equals(choice)){
            System.out.println("Enter length");
            l=reader.nextDouble();
            System.out.println("Enter width");
            w=reader.nextDouble();
            System.out.println("Enter height");
            h=reader.nextDouble();
            vol=l*w*h;
            System.out.println("The volume of the cube/cuboid is "+vol+"cm3");
            
            
        }else{
            System.out.println("Invalid response");
            //System.exit(0);
        }
        To_quit();
    }
    public static void To_quit(){
        System.out.println("Do you want to continue to other plane figures\nPress 'Y' or 'y' to continue or any key to quit");
        choice=reader.next();
        if(choice.equals("y")){
        }else{
            System.exit(0);
        }
    }
    static Scanner reader = new Scanner(System.in);
    static double area, peri,vol, l,w,h,r,b;
    static String choice;
    static int opt, count=0,count1=0;
    public static void main(String[] args) {
        System.out.println("Welcome to the plane figure calculator");
        do{
        System.out.println("\nSelect your preferred plane figure to go");
        System.out.println("1. Rectangle\n2. Triangle\n3. Circle\n4. Cube/Cuboid");
        opt=reader.nextInt();
        if(opt==1){
            rec(l,w);
        }else if(opt==2){
            tri(l,w);
        }else if(opt==3){
            cir(r);
        }else if(opt==4){
            cube(l,w,h);
        }else{
            System.out.println("Invalid input "+(3-count1)+ " attempts remaining"+" \nplease try again");
            count1++;
            if(count1==3){
                System.exit(0);
            }
            continue;
        }
        count++;
        }while(count<3);
    }
}
