package simple_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simple_Console {
    static Connection con;
    static String Url="jdbc:derby://localhost:1527/demo1";
    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(Url, "SosKode", "SosKode");
            System.out.println("Connect successfully ! ");
            String sql = "SELECT * FROM demo1";
            Statement st = con.createStatement();
            ResultSet rs=null;
            rs=st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
            }
            rs.close();
            st.close();
            con.close();
        
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id");
        String iD = s.next();
        
        System.out.println("Enter name");
        String item = s.next();
        
    }
    
}
