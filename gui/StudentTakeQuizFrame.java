/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import quizapplication.dao.QuestionDAO;
import quizapplication.dao.ResultsDAO;
import quizapplication.pojo.CurrentUser;
import quizapplication.pojo.QuestionPojo;
import quizapplication.pojo.ResultsPojo;

/**
 *
 * @author hmayw
 */

public class StudentTakeQuizFrame extends javax.swing.JFrame {
    
     private String jobId;
     private String jobTitle;
     private List<QuestionPojo>questions;
     private List<Integer>answer;
     private int Counter;
    
    public StudentTakeQuizFrame() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java programs\\QuizzApplication\\src\\NewPhotos/appicon.jpg");
        this.setIconImage(img);
        this.setTitle("Quizz Application ");
        setLocationRelativeTo(null);
        lblPrName.setText(CurrentUser.getName());
        Timer obj=new Timer();
        obj.start();
        lblJobTitle.setText("Paper For : "+CurrentUser.getId());
        this.Counter=0;
        txtQuestion.setEditable(false);
        loadQuestion();
    }
    class Timer extends Thread{
        @Override
        public void run(){
            int min=0;
            int sec=60;
            
           while(min!=0||sec!=0)
           {
               try{
                   sec--;
                   if(min<10&&sec<10)
                   lblTimer.setText("Time left - 0"+min+":0"+sec);
                   else if(min<10)
                   lblTimer.setText("Time left - 0"+min+":"+sec);
                   else if(sec<10)
                   lblTimer.setText("Time left - "+min+":0"+sec);
                   else
                   lblTimer.setText("Time left - "+min+":"+sec);
                   
                   Thread.sleep(1000);
                   if(sec==0&&min!=0)
                   {
                        min=min-1;
                        sec=60;
                   }
               }
               catch(InterruptedException ex)
               {
                   ex.printStackTrace();
               }
           }
        JOptionPane.showMessageDialog(null,"Your Time up","Warning",JOptionPane.WARNING_MESSAGE);
        submit();
        dispose();
        }
    }
    private void submit(){
         ResultsPojo result=new ResultsPojo();
         result.setStdId(CurrentUser.getId());
         double per=getPercentage();
         result.setPercentage(per);
        
         try{
              boolean res=ResultsDAO.setResult(result);
              if(res==true)
              {
                  JOptionPane.showMessageDialog(null,"Paper Submitted Successfully \nYou will get result on your registered email","Done",JOptionPane.INFORMATION_MESSAGE);
                  new StudentOptionFrame().setVisible(true);
                  this.dispose();
              }
              else{
                JOptionPane.showMessageDialog(null,"Paper could not be Submitted Successfully","Not Submitted",JOptionPane.ERROR_MESSAGE);  
              }
         }catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
         }
           
    }
   
    private void loadQuestion()
    {
        try{
            this.questions=QuestionDAO.getPaper();
            this.answer=new ArrayList<>(questions.size());
            for(int i=0;i<questions.size();i++)
            {
                answer.add(i,0);
            }
            showQuestion(questions.get(0));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void showQuestion(QuestionPojo que)
    {
        lblQueNo.setText(String.valueOf(que.getqNo()));
        txtQuestion.setText(que.getQuestion());
        rbtnOption1.setText(que.getOption1());
        rbtnOption2.setText(que.getOption2());
        rbtnOption3.setText(que.getOption3());
        rbtnOption4.setText(que.getOption4());
        int ans=answer.get(Counter);
        switch(ans)
        {
            case 1:
                  rbtnOption1.setSelected(true);
                  break;
            case 2:
                   rbtnOption2.setSelected(true);
                   break;
            case 3:
                   rbtnOption3.setSelected(true);
                   break;
            case 4:
                    rbtnOption4.setSelected(true);
                    break;
            default:
                    buttonGroup3.clearSelection();
        }
    }
    private int validateInputs(){
        if(rbtnOption1.isSelected())
            return 1;
        else if(rbtnOption2.isSelected())
            return 2;
        else if(rbtnOption3.isSelected())
            return 3;
        else if(rbtnOption4.isSelected())
            return 4;
        else
            return 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPrName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQueNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDiscardPaper = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbtnOption2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rbtnOption1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbtnOption4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rbtnOption3 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblJobTitle = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1026, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Welcome ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblPrName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel1.add(lblPrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel4.setText("Que. ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblQueNo.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jPanel1.add(lblQueNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 30, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setText("Options : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 930, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 970, 20));

        btnPrevious.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 150, 30));

        btnNext.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 140, -1));

        btnDiscardPaper.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnDiscardPaper.setText("Discard Paper");
        btnDiscardPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardPaperActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 150, -1));

        btnSubmit.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 670, 140, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setText("Option 4 : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, 50));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setText("Option 3 : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("Option 2 : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, 30));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("Option 1 : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 40));

        rbtnOption2.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup3.add(rbtnOption2);
        rbtnOption2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rbtnOption2.setText("jRadioButton3");
        jPanel1.add(rbtnOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, 50));

        rbtnOption1.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup3.add(rbtnOption1);
        rbtnOption1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rbtnOption1.setText("jRadioButton4");
        jPanel1.add(rbtnOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, 50));

        rbtnOption4.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup3.add(rbtnOption4);
        rbtnOption4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rbtnOption4.setText("jRadioButton2");
        jPanel1.add(rbtnOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, 50));

        rbtnOption3.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup3.add(rbtnOption3);
        rbtnOption3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rbtnOption3.setText("jRadioButton1");
        jPanel1.add(rbtnOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, 50));

        txtQuestion.setBackground(new java.awt.Color(173, 192, 234));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane2.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 860, 90));

        lblJobTitle.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jPanel1.add(lblJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 290, 40));

        lblTimer.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 0, 0));
        lblTimer.setText("Time left : 03:59");
        jPanel1.add(lblTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (11).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (8).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -10, 710, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
          int ans=validateInputs();
          if(ans==0){
              JOptionPane.showMessageDialog(null,"Please select an option","Warning",JOptionPane.WARNING_MESSAGE);
              return ;
          }
        answer.set(Counter,ans);
        
        
        if(this.Counter==0)
            this.Counter=questions.size()-1;
        else 
            this.Counter--;
        
        showQuestion(questions.get(Counter));   
                                   
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       int ans=validateInputs();
          if(ans==0){
              JOptionPane.showMessageDialog(null,"Please select an option","Warning",JOptionPane.WARNING_MESSAGE);
              return ;
          }
        
        answer.set(Counter,ans);
        
        
        if(this.Counter==questions.size()-1)
            this.Counter=0;
        else 
            this.Counter++;
        
        showQuestion(questions.get(Counter));   
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDiscardPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardPaperActionPerformed
        int result=JOptionPane.showConfirmDialog(null,"Are you sure, Do you want to Discard paper ","Confrimation",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
            questions.clear();
            new StudentOptionFrame().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnDiscardPaperActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         int ans=validateInputs();
          if(ans==0){
              JOptionPane.showMessageDialog(null,"Please select an option","Warning",JOptionPane.WARNING_MESSAGE);
              return ;
          }
         answer.set(Counter,ans);

         ResultsPojo result=new ResultsPojo();
         result.setStdId(CurrentUser.getId());
         double per=getPercentage();
         result.setPercentage(per);
        
         try{
              boolean res=ResultsDAO.setResult(result);
              if(res==true)
              {
                  JOptionPane.showMessageDialog(null,"Paper Submitted Successfully \nYou will get result on your registered email","Done",JOptionPane.INFORMATION_MESSAGE);
                  new StudentOptionFrame().setVisible(true);
                  this.dispose();
              }
              else{
                JOptionPane.showMessageDialog(null,"Paper could not be Submitted Successfully","Not Submitted",JOptionPane.ERROR_MESSAGE);  
              }
         }catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
         }
         
         
    }//GEN-LAST:event_btnSubmitActionPerformed
     private double getPercentage()
     {
         int markObtained=0;
         for(int i=0;i<this.questions.size();i++)
         {
             QuestionPojo obj=this.questions.get(i);
             if(obj.getCorrectOption()==this.answer.get(i))
                 markObtained++;
         }
         return (markObtained/(double)this.questions.size())*100;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTakeQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardPaper;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblJobTitle;
    private javax.swing.JLabel lblPrName;
    private javax.swing.JLabel lblQueNo;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JRadioButton rbtnOption1;
    private javax.swing.JRadioButton rbtnOption2;
    private javax.swing.JRadioButton rbtnOption3;
    private javax.swing.JRadioButton rbtnOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
