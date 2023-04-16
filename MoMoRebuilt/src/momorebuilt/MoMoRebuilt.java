package momorebuilt;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class MoMoRebuilt {
    //Methods to be called to action

    public void startMenu(){                 //OPENING MENU
        System.out.println("Menu\n 1) Transfer Money\n 2) MoMoPay & Pay Bill\n 3) Airtime & Bundles\n 4) Allow Cash Out\n 5) Financial Services\n 6) My Wallet");
        reply=reader.next();
    }
    public void mtnNumLength(){
        count=0;
        do{
            if(count==0){
            System.out.println("Enter mobile number");
            num1=reader.next();
            //count++;
            }
            if(true){
                System.out.println("Invalid Mobile Number, Please try again.");
                num1=reader.next();
                count+=1;
            }
            
            if(count==3 && true){
                System.out.println("The maximum number of allowed retries exceeded.");
                //break;
                System.exit(0);
            }
        }while(num1.length()!=10 || !(num1.substring(0,3).equals("024") || num1.substring(0,3).equals("059") || num1.substring(0,3).equals("055") ||num1.substring(0,3).equals("054") || num1.substring(0,3).equals("025") || num1.substring(0,3).equals("020")  || num1.substring(0,3).equals("050") || num1.substring(0,3).equals("026") || num1.substring(0,3).equals("056") || num1.substring(0,3).equals("027") || num1.substring(0,3).equals("057") || num1.substring(0,3).equals("023")) );
        
    }
    public void numConfirmer(){
        System.out.println("Enter Mobile Number to confirm");
        num2    = reader.next();
        if(num2.equals(num1)){
        }else{
           System.out.println("Number Mismatch"); 
           System.exit(0);
        }
    }
    public void transferMoney(){
        System.out.println("Transfer Money");
        System.out.println("1) MoMo User");
        System.out.println("2) Non MoMo User");
        System.out.println("3) Send with Care");
        System.out.println("4) Favorite");
        System.out.println("5) Other Networks");
        System.out.println("6) Bank Account");
        System.out.println("0) Back");

        reply=reader.next();
    }
    
    
    //Declare necessary variables
    private static String selfContact="233559708182",myName="Tiehisung Areez"; 
    private static String receiver="Abdullah Idres",ref,Secretcode="8888",pin="1234";
    private static String refID, reply, num1="",num2="",networkType; //ought to be static before effective access in here
    
    private static String maintenance="System under maintenance";
    private static String numMismatch="Number Mismatch";
    private static String insufficient1="Not enough balance for this transaction";
    private static String insufficient2="Not enough funds to perform this transaction.";
//    private static String maintenance="System under maintenance";
//    private static String maintenance="System under maintenance";
//    private static String maintenance="System under maintenance";

    private static double    initial_bal=12.43,  amount;
    private static int count;
    // Defining a Scanner
    private static Scanner reader = new Scanner(System.in);    //NB Scanner is non-static

    
    //THE MAIN METHOD ENVIRONMENT HERE
    public static void main(String[] args) {

        //Obj to hold non-static methods
        MoMoRebuilt momorebuilt = new MoMoRebuilt();
        count=0; int bck=0;
        do{
            momorebuilt.startMenu();                 //0.0    the first UI menu
            count++;
            
            if("1".equals(reply)){                  //1.0   Transfering to a 
                count=0;
                do{
                    momorebuilt.transferMoney();
                    count++;
                    if(reply.equals("0")){
                        bck=5;
                    }
//                    if(count>4){
//                        //System.exit(0);
//                        break;
//                    }
                    switch(reply){
                        case "0":
                            System.exit(0);
                            break;
                        case "1":
                            momorebuilt.mtnNumLength();
                            System.out.println("comfirm number");
                            num2=reader.next();

                            if(num1.equals(num2)){
                                System.out.println("Enter amount");
                                amount=reader.nextInt();

                                System.out.println("Enter Reference");
                                ref=reader.next();

                                if(amount>initial_bal){
                                    System.out.println("Not enough balance for this transaction");
                                    break;
                                }else{
                                    System.out.println("You try to transfer money to a non mobile money subscriber. Type 1 to continue and generate a Token voucher code\n1) Confirm");     //to be continued...
                                    reply=reader.next();
                                    if("1".equals(reply)){
                                        System.out.println("System under maintenance");
                                        break;
                                    }else{
                                        System.out.println("Invalid input.");
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Number Mismatch");
                                break;
                            }
                            
                        case "2":
                            System.out.println("Enter Receiver Name");
                            receiver=reader.next();

                            System.out.println("Enter Amount");
                            amount=reader.nextDouble();
                            if(amount>= initial_bal){
                                System.out.println(insufficient1);
                            }else if(amount<1){
                                count=1;
                                while(amount<1){
                                    System.out.println("Invalid amount, please try again.");
                                    Secretcode=reader.next();
                                    count+=1;
                                    if((count==3)){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        break;
                                    }
                                }
                            }
                            System.out.println("Enter Reference");
                            ref=reader.next();
                            break;
                        case "3":
                            count=0;
                            do{
                                System.out.println("Send with Care");
                                System.out.println("1) Mobile User\n2) My Family\n3) MyCaretaker\n4) AYO Send with Care Balances or Claim\n0) Back");
                                reply = reader.next();
                                
                                count++;
                                if(reply.equals("0")){
                                    count=4;
                                }
                                if(reply.equals("1")){
                                    momorebuilt.mtnNumLength();
                                    momorebuilt.numConfirmer();
                                }
                                else{
                                    break;
                                }
                                break;
                            }while(count<4);
                            
                            break;
                        case "4":
                            System.out.println("Favorite");
                            break;
                        case "5":
                            System.out.println("Other Networks");
                            break;
                        case "6":
                            System.out.println("Bank Account");
                            break;
                        default:
                        System.out.println("Invalid input entered.");
                    }
                }while(count<5 && bck<count);
                
            }else{
                System.out.println("invalid, try again.");
                count++;
                if(count==4){
                    System.exit(0);
                }
            }
        
        } while(count<5);  
        
        
        
    }
    
}
