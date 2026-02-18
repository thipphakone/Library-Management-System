/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Trivico
 */
public class DBConnect {
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pwd="";
            String url="jdbc:mysql://localhost/library";
            Connection con=DriverManager.getConnection(url,user,pwd);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
