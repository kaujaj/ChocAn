package comp370;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class VerifyService extends javax.swing.JInternalFrame {
    JFrame f1=new JFrame();
    int pronum,memnum,sernum,fees;
    String date,sername,proname,memname;
    public VerifyService(int pronum,int memnum,int sernum,String date) {
        this.pronum =pronum;
        this.memnum=memnum;
        this.sernum=sernum;
        this.date =date;
        initVars();
        initComponents();
        this.setVisible(true);
        f1.setVisible(true);
        f1.add(this);
        f1.setSize(800,800);
    }
    private void initVars() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("select * from provider_directory where Service_code="+sernum);
            rs.next();
            sername=rs.getString("Service_name");
            System.out.println(sername);
            proname=rs.getString("Provider_name");
            System.out.println(proname);
            fees=rs.getInt("Fees");
            rs.close();
            rs= st.executeQuery("select * from members where mem_number="+memnum);
            rs.next();
            memname= rs.getString("mem_name");
            con.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    @SuppressWarnings("unchecked")                      
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        confirmbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        jLabel1.setText(proname+" provided "+sername+" service to "+memname+" on "+date+" a fees of $ "+fees+" will be charged to ChocAn");

        jLabel2.setText("Additional Comments");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(confirmbtn)
                        .addGap(55, 55, 55)
                        .addComponent(cancelbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, javax.swing.GroupLayout.DEFAULT_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmbtn)
                    .addComponent(cancelbtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ProvideService sp = new ProvideService(pronum,memnum);
        sp.setVisible(true);
        f1.setVisible(false);
    }                                         

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date dt= new Date();
        String comment=jTextArea1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            System.out.println("here"+sernum+sername+pronum+proname+fees+date+comment);
            int check=st.executeUpdate("INSERT INTO `service_provided` (`Service_code`, `Service_name`, `Provider_num`, `Provider_name`,"
                    + " `Fees`, `Date`, `Comments`, `TimeEntered`) VALUES ("+sernum+", '"+sername+"', "
                            + pronum+", '"+proname+"', "+fees+", '"+date+"', '"+comment+"', '"+LocalDateTime.now()+"')");
            JOptionPane.showMessageDialog(rootPane, "Service Confirmed and payment made.");
            if(check==0){
                System.out.print("ERROR");
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally{
            UserCardSwipe ucs= new UserCardSwipe(pronum);
            ucs.setVisible(true);
            f1.setVisible(false);
        }
    }                                          
    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton confirmbtn;
        private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   

    
}
