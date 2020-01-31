
package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VerifyMember extends javax.swing.JInternalFrame {

    JFrame intframe=new JFrame();
    public VerifyMember() {
        initComponents();
           this.setVisible(true);
        intframe.add(this);
        intframe.setVisible(true);
        this.setVisible(true);
        intframe.setSize(600, 600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        membernumberlbl = new javax.swing.JLabel();
        updatememberbtn = new javax.swing.JButton();
        heading1lbl = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        membernumbertxt = new javax.swing.JTextField();
        truecb = new javax.swing.JCheckBox();
        falsecb = new javax.swing.JCheckBox();

        membernumberlbl.setText("Member Number");

        updatememberbtn.setText("Update Member");
        updatememberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatememberbtnActionPerformed(evt);
            }
        });

        heading1lbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        heading1lbl.setText("Enter Member Details");

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        truecb.setText("Verified");

        falsecb.setText("Not Verified");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatememberbtn)
                        .addGap(36, 36, 36)
                        .addComponent(cancelbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(truecb)
                            .addComponent(membernumberlbl))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(membernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(falsecb)))
                    .addComponent(heading1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(heading1lbl)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membernumberlbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(truecb)
                    .addComponent(falsecb))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(updatememberbtn))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatememberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatememberbtnActionPerformed
       int memnum= Integer.parseInt(membernumbertxt.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            if(truecb.isSelected()){
            st.executeUpdate("update members set mem_suspended='False' where mem_number="+memnum);
            JOptionPane.showMessageDialog(rootPane, "Member Verified");
            }
            if(falsecb.isSelected()){
                st.executeUpdate("update members set mem_suspended='True' where mem_number="+memnum);
                JOptionPane.showMessageDialog(rootPane, "Member Suspended");
            }   
            }
               catch(Exception e){
                   
               }
    }//GEN-LAST:event_updatememberbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        intframe.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JCheckBox falsecb;
    private javax.swing.JLabel heading1lbl;
    private javax.swing.JLabel membernumberlbl;
    private javax.swing.JTextField membernumbertxt;
    private javax.swing.JCheckBox truecb;
    private javax.swing.JButton updatememberbtn;
    // End of variables declaration//GEN-END:variables
}
