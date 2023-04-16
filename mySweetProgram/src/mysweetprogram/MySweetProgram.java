/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysweetprogram;

/**
 *
 * @author Eid Seagate
 */
public class MySweetProgram {

    
    public static void main(String[] args) {
      
        String m ="hello world!";  // object (an instance of a class)
        // String m=new String("Hello world"); // same as above
        //reading and extracting a char from a string literal
        //System.out.println(m.charAt(7));
        
        //concatenation of strings(combining them)
        //System.out.println(m+=" is a popular programming preamble");
        //similarly
        //System.out.println(m+" of the milinium.");
        //System.out.println(m);
        //System.out.println(m.length());
        //using the string.format
        
        System.out.println(String.format("good morning %s", m));
        
        
        
    }
    
}
