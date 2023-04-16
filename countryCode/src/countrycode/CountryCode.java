/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrycode;
import java.util.Scanner;
/**
 *
 * @author Eid Seagate
 */
public class CountryCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a program to lookup phone number verify its viability, country code, ISP type and display output.
       String country="";String code="";
        Scanner read=new Scanner(System.in);
        System.out.println("Enter your gender e.g Male or Female");
        String gender=read.next();
        //Checking for gender parity
        
        String greet="";
        if (null!=gender)switch (gender) {
            case "m":
            case "M":
            case "Male":
            case "male":
            case "MALE":
            {
                greet="Hello Mr User!";
                break;
            }
            case "f":
            case "F":
            case "female":
            case "Female":
            case "FEMALE":
            {
                greet="Hello Madam User!";
                break;
            }
            default:
                System.out.println("\nCheck your spelling. \nGender not case sensitive. May use initials instead.");
                break;
        }else {
            System.out.println("\nNo name entered.");
        }
        
        //  ACCEPT THE PHONE NUMBER
        
        System.out.println("\nEnter phone number e.g 020...");
        
        String phone=read.next();
             

        if(phone.length()!=10 || !"0".equals(phone.substring(0,1))){//Avoids starting non-zero digits
            System.out.println("Incorrect entry! Contact must start with 0.");
        }
        
        
        else{
            //lookup for country code using a switch
            System.out.println("Enter country name");
            country=read.next();
            
            switch(country){
                case "Ghana":
                    code="+233";break;
                case "ghana":
                    code="+233";break;
                case "GHANA":

                    code="+233";break;
                case "Nigeria":
                    code="+234";break;
                case "nigeria":
                    code="+234";break;
                case "NIGERIA":
                    code="+234";break;    

                case "Cote":
                    code="+225";break;
                case "cote":
                    code="+225";break;
                case "COTE":
                    code="+225";break;

                case "togo":
                    code="+238";break;
                case "Togo":
                    code="+238";break;
                case "TOGO":
                    code="+238";break;
                default:
                    System.out.println("\nCheck spelling and try again.");
        }
        
        }
        
        //converting country name all to lowerCase
        String countLower=country.toLowerCase();
        // extract the string of countLower leaving out the initial char
        String countLowerRest=countLower.substring(1,countLower.length());
        //extract first letter of country name
        String initialLetter=country.substring(0,1);
        initialLetter=initialLetter.toUpperCase();
        
        //Detection of ISP e.g 020 for mtn
        String first_3,isp;
        first_3 = String.valueOf(phone.substring(0,3));
        
        
        if ("020".equals(first_3)||"050".equals(first_3)){
            isp="Vodafone";
        }else if("024".equals(first_3)||"025".equals(first_3)||"054".equals(first_3)||"055".equals(first_3)||"059".equals(first_3)){
            isp="MTN";
        }else if("023".equals(first_3)){
            isp="Glo";
        }else if("026".equals(first_3)||"056".equals(first_3)||"027".equals(first_3)||"057".equals(first_3)){
            isp="AirtelTigo";
        }else{
            isp="private or foreign";
        }
        System.out.println(greet);
        System.out.println();
        System.out.println("Official "+initialLetter+countLowerRest+" Contact:\t"+code+phone.substring(1,phone.length()));
        System.out.println("You are using "+isp+" number.");
    }
    
}
