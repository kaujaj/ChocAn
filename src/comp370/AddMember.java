/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jgman
 */
public class AddMember extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddMember
     */JFrame frame1 = new JFrame();
        
    public AddMember() {
        initComponents();
        setVisible(true);
        frame1.add(this);
        frame1.setVisible(true);
        frame1.setSize(400, 400);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        membernumberlbl = new javax.swing.JLabel();
        addmemberbtn = new javax.swing.JButton();
        membernumbertxt = new javax.swing.JTextField();
        memberaddresslbl = new javax.swing.JLabel();
        memberaddresstxt = new javax.swing.JTextField();
        membercitylbl = new javax.swing.JLabel();
        membercitytxt = new javax.swing.JTextField();
        memberstatelbl = new javax.swing.JLabel();
        memberstatetxt = new javax.swing.JTextField();
        memberpostalcodelbl = new javax.swing.JLabel();
        memberziptxt = new javax.swing.JTextField();
        headinglbl = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        membernamelbl = new javax.swing.JLabel();
        membernametxt = new javax.swing.JTextField();

        membernumberlbl.setText("Member Number");

        addmemberbtn.setText("Add Member");
        addmemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmemberbtnActionPerformed(evt);
            }
        });

        memberaddresslbl.setText("Address");

        membercitylbl.setText("City");

        memberstatelbl.setText("State/Province");

        memberpostalcodelbl.setText("Postal Code");

        headinglbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        headinglbl.setText("Enter Member Details");

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        membernamelbl.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(memberaddresslbl)
                            .addComponent(membernumberlbl)
                            .addComponent(membercitylbl)
                            .addComponent(memberstatelbl)
                            .addComponent(memberpostalcodelbl)
                            .addComponent(addmemberbtn)
                            .addComponent(membernamelbl))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memberaddresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(membernumbertxt)
                            .addComponent(membercitytxt)
                            .addComponent(memberstatetxt)
                            .addComponent(memberziptxt)
                            .addComponent(cancelbtn)
                            .addComponent(membernametxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(headinglbl)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headinglbl)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membernumberlbl)
                    .addComponent(membernumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membernamelbl)
                    .addComponent(membernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberaddresslbl)
                    .addComponent(memberaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membercitylbl)
                    .addComponent(membercitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberstatelbl)
                    .addComponent(memberstatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberpostalcodelbl)
                    .addComponent(memberziptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(addmemberbtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addmemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmemberbtnActionPerformed
        int memnum= Integer.parseInt(membernumbertxt.getText());
        String memname= membernametxt.getText(),memadd=memberaddresstxt.getText(),memcity=membercitytxt.getText();
        String memstate=memberstatetxt.getText(),memzip=memberziptxt.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            System.out.println("here"+memnum+memname+memadd+memstate+memzip+memcity);
            st.executeUpdate("INSERT INTO `members` (`mem_number`, `mem_name`, `mem_address`, `mem_city`, `mem_state`, `mem_zipcode`, `mem_suspended`) VALUES ("
            +memnum+" ,'"+memname+"', '"+memadd+"', '"+memcity+"', '"+memstate+"', '"+memzip+"', 'False')");
               JOptionPane.showMessageDialog(rootPane, "Member Added");
        }
               catch(Exception e){
                   System.out.println("Error");
               }
    }//GEN-LAST:event_addmemberbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        frame1.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmemberbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel headinglbl;
    private javax.swing.JLabel memberaddresslbl;
    private javax.swing.JTextField memberaddresstxt;
    private javax.swing.JLabel membercitylbl;
    private javax.swing.JTextField membercitytxt;
    private javax.swing.JLabel membernamelbl;
    private javax.swing.JTextField membernametxt;
    private javax.swing.JLabel membernumberlbl;
    private javax.swing.JTextField membernumbertxt;
    private javax.swing.JLabel memberpostalcodelbl;
    private javax.swing.JLabel memberstatelbl;
    private javax.swing.JTextField memberstatetxt;
    private javax.swing.JTextField memberziptxt;
    // End of variables declaration//GEN-END:variables
}
