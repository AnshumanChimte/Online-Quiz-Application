/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quizapplication.dbutil.DBConnection;
import quizapplication.pojo.ParticipantPojo;

public class ParticipantsDAO {
    
    public static int getNewParticipantId()throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(appid) from students");
        int pId=101;
        rs.next();
        String strId=rs.getString(1);
        if(strId!=null)
        {
            pId=Integer.parseInt(strId.substring(4))+1;
        }
        return pId;
    }
    public static int addNewParticipant(ParticipantPojo obj)throws SQLException,FileNotFoundException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1,obj.getUserId());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
           return -1;   
        }
        ps=conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1,obj.getId());
        ps.setString(2,obj.getUserId());
        ps.setString(3,obj.getPassword());
        ps.setString(4,obj.getName());
        ps.setString (5,obj.getType());
         
        int x=ps.executeUpdate();
        int y=0;
        if(x==1)
        {
            ps=conn.prepareStatement("insert into students values(?,?)");
            ps.setString(1,obj.getId());
            ps.setString(2,obj.getPhone());
            
            y=ps.executeUpdate();
        }
        return y;
    }
    public static ParticipantPojo getParticipantDetails(String appId)throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select users.name,users.userid,students.mobile_number from users,students where students.appid=? and users.appid=students.appid");
        ps.setString(1,appId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        ParticipantPojo participant=new ParticipantPojo();
        participant.setName(rs.getString(1));
        participant.setUserId(rs.getString(2));
        participant.setPhone(rs.getString(3));
        return participant;
    }
}
