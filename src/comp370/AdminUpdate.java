package comp370;

import javax.swing.JFrame;
public class AdminUpdate extends javax.swing.JFrame {
    public AdminUpdate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        addmemberbtn1 = new javax.swing.JButton();
        deletememberbtn1 = new javax.swing.JButton();
        verifymemberbtn = new javax.swing.JButton();
        memberdatabtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addproviderbtn = new javax.swing.JButton();
        deleteproviderbtn = new javax.swing.JButton();
        servicesprovidedbtn = new javax.swing.JButton();
        providerdatabtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        addmemberbtn1.setText("Add Member");
        addmemberbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmemberbtn1ActionPerformed(evt);
            }
        });

        deletememberbtn1.setText("Delete Member");
        deletememberbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletememberbtn1ActionPerformed(evt);
            }
        });

        verifymemberbtn.setText("Verify Member");
        verifymemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifymemberbtnActionPerformed(evt);
            }
        });

        memberdatabtn.setText("Show Member's Data");
        memberdatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberdatabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletememberbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addmemberbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verifymemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberdatabtn))
                .addGap(67, 67, 67))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmemberbtn1)
                    .addComponent(verifymemberbtn))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletememberbtn1)
                    .addComponent(memberdatabtn))
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Member", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        addproviderbtn.setText("Add Provider");
        addproviderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproviderbtnActionPerformed(evt);
            }
        });

        deleteproviderbtn.setText("Delete Provider");
        deleteproviderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproviderbtnActionPerformed(evt);
            }
        });

        servicesprovidedbtn.setText("Services Provided");
        servicesprovidedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesprovidedbtnActionPerformed(evt);
            }
        });

        providerdatabtn.setText("Show Provider's Data");
        providerdatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerdatabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteproviderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addproviderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicesprovidedbtn)
                    .addComponent(providerdatabtn))
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addproviderbtn)
                    .addComponent(servicesprovidedbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteproviderbtn)
                    .addComponent(providerdatabtn))
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Provider", jPanel3);

        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jButton1.setText("Get Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutbtn)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        AdminLogin adm = new AdminLogin();
        setVisible(false);
        adm.setVisible(true);

    }//GEN-LAST:event_logoutbtnActionPerformed

    private void addproviderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproviderbtnActionPerformed
        // TODO add your handling code here:
        AddProvider adp = new AddProvider(); 
    }//GEN-LAST:event_addproviderbtnActionPerformed

    private void deleteproviderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproviderbtnActionPerformed
        // TODO add your handling code here:
        DeleteProvider ddp = new DeleteProvider();
    }//GEN-LAST:event_deleteproviderbtnActionPerformed

    private void addmemberbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmemberbtn1ActionPerformed
        // TODO add your handling code here:
        AddMember adm = new AddMember();
    }//GEN-LAST:event_addmemberbtn1ActionPerformed

    private void deletememberbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletememberbtn1ActionPerformed
        // TODO add your handling code here:
        DeleteMember ddm = new DeleteMember();
    }//GEN-LAST:event_deletememberbtn1ActionPerformed

    private void verifymemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifymemberbtnActionPerformed
        // TODO add your handling code here:
        VerifyMember vm=new VerifyMember();
    }//GEN-LAST:event_verifymemberbtnActionPerformed

    private void servicesprovidedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesprovidedbtnActionPerformed
        // TODO add your handling code here:
        ServicesProvided sp=new ServicesProvided();
    }//GEN-LAST:event_servicesprovidedbtnActionPerformed

    private void memberdatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberdatabtnActionPerformed
        // TODO add your handling code here:
        MemberData md=new MemberData();
    }//GEN-LAST:event_memberdatabtnActionPerformed

    private void providerdatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerdatabtnActionPerformed
        // TODO add your handling code here:
        ProviderData pd=new ProviderData();
    }//GEN-LAST:event_providerdatabtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Report r=new Report();
        r.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmemberbtn1;
    private javax.swing.JButton addproviderbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletememberbtn1;
    private javax.swing.JButton deleteproviderbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton memberdatabtn;
    private javax.swing.JButton providerdatabtn;
    private javax.swing.JButton servicesprovidedbtn;
    private javax.swing.JButton verifymemberbtn;
    // End of variables declaration//GEN-END:variables
}
