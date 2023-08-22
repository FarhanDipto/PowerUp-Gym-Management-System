/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class adManager extends javax.swing.JFrame {

    /**
     * Creates new form adManager
     */
    public adManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        nme = new javax.swing.JLabel();
        Appointdate = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        workhour = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        appdatetxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        whourtxt = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        resset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, -1, -1));

        nme.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nme.setText("Name");
        getContentPane().add(nme, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 96, 78, 30));

        Appointdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Appointdate.setText("Appoint date");
        getContentPane().add(Appointdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 174, 78, 30));

        salary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        salary.setText("Salary");
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 253, 78, 30));

        workhour.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        workhour.setText("Work hour");
        getContentPane().add(workhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 338, 78, 30));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 96, 224, 30));
        getContentPane().add(appdatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 174, 224, 30));

        salarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytxtActionPerformed(evt);
            }
        });
        getContentPane().add(salarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 253, 224, 30));
        getContentPane().add(whourtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 338, 224, 30));

        save.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 465, 100, 37));

        resset.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        resset.setText("Discard");
        resset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ressetActionPerformed(evt);
            }
        });
        getContentPane().add(resset, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 465, 100, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/man.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 590));

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new home().toFront();
        new home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_backActionPerformed

    private void salarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytxtActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String ManagerName = nametxt.getText();
        String AppointDate = appdatetxt.getText();
        String Salary = salarytxt.getText();
        String Man_work_hour = whourtxt.getText();

        try {
            Connection con = ConnectMSSQL.getCon();
            Statement st = con.createStatement();
            String query = "insert into  Manager(ManagerName,AppointDate, Salary,Man_work_hour)values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, nametxt.getText());
            pst.setString(2, appdatetxt.getText());
            pst.setString(3, salarytxt.getText());
            pst.setString(4, whourtxt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UnSucessFul");
            System.out.println("notconnect");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void ressetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ressetActionPerformed
        // TODO add your handling code here:
        nametxt.setText("");
        salarytxt.setText("");
        appdatetxt.setText("");
        whourtxt.setText("");
    }//GEN-LAST:event_ressetActionPerformed

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
            java.util.logging.Logger.getLogger(adManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appointdate;
    private javax.swing.JTextField appdatetxt;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel nme;
    private javax.swing.JButton resset;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton save;
    private javax.swing.JTextField whourtxt;
    private javax.swing.JLabel workhour;
    // End of variables declaration//GEN-END:variables
}
