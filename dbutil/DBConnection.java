/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hmayw
 */
public class DBConnection {
 
  private static Connection DBConnection;
    
    static{
        try{
             Class.forName("oracle.jdbc.OracleDriver");
              JOptionPane.showMessageDialog(null,"Driver succesfully loaded","DB Message",JOptionPane.INFORMATION_MESSAGE);
             DBConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","anshu1234");
               JOptionPane.showMessageDialog(null,"Connected to the DataBase","DBMessage",JOptionPane.INFORMATION_MESSAGE);
          }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Driver could not be loaded","DB Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Connection failed","DB Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Connection getConnection()
    {
        return DBConnection;
    }
    public static void closeConnection()
    {
        if(DBConnection!=null)
        {
            try{
            DBConnection.close();
            }
           catch(SQLException ex)
          {
            JOptionPane.showMessageDialog(null,"Connection could not be closed");
          }
        }
    }
 }


