/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author HP
 */
public class customerhome extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public customerhome() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        addcustbox = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();
        Package = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addcustbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Show Information", "My Due" }));
        addcustbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustboxActionPerformed(evt);
            }
        });
        getContentPane().add(addcustbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, 50));

        logout.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 30, 90, 40));

        Package.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Package", "Pack Info" }));
        Package.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageActionPerformed(evt);
            }
        });
        getContentPane().add(Package, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 590));

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addcustboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustboxActionPerformed
        // TODO add your handling code here:
        if (addcustbox.getSelectedItem() == "Add New Customer") {
            addmem ad = new addmem();
            this.toBack();
            ad.setVisible(true);
            ad.toFront();
        }
        if (addcustbox.getSelectedItem() == "Edit Customer Info") {
            editMember ad = new editMember();
            this.toBack();
            ad.setVisible(true);
            ad.toFront();
        }
        if (addcustbox.getSelectedItem() == "Show Information") {
            showinf sh = new showinf();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        }
        if (addcustbox.getSelectedItem() == "My Due") {
            mydue sh = new mydue();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        }

        if (addcustbox.getSelectedItem() == "excercise") {
            EX sh = new EX();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        }
        if (addcustbox.getSelectedItem() == "star customer") {
            star sh = new star ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
        
         if (addcustbox.getSelectedItem() == "bronze customer") {
            Bronze sh = new Bronze ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
        
        
         if (addcustbox.getSelectedItem() == "denied") {
            denied sh = new denied ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
         if (addcustbox.getSelectedItem() == "customer packs") {
            CP sh = new CP ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
         if (addcustbox.getSelectedItem() == "show all customers") {
            AllCust sh = new AllCust ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
         if (addcustbox.getSelectedItem() == "gym access") {
            access sh = new access ();
            this.toBack();
            sh.setVisible(true);
            sh.toFront();
        
       
        }
         
         
         
         
    }//GEN-LAST:event_addcustboxActionPerformed

    
    
    
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login lg= new Login();
        lg.setVisible(true);
        dispose();
        //this.toBack();
       // setVisible(false);
       // new Login().toFront();
       // new Login().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_logoutActionPerformed

    private void PackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageActionPerformed
        // TODO add your handling code here:
        if (Package.getSelectedItem() == "Add new pack") {
            adpack pk = new adpack();
            this.toBack();
            pk.setVisible(true);
            pk.toFront();
        }
        if (Package.getSelectedItem() == "Edit Pack Details") {
            editpack pk = new editpack();
            this.toBack();
            pk.setVisible(true);
            pk.toFront();
        }
         if (Package.getSelectedItem() == "Pack Info") {
            PackInfo pk = new PackInfo();
            this.toBack();
            pk.setVisible(true);
            pk.toFront();
        }
    }//GEN-LAST:event_PackageActionPerformed

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
            java.util.logging.Logger.getLogger(customerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Package;
    private javax.swing.JComboBox<String> addcustbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
