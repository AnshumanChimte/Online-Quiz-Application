/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication.gui;

import java.awt.Image;
import java.awt.Toolkit;
import quizapplication.pojo.CurrentUser;

/**
 *
 * @author hmayw
 */
public class AdminQuizzOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrQuizOptionFrame
     */
    public AdminQuizzOptionFrame() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java programs\\QuizzApplication\\src\\NewPhotos/appicon.jpg");
        this.setIconImage(img);
        this.setTitle("Quizz Application ");
        setLocationRelativeTo(null);
        lblHrName.setText(CurrentUser.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblHrName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAddQuizz = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnEditQuizz = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Welcome ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 293, -1, -1));

        lblHrName.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jPanel1.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 291, 210, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newimages/new/setQuiz.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 367, 203, 193));

        btnAddQuizz.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnAddQuizz.setText("Add Quizz");
        btnAddQuizz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuizzActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddQuizz, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 589, 160, 40));

        btnLogout.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 674, 100, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newimages/new/viewAllJob.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 391, 220, 145));

        btnEditQuizz.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnEditQuizz.setText("Edit Quizz");
        btnEditQuizz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditQuizzActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditQuizz, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 589, 170, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (11).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPhotos/pngegg (8).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 710, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 717));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditQuizzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditQuizzActionPerformed
      new EditQuizzFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnEditQuizzActionPerformed

    private void btnAddQuizzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuizzActionPerformed
       new SetQuizzFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAddQuizzActionPerformed

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
            java.util.logging.Logger.getLogger(AdminQuizzOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminQuizzOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminQuizzOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminQuizzOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminQuizzOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuizz;
    private javax.swing.JButton btnEditQuizz;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHrName;
    // End of variables declaration//GEN-END:variables
}
