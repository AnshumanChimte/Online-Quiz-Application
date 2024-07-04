/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import quizapplication.dbutil.DBConnection;
import quizapplication.pojo.ResultsPojo;


public class ResultsDAO {
    
     public static boolean setResult(ResultsPojo rs)throws SQLException
    {
        PreparedStatement ps;
        ps=DBConnection.getConnection().prepareStatement("insert into results values(?,?)");
        ps.setDouble(2,rs.getPercentage());
        ps.setString(1,rs.getStdId());
        return 1==ps.executeUpdate();
    }
    public static List<ResultsPojo> getResultByStdId(String stdId) throws SQLException{
        PreparedStatement ps;
        ps=DBConnection.getConnection().prepareStatement("select percentage from results where stdid=?");
        ps.setString(1,stdId);
        ResultSet rs=ps.executeQuery();
        
        List<ResultsPojo>rp=new ArrayList<>();
        while(rs.next()){
            ResultsPojo obj=new ResultsPojo();
            
            obj.setPercentage(rs.getDouble(1));
            rp.add(obj);
        }
        return rp;
    }
}
