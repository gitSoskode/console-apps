/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mtn.momo;

import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class MTNMomo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A program to emulate the mobile money platform for mtn telco
        Scanner read=new Scanner(System.in);
        System.out.println("Menu\n 1) Transfer Money\n 2) MoMoPay & Pay Bill\n 3) Airtime & Bundles\n 4) Allow Cash Out\n 5) Financial Services\n 6) My Wallet");
        String reply=read.next();
        
        //List some necessary variables
        double initial_bal=12.43; 
        
        int count;
        
        String num1="",num2="",receiver="Abdullah Idres",ref,Secretcode,pin="1234",myName="Tiehisung Areez";
        String refID,selfContact="233559708182",networkType; 
        String insufficient="Not enough funds to perform this transaction.";
        
        switch (reply) {
            case "1":
                System.out.println("Transfer Money");
                System.out.println("1) MoMo User");
                System.out.println("2) Non MoMo User");
                System.out.println("3) Send with Care");
                System.out.println("4) Favorite");
                System.out.println("5) Other Networks");
                System.out.println("6) Bank Account");
                System.out.println("0) Back");
                reply=read.next();
                
                double amount;
                switch(reply){
                    case "1":                       //mtn
                        System.out.println("Enter mobile number");
                        num1=read.next();
                        count=0;
                        do{
                            count+=1;
                            if(true){
                                System.out.println("Invalid Mobile Number, Please try again.");
                                num1=read.next();
                            }
                            if(count==3){
                                System.out.println("The maximum number of allowed retries exceeded.");
                                //break;
                                System.exit(0);
                            }
                        }while(num1.length()!=10 || !(num1.substring(0,3).equals("024") || num1.substring(0,3).equals("059") || num1.substring(0,3).equals("055") ||num1.substring(0,3).equals("054") || num1.substring(0,3).equals("025") || num1.substring(0,3).equals("020")  || num1.substring(0,3).equals("050") || num1.substring(0,3).equals("026") || num1.substring(0,3).equals("056") || num1.substring(0,3).equals("027") || num1.substring(0,3).equals("057") || num1.substring(0,3).equals("023")));
                        
                        System.out.println("comfirm number");
                        num2=read.next();
                        
                        if(num1.equals(num2) && (num2.substring(0,3).equals("024") || num2.substring(0,3).equals("059") || num2.substring(0,3).equals("055") ||num2.substring(0,3).equals("054") || num2.substring(0,3).equals("025"))){
                            System.out.println("Enter amount");
                            amount=read.nextInt();
                            System.out.println("Enter Reference");
                            ref=read.next();
                            if(amount>=initial_bal){
                                System.out.println("Not enough balance for this transaction");
                                break;
                            }else{
                                System.out.println("System under maintenance");     //to be continued...
                                System.exit(0);
                            }
                        }else if(num1.equals(num2) &&  num1.substring(0,3).equals("020")  || num1.substring(0,3).equals("050") || num1.substring(0,3).equals("026") || num1.substring(0,3).equals("056") || num1.substring(0,3).equals("027") || num1.substring(0,3).equals("057") || num1.substring(0,3).equals("023")){
                            System.out.println("You try to transfer money to a non mobile money subscriber. Type 1 to continue and generate a Token voucher code\n1) Confirm");     //to be continued...
                            reply=read.next();
                            if("1".equals(reply)){
                                System.out.println("System under maintenance");
                                System.exit(0);
                                break;
                            }else{
                                System.out.println("Invalid input.");
                                break;
                            }
                        }else{
                            System.out.println("Number Mismatch");
                            System.exit(0);
                            break;
                        }
                    case "2":                       //non momo user
                        System.out.println("Enter Receiver Name");
                        receiver=read.next();
                        System.out.println("Enter Amount");
                        amount=read.nextDouble();
                        System.out.println("Enter Reference");
                        ref=read.next();
                        System.out.println("Enter Secret Code");
                        Secretcode=read.next();
                        count=1;
                        while(!Secretcode.equals(pin)){
                            System.out.println("Invalid Secret code, please try again.");
                            Secretcode=read.next();
                            count+=1;
                            if((count==3)){
                                System.out.println("The maximum amount of allowed retries has been exceeded.");
                                break;
                            }
                        }
                    case "3":               //Send with Care
                        System.out.println("System under maintenance, please try again later.");
                        break;
                    case "4":               //Favorite
                        System.out.println("System under maintenance, please try again later.");
                        break;
                    case "5":               //Other networks
                        System.out.println("Transfer Money to Other Network");
                        System.out.println("1) AirtelTigo");
                        System.out.println("2) Vodadone");
                        System.out.println("3) E-zwich");
                        System.out.println("4) G-Money");
                        System.out.println("5) Zeepay");
                        System.out.println("0) Back");
                        reply=read.next();
                        
                        
                        // For AirtelTigo Number momo
                        if("1".equals(reply)){           
                            System.out.println("Enter mobile number");
                            num1=read.next();
                            
                            if(num1.length()==10 && ("026".equals(num1.substring(0,3)))|| ("056".equals(num1.substring(0,3)))||("027".equals(num1.substring(0,3))) || ("057".equals(num1.substring(0,3)))){
                                System.out.println("Comfirm mobile number");
                                num2=read.next();
                            }else{
                                System.out.println("Invalid number");
                                break;
                            }
                            if(num1.equals(num2)){
                                System.out.println("Enter Amount to Transfer");
                                amount=read.nextDouble();
                            }else{
                                System.out.println("Number Mismatch!");
                                break;
                            }
                            System.out.println("Enter Reference ID");
                            refID=read.next();
                            
                            if(!"neutral".equals(refID)){
                                System.out.println("Name Enquiry failed with error: Invalid Receiver Number");
                                break;
                            }
                            if("neutral".equals(refID)){
                                System.out.println("System under maintenance, try again in a few hours.");
                                break;
                            }
                            
                            
                            //For Vodafone Number momo
                        }else if("2".equals(reply)){
                            System.out.println("Enter Mobile Number");
                            num1=read.next();
                            if(num1.length()==1 && ("020".equals(num1.substring(0,3)) || "050".equals(num1.substring(0,3)))){
                                System.out.println("Comfirm Mobile Number");
                                num2=read.next();
                            }
                            if(num1.equals(num2)){
                                System.out.println("Enter Amount");
                                amount=read.nextDouble();
                                count=1;
                                while(amount<=0 ){
                                    System.out.println("Invalid Amount, Please try again.");
                                    amount=read.nextDouble();
                                    count=count+1;
                                    if(count==3){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        break;
                                    }
                                }
                                
                                if(amount>=initial_bal){
                                    System.out.println("Not enough funds to perform this transaction.");
                                    break;
                                }
                                else{
                                    System.out.println("Enter Reference ID");
                                    refID=read.next();
                                    System.out.println("System under maintenance, please try again later.");
                                    break;
                                }
                            }else{
                                break;
                            }
                            
                        }
                            // E-zwich momo
                        else if("3".equals(reply)){
                            System.out.println("Enter E-zwich card number");
                            num1=read.next();
                            System.out.println("Comfirm E-zwich card number");
                            num2=read.next();
                            
                            System.out.println("Enter Amount To Transfer");
                            amount=read.nextDouble();
                            
                            System.out.println("Enter Reference ID");
                            refID=read.next();
                            if(!num1.equals(num2)){
                                System.out.println("Original and comfirmed account number is not matching.");
                                break;
                            } 
                            if(num1.equals(num2) && amount>0 && amount<initial_bal-1){
                                System.out.println("System under maintenance.");
                                break;
                            }
                            else{
                                count=1;
                                while(amount>0 || amount<initial_bal-1){
                                    System.out.println("Invalid amount, please try again.");
                                    amount=read.nextByte();
                                    count+=1;
                                    if(count==3){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        break;
                                    }
                                }
                            }
                            //G-Money momo
                        }else if("4".equals(reply)){
                            System.out.println("Enter Mobile Number");
                            num1=read.next();
                            if(num1.length()==1 && ("020".equals(num1.substring(0,3)) || "050".equals(num1.substring(0,3)))){
                                System.out.println("Comfirm Mobile Number");
                                num2=read.next();
                            }
                            if(num1.equals(num2)){
                                System.out.println("Enter Amount");
                                amount=read.nextDouble();
                                count=1;
                                while(amount<=0 ){
                                    System.out.println("Invalid Amount, Please try again.");
                                    amount=read.nextDouble();
                                    count=count+1;
                                    if(count==3){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        break;
                                    }
                                }
                                
                                if(amount>=initial_bal){
                                    System.out.println("Not enough funds to perform this transaction.");
                                    break;
                                }
                                else{
                                    System.out.println("Enter Reference ID");
                                    refID=read.next();
                                    System.out.println("System under maintenance, please try again later.");
                                    break;
                                }
                            }
                        }
                            // Zeepay momo
                        else if("5".equals(reply)){
                            System.out.println("Enter Mobile Number");
                            num1=read.next();
                            if(num1.length()==1 && ("020".equals(num1.substring(0,3)) || "050".equals(num1.substring(0,3)))){
                                System.out.println("Comfirm Mobile Number");
                                num2=read.next();
                            }
                            if(num1.equals(num2)){
                                System.out.println("Enter Amount");
                                amount=read.nextDouble();
                                count=1;
                                while(amount<=0 ){
                                    System.out.println("Invalid Amount, Please try again.");
                                    amount=read.nextDouble();
                                    count=count+1;
                                    if(count==3){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        break;
                                    }
                                }
                                
                                if(amount>=initial_bal){
                                    System.out.println("Not enough funds to perform this transaction.");
                                    break;
                                }
                                else{
                                    System.out.println("Enter Reference ID");
                                    refID=read.next();
                                    System.out.println("System under maintenance, please try again later.");
                                    break;
                                }
                            }
                        }
                            //Back momo
                        else if("0".equals(reply)){
                            System.out.println("Under development");break;
                        }else{
                            break;
                        }
                        break;
                        //Banks transfer
                    case "6":
                        System.out.println("GHIPSS Banks transfer service");
                        System.out.println("1) Wallet to Bank Account");
                        System.out.println("0) Back");
                        reply =read.next();
                        if("1".equals(reply)){
                            System.out.println("Please select the Bank");
                            System.out.println("1) STANCHART");
                            System.out.println("2) ABSA");
                            System.out.println("3) GCB");
                            System.out.println("4) FIDELITY");
                            System.out.println("5) ADB");
                            System.out.println("6) UMB");
                            System.out.println("7) REPUBLIC");
                            System.out.println("8) ZENITH");
                            System.out.println("9) ECOBANK");
                            System.out.println("10) CAL");
                            System.out.println("11) PRUDENTIAL");
                            System.out.println("12) ");
                            System.out.println("# for next");
                            reply=read.next();
                            switch(reply){          //STANCHART
                                case "1":   
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "2":           //ABSA     
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                            case "3":               //GCB
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "4":           //FIDELITY
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "5":           //ADB
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "6":           //UMB
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "7":           //REPUBLIC
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "8":           //ZENITH
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "9":           //ECOBANK
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "10":          //CAL
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "11":          //PRUDENTIAL
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                        break;
                                    }
                                case "12":
                                    System.out.println("Enter Bank Account number");
                                    num1=read.next();
                                    System.out.println("confirm Bank Account number");
                                    num2=read.next();
                                    System.out.println("Enter Amount to Transfer");
                                    amount=read.nextDouble();
                                    System.out.println("Enter Reference");
                                    refID=read.next();
                                    if(!num1.equals(num2)){
                                        System.out.println("Original and confirmed account number is not matching.");
                                        break;
                                    }else{
                                        System.out.println("System under maintenance.");    //To be continued
                                    break;
                                    }
                                case "#":           //for next
                                    System.out.println("13) GT");
                                    System.out.println("14) UBA");
                                    System.out.println("15) ACCESS");
                                    System.out.println("16) CBG");
                                    System.out.println("17) FIRST NAT. BANK");
                                    System.out.println("18) NIB");
                                    System.out.println("19) BANK OF AFRICA");
                                    System.out.println("20) FBN BANK");
                                    System.out.println("21) BSIC");
                                    System.out.println("22) SERVICES INTEGRITY");
                                    System.out.println("# for next");
                                    reply=read.next();
                                    switch(reply){
                                        case "13":          //GT
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "14":          //UBA
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "15":          //ACCESS
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "16":          //CBG
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "17":          //FIRST NAT. BANK
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "18":          //NIB
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "19":          //BANK OF AFRICA
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "20":          //FBN BANK
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "21":          //BSIC
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "22":          //SERVICES INTEGRITY
                                            System.out.println("Enter Bank Account number");
                                            num1=read.next();
                                            System.out.println("confirm Bank Account number");
                                            num2=read.next();
                                            System.out.println("Enter Amount to Transfer");
                                            amount=read.nextDouble();
                                            System.out.println("Enter Reference");
                                            refID=read.next();
                                            if(!num1.equals(num2)){
                                                System.out.println("Original and confirmed account number is not matching.");
                                                break;
                                            }else{
                                                System.out.println("System under maintenance.");    //To be continued
                                            break;
                                            }
                                        case "#":
                                            break;          //under development
                                        default:
                                            break;                 
                                    }
                            } 
                        }else if("0".equals(reply)) {
                             break; //Back under development

                        }
                    case "0":
                        break;   //Back under development
                    default:
                        break;  
                }
            case "2":
                System.out.println("MoMoPay & Pay Bill");
                System.out.println("1) MoMoPay");
                System.out.println("2) PayBill");
                System.out.println("3) GhQR");
                System.out.println("0) Back");
                
                reply=read.next();
                break;
            case "3":
                System.out.println("Airtime & Bundles");
                System.out.println("1) Airtime");
                System.out.println("2) Internet Bundles");
                System.out.println("3) Fixed Broadband");
                System.out.println("4) Schedule Airtime");
                System.out.println("0) Back");
                reply = read.next();
                if("1".equals(reply)){
                    System.out.println("Airtime");
                    System.out.println("1) Self");
                    System.out.println("2) Others");
                    System.out.println("3) Welcome Pack");
                    System.out.println("4) Other Networks");
                    System.out.println("0) Back");
                    reply = read.next();
                    if("1".equals(reply)){              //Airtime for Self              reply 1
                        System.out.println("Enter Amount");
                        amount=read.nextDouble();
                        count=1;
                        if(!(amount<=initial_bal && amount>0.1)){
                            while (true) {
                                if (amount<=0.1) {
                                    System.out.println("Invalid Amount. Please try again.");
                                    amount=read.nextDouble();
                                    count++;
                                }if (count==3) {
                                    System.out.println("Maximum number of allowed retries exceeded.");
                                    break;
                                }if (amount>initial_bal) {
                                    System.out.println(insufficient);
                                    break;
                                }
                            }
                        }else{
                            System.out.println("Dear "+receiver+", Send GHS "+amount+" AirtimeSelf to "+selfContact+". \nFee is GHS 0.00. Enter MM PIN or 2 to cancel.");
                            pin=read.next();
                            if("1234".equals(pin)){
                                System.out.println("Your payment of GHS "+amount+" to MTN AIRTIME has been completed.\nYour new balance: GHS "+String.format("%.2f",(initial_bal-amount))+" Fee was GHS 0.00");
                            }else if ("2".equals(pin)) {
                                break;
                            }else if (pin.length()!=4) {
                                count=1;
                                while (true) {
                                    System.out.println("Invalid PIN code length. Enter 4 digit PIN.");
                                    pin=read.next();
                                    count++;
                                    
                                    if (count==3) {
                                    System.out.println("Maximum number of allowed retries exceeded.");
                                    break;
                                    }
                                }
                                
                            }
                        }
                        
                    }else if ("2".equals(reply)) {       // Airtime for other mtn        reply 2
                        System.out.println("Enter Amount");
                        amount=read.nextDouble();

                        if (amount<0.5 || amount>500) {         //Verifying amount validity
                            count=1;
                           while (true) {
                            System.out.println("Invalid amount. Please try again.");
                            amount=read.nextDouble();
                            count+=1;
                                if(count==3){                   //Chances exhuasted for amount input
                                    System.out.println("The maximum amount of allowed retries has been exceeded.");
                                    break;
                                }
                            } 
                        }else if(amount>initial_bal){
                            System.out.println("Not enough funds to perform this transaction.");
                            break;
                        }
                        else{   
                            System.out.println("Enter Mobile Number");
                            num1=read.next();                                                       //Test of number viability: MTN has 024,025,055,054,059
                            if (!("054".equals(num1.substring(0,3)) || "024".equals(num1.substring(0,3))|| "059".equals(num1.substring(0,3)) || "055".equals(num1.substring(0,3)) || "025".equals(num1.substring(0,3)) && num1.length()==10)) {
                                count=1;
                                while(!("054".equals(num1.substring(0,3)) || "024".equals(num1.substring(0,3))|| "059".equals(num1.substring(0,3)) || "055".equals(num1.substring(0,3)) || "025".equals(num1.substring(0,3)) && num1.length()==10)){
                                    System.out.println("Invalid Mobile Number. Please Enter Mobile Number again.");
                                    num1=read.next();
                                    count++;
                                    if(count==3 && !("054".equals(num1.substring(0,3)) || "024".equals(num1.substring(0,3))|| "059".equals(num1.substring(0,3)) || "055".equals(num1.substring(0,3)) || "025".equals(num1.substring(0,3)) && num1.length()==10) ){
                                        System.out.println("The maximum amount of sallowed retries has been exceeded.");
                                        break;
                                    }
                                }
                            }
                                                                            //Allows user to preview transaction
                                System.out.println("Dear "+receiver+", Send GHS "+amount+" Airtime to "+num1+". \nFee is GHS 0.00. Enter MM PIN or 2 to cancel.");
                                pin=read.next();                            //Reading PIN

                                if("1234".equals(pin)){                     //Verifying PIN 
                                    System.out.println("Your payment of GHS "+amount+" to MTN AIRTIME has been completed.\n Your new balance: GHS "+(initial_bal-amount)+" Fee was GHS 0.00");
                                }else if (pin.length()!=4 || !("2".equals(pin))) {
                                    count=1;
                                    while (true) {
                                        System.out.println("Invalid PIN code length. Enter 4 digit PIN.");
                                        pin=read.next();
                                        count++;
                                        
                                        if (count==3) {
                                        System.out.println("Maximum number of allowed retries exceeded.");
                                        break;
                                        }
                                    }
                                    
                                }
                                else if ("2".equals(pin)) {                //Oddity checking
                                    System.out.println("Cancel successful.");
                                    break;
                                }
                            
                        }
                        
                    }else if ("3".equals(reply)) {       //Airtime Welcome Pack          reply 3
                        System.out.println("1) Buy Airtime - Welcome Pack");
                        System.out.println("2) Check Bonus Account");
                        System.out.println("0) Back");
                        reply = read.next();

                        if("1".equals(reply)){
                            /*System.out.println("Enter Amount");
                            amount=read.nextDouble();
                            count=1;

                            if ((amount>initial_bal)) {             //Amount to buy must not be greater than balance in account
                                System.out.println(insufficient);
                                break;
                            }
                           
                            if(((amount<0.1 || amount>500) && count<3)){    //Checking possible out-of-range acceptable amount
                                System.out.println("Invalid Amount, Please try again.");
                                amount = read.nextDouble();
                                count++;
                            }
                            if(((amount<0.1 || amount>500) && count<3)){        // Allowing for another retry
                                System.out.println("Invalid Amount, Please try again.");
                                amount = read.nextDouble();
                                count++;
                            }
                            if(((amount<0.1 || amount>500) && count==3)){       //Last possible retry
                                break;
                            }
                            if(((amount>=0.1 || amount<=500) && count<=3)){     //Incase positive during retries
                                System.out.println("Dear "+receiver+", Send ");
                            }*/
                            System.out.println("Dear "+myName+", Send 2 AirtimeSelf to "+selfContact+". To confirm enter MM PIN code.");
                            pin = read.next();
                            count=1;
                            if(!"1234".equals(pin)){
                                System.out.println("Invalid PIN, please try again");
                                pin=read.next();
                                count+=1;
                            }
                            if(!"1234".equals(pin) && count<3){
                                System.out.println("Invalid PIN, please try again");
                                pin=read.next();
                                count+=1;
                            }
                            if(!"1234".equals(pin) && count==3){
                                System.out.println("Maximum allowed retries exceeded.");
                                break;
                            }
                            if("1234".equals(pin) && count<=3){
                                System.out.println("Congratulations! You have received ...Under development");
                                break;
                            }
                        }else if ("2".equals(reply)) {
                            System.out.println("Enter PIN");
                            pin = read.next();
                            count=1;
                            if(!"1234".equals(pin)){        //PIN times control
                                while(!"1234".equals(pin)){
                                    System.out.println("Invalid PIN, please try again.");
                                    pin = read.next();
                                    count++;
                                    if(!"1234".equals(pin) && count<3){
                                        System.out.println("Invalid PIN, please try again.");
                                        pin = read.next();
                                    count++;
                                    }else if (!"1234".equals(pin) && count==3) {
                                        System.out.println("Maximum allowed retries exceeded.");
                                        break;
                                    }
                                }
                            }
                            System.out.println("Your Bonus balance is GHS 0.00");
                            break;
                        }
                    }else if ("4".equals(reply)) {       //AIRTIME FOR OTHER NETWORKS    REPLY 4
                    
                            System.out.println("Enter recipient phone number");
                            num1 = read.next();
                            networkType=num1.substring(0,3);
                            
                        if("024".equals(networkType)||"025".equals(networkType)||"054".equals(networkType)||"055".equals(networkType)||"059".equals(networkType)){
                            System.out.println("Buying MTN airtime is not supported on this menu");
                            count=2;
                            break;
                        }else{ 
                            do {
                            
                                count=1;


                                if(!(num1.length()==10 && ("020".equals(num1.substring(0,3)) ||"023".equals(num1.substring(0,3)) || "050".equals(num1.substring(0,3)) || "057".equals(num1.substring(0,3)) || "027".equals(num1.substring(0,3)) || "056".equals(num1.substring(0,3)) || "026".equals(num1.substring(0,3))))){
                                    System.out.println("Invalid number, please enter number again.");
                                    num1 = read.next();
                                    count++;
                                }
                                if(count==3){
                                    System.out.println("Maximum number of allowed retries exceeded.");
                                    break;
                                }
                            } while (!(num1.length()==10 && ("020".equals(num1.substring(0,3)) ||"023".equals(num1.substring(0,3)) || "050".equals(num1.substring(0,3)) || "057".equals(num1.substring(0,3)) || "027".equals(num1.substring(0,3)) || "056".equals(num1.substring(0,3)) || "026".equals(num1.substring(0,3)) || "059".equals(num1.substring(0,3)) || "055".equals(num1.substring(0,3)) || "054".equals(num1.substring(0,3)) || "025".equals(num1.substring(0,3)) || "024".equals(num1.substring(0,3)))));
                        
                        }
                                //confirm other mobile number
                        System.out.println("Re-enter recipient phone number");
                        num2=read.next();
                        if(!num1.equals(num2)){
                            System.out.println("Number Mismatch");
                            break;
                        }
                        
                        //Accepting amount
                        //amount=0;
                        System.out.println("Enter amount(GHS) minimum: 0.2, maximum: 500.00");
                        amount = read.nextDouble();
                        count=1;
                        
                        if(amount>initial_bal){
                            System.out.println(insufficient);
                            break;
                        }else if(!(amount>=0.2 || amount<=500)){
                            while(!(amount>=0.2 || amount<=500)){
                                System.out.println("The amount you have entered is less than or greater than allowed amount.\\nEnter amount(GHS) minimum: 0.20, maximum: 500.00");
                                amount = read.nextDouble();
                                count++;
                                
                                if(count==3){
                                    System.out.println("Maximum number of allowed retries exceeded.");
                                    break;
                                }
                            }
                        }
                        
                        
                                //Verifying ISP type
                        networkType=num2.substring(0,3);
                        switch(networkType){
                            case "020":
                            case "050":
                                    networkType="Vodafone";
                                    break;
                            case "026":
                            case "027":
                            case "056":
                            case "057":
                                networkType = "AirtelTigo";
                                break;
                            case "023":
                                networkType = "Glo GH";
                                break;
                            default:
                                break;
                        }
                        
                        System.out.println("You are sending GHS "+amount+" airtime to this "+networkType+" number: "+num2+".");
                        System.out.println("Reply 1 to confirm or 0 to start again");
                        reply =read.next();
                        //To further or decline purchase
                        if("1".equals(reply)){
                            System.out.println("Airtime purchased for other networks cannot be reversed 1. Proceed 2. Cancel");
                            reply = read.next();
                            if("1".equals(reply)){
                                System.out.println("Your request to send airtime to "+num2+" is being processed.");
                                System.out.println("You will soon receive payment prompt. If prompt delays, dial *170# to approve.");
                                System.out.println("");
                                
                                
                                do{
                                    System.out.println("Authorize payment of "+amount+" from your account to Other_Networks for Airtime Purchase Service. Enter MM PIN to continue.");
                                    pin = read.next();
                                    count=1;
                                    if(!"1234".equals(pin)){
                                        System.out.println("Invalid PIN, please try again");
                                        pin = read.next();
                                        count = count +1;
                                    }if(pin.length()!=4){
                                        System.out.println("PIN must have a length of 4-digits, please retry.");
                                        pin = read.next();
                                        count++;
                                    }
                                    if(count==3){
                                        System.out.println("Maximum number of allowed retries exceeded.");
                                        break;
                                    }
                                }while(!"1234".equals(pin));
                            
                                
                                
                                System.out.println("Do you want to approve the transaction -");
                                System.out.println("1) Yes");
                                System.out.println("2) No");
                                reply = read.next();
                                
                                if("1".equals(reply)){
                                    System.out.println("Payment of "+amount+" has been made successfully.");
                                    System.out.println("Current Balance:"+String.format("%.02f",(initial_bal-amount))+",Available Balance: GHS "+initial_bal+".");
                                    System.out.println("---------");
                                    break;
                                }else if("2".equals(reply)){
                                    break;
                                }
                            }else if("2".equals(reply)){
                                break;
                            }
                        }else if("0".equals(reply)){        //Requesting to restart process
                            System.out.println("Process under development");
                            break;
                        }else{
                            System.out.println("Invalid entry, please try again.");
                            break;
                        }
                    }
                }    
                break;
                
                
            case "4":       //==>To allow cash out                                  PS==>pilot successful
                System.out.println("Allow Cash Out");
                System.out.println("1) Yes");
                System.out.println("2) No");
                System.out.println("0) Back");
                reply = read.next();

                count=1;

                while(!("1".equals(reply) || "2".equals(reply) || "0".equals(reply))){



                    System.out.println("Incorrect choice, try again.");
                    System.out.println("Allow Cash Out");
                    System.out.println("1) Yes");
                    System.out.println("2) No");
                    System.out.println("0) Back");
                    reply = read.next();
                    count=count+1;

                    if(!("1".equals(reply) || "2".equals(reply) || "0".equals(reply)) && count==3){
                        System.out.println("Maximum number of allowed retries exceeded.");
                        break;
                    }
                }    
                if("1".equals(reply)){
                    System.out.println("Cash out is Allowed");

                }else if("2".equals(reply)){
                    System.out.println("Cash out is not Allowed");

                }else if("0".equals(reply)){
                    System.out.println("Process under development");
                }
                    
                break;
            case "5":
                System.out.println("Financial Services");
                System.out.println("1) Bank Services");
                System.out.println("2) Savings");
                System.out.println("3) Loans");
                System.out.println("4) Pensions and Investments");
                System.out.println("5) Insurance");
                System.out.println("6) Trade Shares");
                System.out.println("0) Back");
                
                reply=read.next();
                break;
            case "6":
                System.out.println("My Wallet");
                System.out.println("1) Check Balance");
                System.out.println("2) Allow Cash Out");
                System.out.println("3) My Approvals");
                System.out.println("4) Report Fraud");
                System.out.println("5) Statements");
                System.out.println("6) Change & Reset PIN");
                System.out.println("7) Airtime");
                System.out.println("# for next");
                
                reply=read.next();
                break;
            default:
            System.out.println("ho");
                break;
        }
    
    }
}
