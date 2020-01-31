package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
public class DeleteProvider extends javax.swing.JInternalFrame {
    JFrame intframe=new JFrame();
    public DeleteProvider() {
        initComponents();
        setVisible(true);
        intframe.add(this);
        intframe.setVisible(true);
        setVisible(true);
        intframe.setSize(400, 400);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        providernumberlbl = new javax.swing.JLabel();
        deleteproviderbtn = new javax.swing.JButton();
        heading1lbl = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        providernumbertxt = new javax.swing.JTextField();

        providernumberlbl.setText("Provider Number");

        deleteproviderbtn.setText("Delete Provider");
        deleteproviderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproviderbtnActionPerformed(evt);
            }
        });

        heading1lbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        heading1lbl.setText("Enter Provider Details");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteproviderbtn)
                        .addGap(40, 40, 40)
                        .addComponent(cancelbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(providernumberlbl)
                        .addGap(32, 32, 32)
                        .addComponent(providernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(heading1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(providernumberlbl)
                    .addComponent(providernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteproviderbtn)
                    .addComponent(cancelbtn))
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(heading1lbl)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteproviderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproviderbtnActionPerformed
        int pronum= Integer.parseInt(providernumbertxt.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            st.executeUpdate("Delete from provider where Provider_num="+pronum);
               }
               catch(Exception e){
                   
               }
    }//GEN-LAST:event_deleteproviderbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        intframe.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deleteproviderbtn;
    private javax.swing.JLabel heading1lbl;
    private javax.swing.JLabel providernumberlbl;
    private javax.swing.JTextField providernumbertxt;
    // End of variables declaration//GEN-END:variables
}
