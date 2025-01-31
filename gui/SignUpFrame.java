/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import quizapplication.dao.ParticipantsDAO;
import quizapplication.pojo.ParticipantPojo;

/**
 *
 * @author hmayw
 */
public class SignUpFrame extends javax.swing.JFrame {

   private File file;
    
    public SignUpFrame() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java programs\\QuizzApplication\\src\\NewPhotos/appicon.jpg");
        this.setIconImage(img);
        this.setTitle("Quizz Application ");
        setLocationRelativeTo(null);
        loadId();
        
    }
    private  void loadId()
    {
        try{
            int id=ParticipantsDAO.getNewParticipantId();
            lblPrid.setText("std-"+id);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in loading id","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblPrid = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        pwdCPassword = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(173, 192, 234));
        txtName.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 390, 20));

        txtEmail.setBackground(new java.awt.Color(173, 192, 234));
        txtEmail.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 400, -1));

        txtMobile.setBackground(new java.awt.Color(173, 192, 234));
        txtMobile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtMobile.setBorder(null);
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 390, 20));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel3.setText("Participant Id : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        lblPrid.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jPanel1.add(lblPrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 140, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 330, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, 40));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel6.setText("Name :- ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel8.setText("Email :- ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, 20));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel10.setText("Mobile No :- ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 960, 10));

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel22.setText("Password :- ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 584, -1, 30));

        jLabel23.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel23.setText("Confirm Password :-");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 584, -1, 30));

        pwdPassword.setBackground(new java.awt.Color(173, 192, 234));
        pwdPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pwdPassword.setBorder(null);
        jPanel1.add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 410, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 460, -1));

        pwdCPassword.setBackground(new java.awt.Color(173, 192, 234));
        pwdCPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pwdCPassword.setBorder(null);
        jPanel1.add(pwdCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 400, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 970, 10));

        jButton2.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jButton2.setText("Login Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, -1, 30));

        btnCreateAccount.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (11).png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (8).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 710, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        if(!validateInputs())
        {
            JOptionPane.showMessageDialog(null,"Field should not be left blank","Warning",JOptionPane.WARNING_MESSAGE);
            return ;
        }
        if(!pwdMatch())
        {
            JOptionPane.showMessageDialog(null,"Password and confirm password are differennt","Warning",JOptionPane.WARNING_MESSAGE);
            return ;
        }
        ParticipantPojo pr=new ParticipantPojo();

        pr.setId(lblPrid.getText());
        pr.setName(txtName.getText());
        pr.setUserId(txtEmail.getText().toUpperCase());
        pr.setPhone(txtMobile.getText());
        pr.setPassword(String.valueOf(pwdPassword.getPassword()));
        pr.setType("Std");
       

        try{
            int result=ParticipantsDAO.addNewParticipant(pr);
            if(result==-1)
            {
                JOptionPane.showInputDialog(null,"UserId is already registered","warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(result==0)
            {
                JOptionPane.showInputDialog(null,"Record could not be added","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showInputDialog(null,"Record Added","Success",JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                loadId();
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error while Adding Data","DB Error",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
            return ;
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LoginScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void clearFields(){
      txtName.setText("");
      txtEmail.setText("");
      txtMobile.setText("");
     
      pwdPassword.setText("");
      pwdCPassword.setText("");
    }
    
    private boolean validateInputs()
     {
         if(txtName.getText().trim().isEmpty()||txtEmail.getText().trim().isEmpty()||txtMobile.getText().trim().isEmpty()||String.valueOf(pwdPassword.getPassword()).isEmpty()||String.valueOf(pwdCPassword.getPassword()).isEmpty())
             return false;
         else
             return true;
     }
     private boolean pwdMatch()
     {
         if(String.valueOf(pwdPassword.getPassword()).equals(String.valueOf(pwdCPassword.getPassword())))
             return true;
         else
             return false;
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblPrid;
    private javax.swing.JPasswordField pwdCPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
