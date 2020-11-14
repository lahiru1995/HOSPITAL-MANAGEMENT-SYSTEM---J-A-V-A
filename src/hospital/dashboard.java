/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Shanuka
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        String s=System.lineSeparator();
         jLabel4.setText(validation.username);
        jLabel1.setText(validation.username+" PORTAL");
       
        if (validation.username.equals("Doctor")) {
            d1.setEnabled(true);
            d2.setEnabled(true);

            l1.setEnabled(false);
            l2.setEnabled(false);

            r1.setEnabled(false);
            r2.setEnabled(false);
            r3.setEnabled(false);
            report.setEnabled(false);
        } else if (validation.username.equals("Laboratorian")) {
            l1.setEnabled(true);
            l2.setEnabled(true);

            d1.setEnabled(false);
            d2.setEnabled(false);

            r1.setEnabled(false);
            r2.setEnabled(false);
            report.setEnabled(false);
            r3.setEnabled(false);
        } else if (validation.username.equals("Receptionist")) {
            r1.setEnabled(true);
            r2.setEnabled(true);
            r3.setEnabled(true);

            d1.setEnabled(false);
            d2.setEnabled(false);
            l1.setEnabled(false);
            report.setEnabled(false);
            l2.setEnabled(false);
        } else {
            report.setEnabled(true);

            d1.setEnabled(true);
            d2.setEnabled(true);
            l1.setEnabled(true);
            l2.setEnabled(true);

            r1.setEnabled(true);
            r2.setEnabled(true);
            r3.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        report = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        l1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l2 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        report.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/22.png"))); // NOI18N
        report.setText("Report");
        report.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel1.add(report);
        report.setBounds(1570, 800, 310, 160);

        r3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        r3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/17.png"))); // NOI18N
        r3.setText("Employee Managment");
        r3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3);
        r3.setBounds(1370, 540, 330, 160);

        r1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/18.png"))); // NOI18N
        r1.setText("Patient\n Management");
        r1.setToolTipText("");
        r1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(900, 540, 330, 160);

        d1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/15.png"))); // NOI18N
        d1.setText("Prescription");
        d1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        jPanel1.add(d1);
        d1.setBounds(720, 800, 330, 160);

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/13.png"))); // NOI18N
        l1.setText("Medical Checkup");
        l1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        jPanel1.add(l1);
        l1.setBounds(1140, 260, 320, 160);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/24.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1690, 90, 190, 50);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 56)); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 70, 1020, 90);

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/19.png"))); // NOI18N
        l2.setText("Manage Checkup");
        l2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });
        jPanel1.add(l2);
        l2.setBounds(1570, 260, 310, 160);

        d2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/20.png"))); // NOI18N
        d2.setText("Medical Certificate");
        d2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        jPanel1.add(d2);
        d2.setBounds(1140, 800, 330, 160);

        r2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/21.png"))); // NOI18N
        r2.setText("Payment");
        r2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 5, true));
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(720, 260, 320, 160);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 610, 410, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 700, 590, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PORTAL");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 816, 410, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/38.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1960, 1070);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1930, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        Patient pt = new Patient();
        pt.setVisible(true);
        dispose();
    }//GEN-LAST:event_r1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        Prescription ps = new Prescription();
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_d1ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        Laboratory lb = new Laboratory();
        lb.setVisible(true);
        dispose();
    }//GEN-LAST:event_l1ActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        Checkup ch = new Checkup();
        ch.setVisible(true);
        dispose();
    }//GEN-LAST:event_l2ActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        Reports rp = new Reports();
        rp.setVisible(true);
        dispose();
    }//GEN-LAST:event_reportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validation.username = "";
        login l = new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        Payments py = new Payments();
        py.setVisible(true);
        dispose();
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        Employee_Managment emp = new Employee_Managment();
        emp.setVisible(true);
        dispose();
    }//GEN-LAST:event_r3ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        MedicalCeti md = new MedicalCeti();
        md.setVisible(true);
        dispose();
    }//GEN-LAST:event_d2ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton l1;
    private javax.swing.JButton l2;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton report;
    // End of variables declaration//GEN-END:variables
}