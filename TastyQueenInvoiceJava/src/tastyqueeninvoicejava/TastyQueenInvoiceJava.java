
package tastyqueeninvoicejava;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class TastyQueenInvoiceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        String date="13/04/2022",reply;
        int timeH=11,timeM=23,timeS=13;
        
        System.out.println("\t   Tasty queen".toUpperCase());
        System.out.println("        adj police station".toUpperCase());
        System.out.println("         tanoso - kumasi".toUpperCase());
        System.out.println("         tin-p00047523232".toUpperCase());
        System.out.println("+233562939532\t-\t+233258391153");
        System.out.println("-----------------------------------");
        
        //displaying time and date summary
        //System.out.println(date + String.valueOf(timeH)+String.valueOf(timeM)+String.valueOf(timeS));
        System.out.println(date+"\t\t" + timeH+":"+timeM+":"+timeS);
        
        //Cashier UI questionaire  //Using a loop for menu choices
        //Set constants for items price
        final double unitPriceFR1=15,   unitPriceFR2=20,    unitPriceFR3=25,     unitPriceFR4=30;
        //Setting price for Jollof rice constants
        
        final double unitPriceJR1=10,   unitPriceJR2=15,    unitPriceJR3=20,     unitPriceJR4=25;
        //Setting price for Plain rice constants
        final double unitPricePR1=8,    unitPricePR2=12,    unitPricePR3=15,     unitPricePR4=20;
        //Setting price for Pizza constants
        final double unitPricePz1=45,   unitPricePz2=55,    unitPricePz3=65,     unitPricePz4=75;

        String itemTag1="", itemTag2, itemTag3, itemTag4;
        int flagFr, flagJr, flagPr, flagPz, Qntty=0;
        int    countFr, countJr, countPr, countPz,count;
        double totalFR1=0,totalFR2=0, totalFR3=0, totalFR4=0;
        double totalJR1=0,totalJR2=0, totalJR3=0, totalJR4=0;
        double totalPR=0,totalPR2=0, totalPR3=0, totalPR4=0;
        double totalPz=0,totalPz2=0, totalPz3=0, totalPz4=0;
        
        count=1;
        System.out.println("Menu\t\t\t\t"+count);
        System.out.println(" 1. Fried Rice");
        System.out.println(" 2. Jollof Rice");
        System.out.println(" 3. Plain Rice");
        System.out.println(" 4. Pizza");
        System.out.println(" 0. Decline");
        reply = reader.next();
        
        
        while(!"0".equals(reply) && count<=4){
            count++;
            System.out.println("Next Item Order\t\t"+count);
            System.out.println(" 1. Fried Rice");
            System.out.println(" 2. Jollof Rice");
            System.out.println(" 3. Plain Rice");
            System.out.println(" 4. Pizza");
            System.out.println(" 0. Decline");
            reply = reader.next();
            
            if(count==4){
                System.out.println("Please you may rejoin the queue for more purchase. \nThank You for your understanding.");
                break;
            }
            switch(reply){
                case "1":
                    System.out.println("Packages Available");
                    System.out.println("1. GHS 15.00");
                    System.out.println("2. GHS 20.00");
                    System.out.println("3. GHS 25.00");
                    System.out.println("4. GHS 30.00");
                    System.out.println("0. Decline Fried Rice Purchase");
                    reply   = reader.next();
                    
                    if("1".equals(reply)){      //First Fried rice pack
                        itemTag1="Fried Rice @GHS"+(int)unitPriceFR1;
                        System.out.println("Fried Rice @GHS"+(int)unitPriceFR1+" How many?");
                        Qntty   = reader.nextInt();
                        totalFR1=Qntty*unitPriceFR1;
                        System.out.println("Do you need Fried rice package @GHS"+(int)unitPriceFR2);
                        System.out.println("Y. Yes");
                        System.out.println("N. No");
                        reply=reader.next();
                        
                        if("Y".equals(reply) || "y".equals(reply)){ //Second Fried rice pack
                            itemTag2="Fried Rice @GHS"+(int)unitPriceFR2;
                            System.out.println("Fried Rice @GHS"+(int)unitPriceFR2+" How many?");
                            Qntty   = reader.nextInt();
                            totalFR2=Qntty*unitPriceFR2;
                            
                            System.out.println("Do you need Fried rice package @GHS"+(int)unitPriceFR3);
                            System.out.println("Y. Yes");
                            System.out.println("N. No");
                            reply=reader.next();
                            
                            if("Y".equals(reply) || "y".equals(reply)){ //Third fried rice pack
                                itemTag3="Fried Rice @GHS"+(int)unitPriceFR3;
                                System.out.println("Fried Rice @GHS"+(int)unitPriceFR3+" How many?");
                                Qntty   = reader.nextInt();
                                totalFR3=Qntty*unitPriceFR3;

                                System.out.println("Do you need Fried rice package @GHS"+(int)unitPriceFR4);
                                System.out.println("Y. Yes");
                                System.out.println("N. No");
                                reply=reader.next();
                                
                                if("Y".equals(reply) || "y".equals(reply)){ //fourth fried rice pack
                                    itemTag4="Fried Rice @GHS"+(int)unitPriceFR4;
                                    System.out.println("Fried Rice @GHS"+(int)unitPriceFR4+" How many?");
                                    Qntty   = reader.nextInt();
                                    totalFR4=Qntty*unitPriceFR4;

                                }else {
                                    break;
                                }
                                
                            }else {
                                break;
                            }
                            
                        }else {
                            break;
                        }
                    }
                    
                    
            }
        }
        System.out.println(totalFR1+"\t"+itemTag1+"\t"+Qntty);
    }
}
    

