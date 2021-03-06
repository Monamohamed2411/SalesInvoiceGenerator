/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sig.view;

import com.sig.controller.FilesManager1;
import com.sig.modle.invoiceHeader;
import java.awt.Color;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author LE
 */
public class AddInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AddInvoice
     */
    String filepathh;
    String filepathl;
    public AddInvoice() {
        initComponents();
    }
    public AddInvoice(String filepathh,String filepathl) {
        this.filepathh = filepathh;
        this.filepathl = filepathl;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InvDate = new javax.swing.JTextField();
        CusName = new javax.swing.JTextField();
        Okbut = new javax.swing.JButton();
        CancBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Invoice Date");

        jLabel2.setText("Customer Name");

        InvDate.setForeground(new java.awt.Color(204, 204, 204));
        InvDate.setText("format:dd-MM-yyyy");
        InvDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InvDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InvDateFocusLost(evt);
            }
        });
        InvDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDateActionPerformed(evt);
            }
        });

        CusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameActionPerformed(evt);
            }
        });

        Okbut.setText("OK");
        Okbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkbutActionPerformed(evt);
            }
        });

        CancBut.setText("Cancel");
        CancBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvDate, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(CusName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Okbut)
                        .addGap(42, 42, 42)
                        .addComponent(CancBut)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Okbut)
                    .addComponent(CancBut))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvDateActionPerformed

    private void CusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameActionPerformed

    private void OkbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkbutActionPerformed
        // TODO add your handling code here:
        ArrayList<invoiceHeader> all3 = new ArrayList<>();
        invoiceHeader i = new invoiceHeader();
        i.setfilepath(filepathh);
        i.ReadFileinvoiceHeader();
        all3 = i.getHeader();
        i.setNumber(all3.size()+1);
          
            try {   
               SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
              
                Date date = dateFormatter.parse(InvDate.getText());
            
                 i.setInvDate(dateFormatter.format(date));
            } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Cannot parse date, resetting to today.", "Invalid date format", JOptionPane.ERROR_MESSAGE);
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
      LocalDateTime now = LocalDateTime.now();  
   i.setInvDate(dtf.format(now));
            }
    
        i.setCustomer(CusName.getText());
        all3.add(i);
        i.setHeader(all3);
        i.WriteFileinvoiceHeader();
        this.setVisible(false);
        InvoiceFram a = new InvoiceFram(filepathh,filepathl);
        a.setVisible(true);
    }//GEN-LAST:event_OkbutActionPerformed

    private void CancButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        InvoiceFram a = new InvoiceFram(filepathh,filepathl);
        a.setVisible(true);
    }//GEN-LAST:event_CancButActionPerformed

    private void InvDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InvDateFocusGained

        if(InvDate.getText().equals("format:dd-MM-yyyy")){
           InvDate.setText(" ");
           InvDate.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_InvDateFocusGained

    private void InvDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InvDateFocusLost
        // TODO add your handling code here:
            if(InvDate.getText().equals(" ")){
           InvDate.setText("format:dd-MM-yyyy");
           InvDate.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_InvDateFocusLost

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
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoice().setVisible(true);
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancBut;
    private javax.swing.JTextField CusName;
    private javax.swing.JTextField InvDate;
    private javax.swing.JButton Okbut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
