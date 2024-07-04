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
import java.util.ArrayList;
import java.util.List;
import quizapplication.dbutil.DBConnection;
import quizapplication.pojo.QuestionPojo;

/**
 *
 * @author hmayw
 */
public class QuestionDAO {
   public static boolean setQuestion (List<QuestionPojo> questions)throws SQLException 
   {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?)");
       int count=0;
       for(QuestionPojo que:questions)
       {
           ps.setInt(1,que.getqNo());
           ps.setString(2,que.getQuestion());
           ps.setString(3,que.getOption1());
           ps.setString(4,que.getOption2());
           ps.setString(5,que.getOption3());
           ps.setString(6,que.getOption4());
           ps.setInt(7,que.getCorrectOption());
           
           int result=ps.executeUpdate();
           if(result==1)
               count++;
       }
       if(count==questions.size())
           return true;
       else
           return false;
   }
   
   public static List<QuestionPojo> getPaper()throws SQLException
   {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from questions");
       ResultSet rs=ps.executeQuery();
       List<QuestionPojo>questions=new ArrayList<>();
       while(rs.next()){
          QuestionPojo que=new QuestionPojo();
          que.setqNo(rs.getInt(1));
          que.setQuestion(rs.getString(2));
          que.setOption1(rs.getString(3));
          que.setOption2(rs.getString(4));
          que.setOption3(rs.getString(5));
          que.setOption4(rs.getString(6));
          que.setCorrectOption(rs.getInt(7));
          questions.add(que);
       }
       return questions;
   }
   public static boolean updateQuestion(List<QuestionPojo>questions)throws SQLException
   {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("update questions set question=?,option1=?,option2=?,option3=?,option4=?,correct_option=? where qid=?");
       int count=0;
       for(QuestionPojo que:questions)
       {
           ps.setString(1,que.getQuestion());
           ps.setString(2,que.getOption1());
           ps.setString(3,que.getOption2());
           ps.setString(4,que.getOption3());
           ps.setString(5,que.getOption4());
           ps.setInt(6,que.getCorrectOption());
           ps.setInt(7,que.getqNo());
           
           int result=ps.executeUpdate();
           if(result==1)
               count++;
       }
       if(count==questions.size())
           return true;
       else
           return false;
   }
   public static void removeQuestions()throws SQLException{
       Statement st=DBConnection.getConnection().createStatement();
       st.executeQuery("Truncate table questions");
   }
}
