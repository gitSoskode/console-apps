/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grp;

import java.util.Scanner;

public class Grp {
    public void startMenu(){                 //OPENING MENU
        System.out.println("Menu\n 1) Transfer Money\n 2) MoMoPay & Pay Bill\n 3) Airtime & Bundles\n 4) Allow Cash Out\n 5) Financial Services\n 6) My Wallet");
        reply=read.next();
    }
    private void transfer(){                //  1.0
       
        int bck2=0,bck1=0;
        do{
            System.out.println("Transfer Money");
            System.out.println("1) MoMo User");
            System.out.println("2) Non MoMo User");
            System.out.println("3) Send with Care");
            System.out.println("4) Favorite");
            System.out.println("5) Other Networks");
            System.out.println("6) Bank Account");
            System.out.println("0) Back");
            reply=read.next();

            OUTER_1:
            switch (reply) {
                case "1":                       //mtn
                    mtnNumLength();
                    System.out.println("comfirm number");
                    num2=read.next();
                    //  Testing for MTN num
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
                        //Testing for other networks
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
                    grp.SecreteCodeConfirmer();                                 /*Calling...*/  
                    if(!pin1.equals(pin2)){
                        System.out.println("Secret code Mismatch");
                        System.exit(0);
                    }else{
                        System.out.println(maintenance);
                        System.exit(0);
                    }
                case "3":               //Send with Care
                    bck2=1;
                    do{
                        System.out.println("Send with Care\n1)Mobile User\n2)My Family\n3)MyCaretaker\n3)AYO Send with Care Balances or Claim\n0)Back\n");
                        reply =read.next();
                        OUTER:
                        switch (reply) {
                            case "0":
                                bck1++;
                                bck2+=4;
                                break;
                            case "1":
                                System.out.println("Please enter recipient's mobile number\n");
                                num1 = read.next();
                                count=1;
                                if((num1.length()==10 &&  (num1.substring(0,3).equals("024") || num1.substring(0,3).equals("059") || num1.substring(0,3).equals("055") ||num1.substring(0,3).equals("054") || num1.substring(0,3).equals("025") || num1.substring(0,3).equals("020")  || num1.substring(0,3).equals("050") || num1.substring(0,3).equals("026") || num1.substring(0,3).equals("056") || num1.substring(0,3).equals("027") || num1.substring(0,3).equals("057") || num1.substring(0,3).equals("023")))){
                                    System.out.println("Please repeat recipient's mobile number");
                                    num2=read.next();
                                    if(num2.equals(num1)){
                                        System.out.println("AccountHolder not found");
                                        System.exit(0);
                                    }
                                }else{
                                    while(count<4){
                                        System.out.println("Invalid Mobile Number, Please try again.");
                                        num1=read.next();
                                        count++;
                                    }
                                    System.out.println("Maximum amount of allowed retries exceeded.");
                                    System.exit(0);
                                }
                                break;
                            case "2":
                                System.out.println("My Family\n1)Lookup Number\n2)View Family Number\n3)Manage Family\n0)Back\n");
                                reply= read.next();
                                switch (reply) {
                                    case "1":
                                        System.out.println("Enter Number of My Family");
                                        num1=read.next();
                                        System.out.println("No contact found");
                                        System.exit(0);
                                    case "2":
                                        System.out.println(maintenance);
                                        break;
                                    case "3":
                                        System.out.println(maintenance);
                                        break;
                                    case "0":
                                        //System.exit(0);
                                        bck2++;
                                        break OUTER;
                                    default:
                                        break;
                                }
                                break;
                            case "3":
                                System.out.println(maintenance);
                                break;
                            default:
                                break;
                        }

                    }while(bck2<4);
                    break;
                case "4":                    
                    System.out.println("Favorite\n1)Name\n2)Find\n0)Back\n");
                    reply = read.next();
                    switch (reply) {
                        case "0":
                            bck1++;
                            break OUTER_1;
                        case "1":
                            System.out.println(maintenance);
                            System.exit(0);
                        case "2":
                            System.out.println(maintenance);
                            System.exit(0);
                        default:
                            break;
                    }
                    break;                    
                case "5":               //Other networks
                    bck2=0;
                    do{
                            
                        System.out.println("Transfer Money to Other Network");
                        System.out.println("1) AirtelTigo");
                        System.out.println("2) Vodadone");
                        System.out.println("3) E-zwich");
                        System.out.println("4) G-Money");
                        System.out.println("5) Zeepay");
                        System.out.println("0) Back");
                        reply=read.next();
                        //AirtelTigo              AirtelTigo            AirtelTigo           AirtelTigo        AirtelTigo
                        if("1".equals(reply)){ 
                            grp.otherNetNumLength();
                            grp.numConfirmer();                                                        //Success: 1                Completion:0
                            AirtelTigoISPdetector();
                            debitRunner();
                            //Vodafone      Vodafone        Vodafone        Vodafone        Vodafone        Vodafone
                        }else if("2".equals(reply)){  
                            grp.otherNetNumLength();
                            grp.numConfirmer();  
                            vodaISPdetector();
                            debitRunner();
                            
                        
                        // E-zwich momo
                        }else if("3".equals(reply)){
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
                                System.exit(0);
                            } 
                            if(num1.equals(num2) && amount>0 && amount<initial_bal-1){
                                System.out.println("System under maintenance.");
                                System.exit(0);
                            }
                            count=0;
                            while(count<4 && !(amount>0 || amount<initial_bal-1)){
                                System.out.println("Invalid amount, please try again.");
                                amount=read.nextDouble();
                                count+=1;
                                if(count==3){
                                    System.out.println("The maximum amount of allowed retries has been exceeded.");
                                    System.exit(0);
                                }
                            }
                            System.out.println("Application down");
                            System.exit(0);

                            //G-Money momo
                        }else if("4".equals(reply)){
                            otherNetNumLength();
                            numConfirmer();
                            // Zeepay momo
                        }else if("5".equals(reply)){
                            otherNetNumLength();
                            numConfirmer();
                        }else{
                            count=0;
                            if(reply.equals("0")){
                                bck1++;
                                break;
                            }else{
                                while(!reply.equals("0")){
                                    System.out.println("Invalid input,try again.");
                                    reply = read.next();
                                    count++;
                                    if(count==3){
                                        System.out.println("The maximum amount of allowed retries has been exceeded.");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }while(bck2<4);
                    break;
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
                                walletToBank();
                            case "2":           //ABSA     
                                walletToBank();
                            case "3":               //GCB
                                walletToBank();
                            case "4":           //FIDELITY
                                walletToBank();
                            case "5":           //ADB
                                walletToBank();
                            case "6":           //UMB
                                walletToBank();
                            case "7":           //REPUBLIC
                                walletToBank();
                            case "8":           //ZENITH
                                walletToBank();
                            case "9":           //ECOBANK
                                walletToBank();
                            case "10":          //CAL
                                walletToBank();
                            case "11":          //PRUDENTIAL
                                walletToBank();
                            case "12":
                                walletToBank();
                            case "#":           //for next
                                System.out.println("STANBIC\n13) GT");
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
                                        walletToBank();
                                    case "14":          //UBA
                                         walletToBank();
                                    case "15":          //ACCESS
                                        walletToBank();
                                    case "16":          //CBG
                                        walletToBank();
                                    case "17":          //FIRST NAT. BANK
                                        walletToBank();
                                    case "18":          //NIB
                                        walletToBank();
                                    case "19":          //BANK OF AFRICA
                                        walletToBank();
                                    case "20":          //FBN BANK
                                        walletToBank();
                                    case "21":          //BSIC
                                        walletToBank();
                                    case "22":          //SERVICES INTEGRITY
                                        walletToBank();
                                    case "#":
                                        System.out.println("23)ARB Apex Bank\n24)GHL\n25)SOCIETE GENERALE GHANA\n26)Sinapi Aba Savings And Loans\n27)Opportunity International Savings And Loans\n# for next\n");
                                        reply = read.next();
                                        switch(reply){
                                            case "23":
                                                walletToBank();
                                                break;
                                            case "24":
                                                walletToBank();
                                                break;
                                            case "25":
                                                walletToBank();
                                                break;
                                            case "26":
                                                walletToBank();
                                                break;
                                            case "27":
                                                walletToBank();
                                            case "#":
                                                System.out.println("28)ADENYEMAN Savings and Loans\n");
                                                reply = read.next();
                                                if(!reply.equals("28")){
                                                    count=1;
                                                    while(true){
                                                        System.out.println("Invalid entry, please try again");
                                                        reply = read.next();
                                                        count++;
                                                    }
                                                }else{
                                                    walletToBank();
                                                }
                                                break;
                                        }
                                        break;          //under development
                                    default:
                                        break;                 
                                }
                        } 
                    }else if("0".equals(reply)) {
                        break; //Back under development

                    }
                case "0":
                    break;
                default:
                    break;  
            }
        }while(bck1<4);
    }
    
    private static int count;
    private static String refID, reply, num1="",num2="",networkType,pin1,pin2; 
    
    
    //Reusable methods
    public void SecreteCodeConfirmer(){
        System.out.println("Enter Secret Code");
        pin1=read.next();
        if(pin1.length()!=4 ){                                                              //Testing secrete code
            count=1;
            while(pin1.length()!=4 && count<4 ){
                System.out.println("Invalid Secret code, please try again.");
                pin1=read.next();
                count++;
            }
            if(count==4){
                System.out.println("The maximum amount of allowed retries has been exceeded.");
                System.exit(0);
            }
        }                                                                                   //Succ
        System.out.println("Confirm Secret Code");
        pin2=read.next();
    }
    public void mtnNumLength(){
        count=0;
        do{
            if(count==0){
            System.out.println("Enter mobile number");
            num1=read.next();
            count++;
            }
            if(num1.length()!=10){
                System.out.println("Invalid Mobile Number, Please try again.");
                num1=read.next();
                count+=1;
            }
            
            if(count==3){
                System.out.println("The maximum number of allowed retries exceeded.");
                //break;
                System.exit(0);
            }
        }while(num1.length()!=10);
        
    }
    public void otherNetNumLength(){
        count=0;
        do{
            if(count==0){
            System.out.println("Enter mobile number");
            num1=read.next();
            count++;
            }
            if(num1.length()!=10){
                System.out.println("Invalid Mobile Number, Please try again.");
                num1=read.next();
                count+=1;
            }
            
            if(count==3 && num1.length()!=10){
                System.out.println("The maximum number of allowed retries exceeded.");
                //break;
                System.exit(0);
            }
        }while(num1.length()!=10);
        
    }
    public void numConfirmer(){
        System.out.println("confirm mobile number");
        num2=read.next();
        if(num1.equals(num2)){
            System.out.println("Enter Amount to Transfer");
            amount=read.nextDouble();
        }else{
            System.out.println("Number Mismatch!");
            System.exit(0);
        }
    }
    public void AirtelTigoISPdetector(){
        if(("026".equals(num1.substring(0,3)))|| ("056".equals(num1.substring(0,3)))||("027".equals(num1.substring(0,3))) || ("057".equals(num1.substring(0,3)))){
            System.out.println("Enter Reference ID");
            ref=read.next();
        }else{
            System.out.println("Name Enquiry failed with error:Invalid Receiver Number");
            System.exit(0);
        }
    }
    public void vodaISPdetector(){
        if(("020".equals(num1.substring(0,3)))|| ("050".equals(num1.substring(0,3)))){
            System.out.println("Enter Reference ID");
            ref=read.next();
        }else{
            System.out.println("Name Enquiry failed with error:Invalid Receiver Number");
            System.exit(0);
        }
        
    }
    public void debitRunner(){
        if(amount>initial_bal){
            System.out.println(insufficient1);
            System.exit(0);
        }
        if(amount>100){
            System.out.println("Transfer to "+myName+" 233"+num1.substring(1,num1.length())+" for GHS "+amount+" with\nreference: "+ref+". Transaction Fee amount is GHS "+(int)(amount/50)*0.05+"; \nTax amount is GHS"+0.15*amount+". Enter \n# for next\n");
            reply = read.next();
            if(reply.equals("#")){
                System.out.println("MM PIN or 2 to cancel");
                reply = read.next();
                count=1;
                while(reply.length()!=4){
                    System.out.println("Invalid PIN code length. Enter 4 digit PIN.");
                    reply = read.next();
                    count++;
                    if(count ==3){
                        System.out.println("Maximum number of retries exceeded.");
                        System.exit(0);
                    }
                }
                if(reply.equals(pin)){
                    System.out.println("GHS "+amount+" sent to "+myName+" 233"+num1.substring(1,num1.length())+".\nTransaction Fee amount is GHS "+(int)(amount/50)*0.05+"; \nTax amount is GHS"+0.15*amount+". Enter \n# for next\n");
                    reply = read.next();
                    if(reply.equals("#")){
                        System.out.println("balance is GHS"+(initial_bal-amount)+". Transaction ID 182218282828. Thank you.");
                        System.exit(0);
                    }else{
                        System.exit(0);
                    }
                }else{
                    System.out.println("Invalid PIN, try again later.");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Transfer to "+myName+" 233"+num1.substring(1,num1.length())+" for GHS "+amount+" with\nreference: "+ref+". Transaction Fee amount is GHS "+(int)(amount/50)*0.05+"; \nTax amount is GHS0.00. Enter \n# for next\n");
            reply = read.next();
            if(reply.equals("#")){
                System.out.println("MM PIN or 2 to cancel");
                reply = read.next();
                count=1;
                while(reply.length()!=4){
                    System.out.println("Invalid PIN code length. Enter 4 digit PIN.");
                    reply = read.next();
                    count++;
                    if(count ==3){
                        System.out.println("Maximum number of retries exceeded.");
                        System.exit(0);
                    }
                }
                if(reply.equals(pin)){
                    System.out.println("GHS "+amount+" sent to "+myName+" 233"+num1.substring(1,num1.length())+".\nTransaction Fee amount is GHS "+(int)(amount/50)*0.05+"; \nTax amount is GHS0.00. Enter \n# for next\n");
                    reply = read.next();
                    if(reply.equals("#")){
                        System.out.println("balance is GHS"+(initial_bal-amount)+". Transaction ID 182218282828. Thank you.");
                        System.exit(0);
                    }else{
                        System.exit(0);
                    }
                }else{
                    System.out.println("Incorrect Mobile Money PIN.");
                    System.exit(0);
                }
            }
        }
    }
    
    public void walletToBank(){
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
            System.exit(0);
        }else{
            System.out.println("Service is currently unavailable (Ext Application Down), \nplease try ater some time");    //To be continued
            System.exit(0);
        }
    }
    
    static String receiver="Abdullah Idres",ref,Secretcode="8888",pin="1234";
    static String selfContact="233559708182",myName="Tiehisung Areez"; 
    static String maintenance="System under maintenance";
    static String numMismatch="Number Mismatch";
    static String insufficient1="Not enough balance for this transaction";
    static String insufficient2="Not enough funds to perform this transaction.";
    static double    initial_bal=12.43,  amount;
    public static Scanner read = new Scanner(System.in);
    
    
    static Grp grp = new Grp();
    public static void main(String[] args) {
        grp.transfer();
    }
    
}
