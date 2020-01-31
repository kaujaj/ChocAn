package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ServicesProvided extends javax.swing.JInternalFrame {

    JFrame f1=new JFrame();
    public ServicesProvided() {
        initComponents();
        f1.add(this);
        f1.setVisible(true);
        this.setVisible(true);
        f1.setSize(600, 600);
        populatetable();
    }
    public void populatetable()
    {
        DefaultTableModel model= new DefaultTableModel(new String[]{"Service Code","Provider Number","Service Name","Provider Name","Fees"},0);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("select * from provider_directory");
            while(rs.next()){
                String sercode= Integer.toString(rs.getInt("Service_code"));
                String pronum= Integer.toString(rs.getInt("Provider_number"));
                String sername= rs.getString("Service_name");
                String proname= rs.getString("Provider_name");
                String fees= Integer.toString(rs.getInt("Fees"));
                model.addRow(new Object[]{sercode,pronum,sername,proname,fees});
            }
            jTable1.setModel(model);
        }
        catch(Exception e)
        {
            System.out.println("Execption");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        serviceprovidedlbl = new javax.swing.JLabel();
        okbtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        serviceprovidedlbl.setText("Services Provided");

        okbtn.setText("Ok");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(serviceprovidedlbl))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceprovidedlbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okbtn)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        
        f1.setVisible(false);
    }//GEN-LAST:event_okbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okbtn;
    private javax.swing.JLabel serviceprovidedlbl;
    // End of variables declaration//GEN-END:variables
}
