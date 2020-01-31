package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DeleteMember extends javax.swing.JInternalFrame {
    JFrame intframe = new JFrame();

    public DeleteMember() {
        initComponents();
        this.setVisible(true);
        intframe.add(this);
        intframe.setVisible(true);
        this.setVisible(true);
        intframe.setSize(400, 400);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        membernumberlbl = new javax.swing.JLabel();
        deletememberbtn = new javax.swing.JButton();
        heading1lbl = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        membernumbertxt = new javax.swing.JTextField();

        membernumberlbl.setText("Member Number");

        deletememberbtn.setText("Delete Member");
        deletememberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletememberbtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(membernumberlbl)
                .addGap(27, 27, 27)
                .addComponent(membernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heading1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletememberbtn)
                        .addGap(36, 36, 36)
                        .addComponent(cancelbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading1lbl)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membernumberlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(deletememberbtn))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletememberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletememberbtnActionPerformed
        int memnum= Integer.parseInt(membernumbertxt.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            st.executeUpdate("Delete from members where mem_number="+memnum);
            JOptionPane.showMessageDialog(rootPane, "Member Deleted");
               }
               catch(Exception e){
                   System.out.println("Error");
               }
              finally{
            intframe.setVisible(false);
        }
    }//GEN-LAST:event_deletememberbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        intframe.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deletememberbtn;
    private javax.swing.JLabel heading1lbl;
    private javax.swing.JLabel membernumberlbl;
    private javax.swing.JTextField membernumbertxt;
    // End of variables declaration//GEN-END:variables
}
