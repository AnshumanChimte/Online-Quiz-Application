/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import quizapplication.dbutil.DBConnection;
import quizapplication.pojo.CurrentUser;
import quizapplication.pojo.UsersPojo;

/**
 *
 * @author hmayw
 */
public class UsersDAO {
    public static boolean validateUser(UsersPojo obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and type=? ");
        
        ps.setString(1,obj.getUserId());
        ps.setString(2,obj.getPassword());
        ps.setString(3,obj.getType());
        System.out.println(obj.getType()+", "+obj.getUserId()+","+obj.getPassword());
       
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
        {
            CurrentUser.setId(rs.getString(1));
            CurrentUser.setUserId(rs.getString(2));
            CurrentUser.setName(rs.getString(4));
            CurrentUser.setType(rs.getString(5));
            return true;
        }
        return false;
    }
    public static Map<String,UsersPojo> getAllHrId()throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid,id,name from users where type='Hr'");
        Map<String,UsersPojo>m=new HashMap<>();
        while(rs.next())
        {
            UsersPojo obj=new UsersPojo();
            String userId=rs.getString(1);
            obj.setId(rs.getString(2));
            obj.setName(rs.getString(3));
            
            m.put(userId,obj);
        }
        return m;
    }
    public static boolean changePassword(String userid,String password) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=?,active='Y' where userid=?");
        ps.setString(1,password);
        ps.setString(2,userid);
        
        return 1==ps.executeUpdate();
    }
    public static boolean removeUser(String userId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set active='N' where userid=?");
        ps.setString(1,userId);
        
        return 1==ps.executeUpdate();
    }
    public static boolean validatePassword(String pId,String pwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where password=? and appid=?");
        ps.setString(1,pwd);
        ps.setString(2,pId);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static boolean updateParticipantPassword(String pId,String pwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where appid=?");
        ps.setString(1,pwd);
        ps.setString(2,pId);
        return 1==ps.executeUpdate();
    }
}
