package javapatterns;

import java.util.Scanner;

public class JavaPatterns {
    static Scanner input = new Scanner(System.in);
    //method for rec
    private static void rectangle(int c, int r){
        m=c;n=r;
        System.out.println("Enter Column height in int");
        c=input.nextInt();
        System.out.println("Enter Row width in int");
        r=input.nextInt();
        
        for(int i=1; i<=c;i++){
            for(int k=1;k<=r;k++){
                System.out.print("k ");
            }
            System.out.println();
        }
    }
    static int m,n;
    
    //Method for creating triagular shape
    private static void triangle1(int m, int n){
        System.out.println("Enter Column height");
        m=input.nextInt();
//        System.out.println("Enter Row width");
//        n=input.nextInt();
        
        for(int i=1; i<=m; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    private static void triangle2(int m, int n){
        System.out.println("Enter Column height");
        m=input.nextInt();
//        System.out.println("Enter Row width");
//        n=input.nextInt();
        
        for(int i=1; i<=m; i++){
            for(int k=m; k>=i; k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void triangle3(int m, int n){
        System.out.println("Enter Column height");
        m=input.nextInt();
//        System.out.println("Enter Row width");
//        n=input.nextInt();
        
        for(int i=1; i<=m; i++){
            for(int k=m; k<=1; k--){
                System.out.print("k "+k);
            }
            System.out.println();
        }
    }
    private static void triangle4(int m, int n){
        System.out.println("Enter Column height");
        m=input.nextInt();
//        System.out.println("Enter Row width");
//        n=input.nextInt();
        
        for(int i=1; i<=m; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        triangle2(m,n);
    }
    
}
