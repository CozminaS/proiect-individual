/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Cozmina
 */
public class ConectareDB {
    static final String DB_URL="jdbc:mysql://localhost/anima";
    static final String USER="root";
    static final String PASS="";
    
    public static Connection connectDB(){
              Connection conn=null;
        try{
          //  Class.forName("com.mysql.jdbc.Driver");
            //dechide o coneciune 
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("A fost o eroare cand s-a incercat conectarea la baza de date");
            return null;
        }
    }
    
}
