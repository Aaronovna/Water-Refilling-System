/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class SystemWRS {
    
    public static Connection con = null;
    
    public static boolean newCustomerState = false;
    
    public static Connection MsSqlDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/water_refilling_system_db","root","root");

            //JOptionPane.showMessageDialog(null, "Connected!");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
            return null;
        }
    }
    
    public static int generateID(int size)
    {
        Random random = new Random();
        int min = (int) Math.pow(10, size - 1);
        int max = (int) Math.pow(10, size) - 1;
        return random.nextInt(max - min + 1) + min;
    }
    
    public static String getCurrentDateTime()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
    
    
    public static double calcPercent(double total, double portion)
    {
        if (total == 0) {
            return 0.0; // Handle division by zero
        }
        return (portion / total) * 100;
    }
}
