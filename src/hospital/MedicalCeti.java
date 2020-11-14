/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Shanuka
 */
public class MedicalCeti extends javax.swing.JFrame {

    /**
     * Creates new form MedicalCeti
     */
    public MedicalCeti() {
        initComponents();

        try {
            PreparedStatement pst = db.con().prepareStatement("SELECT clinic FROM `doctor`");
            ResultSet rs;
            rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Laboratory.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1230, 850));
        setMinimumSize(new java.awt.Dimension(1230, 850));
        setPreferredSize(new java.awt.Dimension(1230, 850));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Medical Certicate");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 228, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Remarks          :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(520, 590, 160, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Description          :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 430, 170, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(680, 590, 480, 150);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(240, 430, 920, 116);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/33.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 690, 230, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/27.png"))); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1000, 90, 160, 60);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/32.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 690, 220, 50);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Gender", "Telephone"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(410, 230, 750, 180);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(240, 260, 150, 50);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(60, 340, 170, 50);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(240, 590, 160, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 100, 140, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(700, 100, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Doctor                  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 100, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Clinic                      :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 100, 180, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Patient ID            :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 590, 170, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Search by             :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 260, 180, 50);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/34.png"))); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(240, 340, 150, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1210, 800);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1210, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        String val = (String) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0);
        jTextField3.setText(val);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PreparedStatement pst;
        ResultSet rs;

        if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Pls enter the patient ID or name");
        } else {
            try {
                pst = db.con().prepareStatement("SELECT patient.`patid`, patient.`first_name`, patient.`last_name`,patient.`gender`, patient.`telephone`   FROM `patient` WHERE `first_name` like'%" + jTextField2.getText() + "%' OR patid like'%" + jTextField2.getText() + "%'");

                rs = pst.executeQuery();
                if (rs.next()) {
                    rs.beforeFirst();
                    jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                    jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                    jTextField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Patient not found");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jTable2.getModel();
        tb.setRowCount(0);
        jTextArea2.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        try {
            PreparedStatement ps = db.con().prepareStatement("select name from doctor where clinic='" + jComboBox1.getSelectedItem().toString() + "'");
            ResultSet rs = ps.executeQuery();
            rs.next();
            jTextField1.setText(rs.getString(1));

        } catch (SQLException ex) {
            Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement pst;
            ResultSet rs;

            pst = db.con().prepareStatement("SELECT patient.`patid`, patient.`first_name`, patient.`last_name`,address, patient.`telephone` FROM `patient` WHERE patid='" + jTextField3.getText() + "'");

            rs = pst.executeQuery();
            print(rs);

        } catch (SQLException ex) {
            Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void print(ResultSet rs) {
        try {
            rs.next();
            String today = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("medical certificate of " + rs.getString(1) + " - " + today + ".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult == JFileChooser.APPROVE_OPTION) {
                String filePath = dialog.getSelectedFile().getPath();

                try {

                    Document myDocument = new Document();

                    PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                    myDocument.open();
                    myWriter.setPageEvent(new MyPdfPageEventHelper("report1.png"));
                    myDocument.add(new Paragraph("\n\n\n\n\n\n"));
                    Paragraph head = new Paragraph("Medical Certificate", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD));
                    head.setAlignment(Element.ALIGN_CENTER);
                    myDocument.add(head);

                    myDocument.add(new Paragraph("Name : " + rs.getString(2) + " " + rs.getString(3), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));

                    Paragraph pdate = new Paragraph(today, FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD));
                    pdate.setAlignment(Element.ALIGN_LEFT);
                    myDocument.add(pdate);
                    myDocument.add(new Paragraph("Address : " + rs.getString(4), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));
                    myDocument.add(new Paragraph("Tel : " + rs.getString(5), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));
                    myDocument.add(new Paragraph("Doctor Name : " + jTextField1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));
                    myDocument.add(new Paragraph("Clinic Name : " + jComboBox1.getSelectedItem().toString(), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));

                    myDocument.add(new Paragraph("\n"));
                    myDocument.add(new Paragraph("Description : " + jTextArea2.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));
                    myDocument.add(new Paragraph("\n"));
                    myDocument.add(new Paragraph("\n"));
                    myDocument.add(new Paragraph("Remarks : " + jTextArea1.getText(), FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.PLAIN)));

                    myDocument.add(new Paragraph("\n"));
                    myDocument.add(new Paragraph("\n"));
                    myDocument.add(new Paragraph("\n"));

                    myDocument.add(new Paragraph("\n"));

                    myDocument.add(new Paragraph("................................"));
                    myDocument.add(new Paragraph("Signature"));

                    myDocument.close();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null, "Report was successfully generated");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextArea1.setText("");
                jTextArea2.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = db.con().prepareStatement("SELECT patient.`patid`, patient.`first_name`, patient.`last_name`,patient.`gender`, patient.`telephone`   FROM `patient` WHERE `first_name` like'%" + jTextField2.getText() + "%' OR patid like'%" + jTextField2.getText() + "%'");

            rs = pst.executeQuery();

            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dashboard d = new dashboard();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            PreparedStatement ps = db.con().prepareStatement("select name from doctor where clinic='" + jComboBox1.getSelectedItem().toString() + "'");
            ResultSet rs = ps.executeQuery();
            rs.next();
            jTextField1.setText(rs.getString(1));

        } catch (SQLException ex) {
            Logger.getLogger(MedicalCeti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(MedicalCeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalCeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalCeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalCeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalCeti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
