package comp370;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProvideService extends javax.swing.JFrame {//Provider enter the details of the service provided
int pronum;
int memnum;  
    public ProvideService(int pronum, int memnum) {
        this.pronum = pronum;
        this.memnum = memnum;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutbtn = new javax.swing.JButton();
        servicesprovidedbtn = new javax.swing.JButton();
        servicenamelbl = new javax.swing.JLabel();
        servicenametxt = new javax.swing.JTextField();
        servicedatelbl = new javax.swing.JLabel();
        servicedatatxt = new javax.swing.JTextField();
        bookservicebtn = new javax.swing.JButton();
        lockbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        servicesprovidedbtn.setText("Provider Directory");
        servicesprovidedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesprovidedbtnActionPerformed(evt);
            }
        });

        servicenamelbl.setText("Service Number");

        servicedatelbl.setText("Service Date");

        servicedatatxt.setText("MM-DD-YYYY");

        bookservicebtn.setText("Book Service");
        bookservicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookservicebtnActionPerformed(evt);
            }
        });

        lockbtn.setText("Cancel");
        lockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicesprovidedbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(servicenamelbl)
                        .addComponent(servicedatelbl))
                    .addComponent(bookservicebtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(servicenametxt)
                            .addComponent(servicedatatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutbtn)
                    .addComponent(servicesprovidedbtn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicenamelbl)
                    .addComponent(servicenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicedatelbl)
                    .addComponent(servicedatatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookservicebtn)
                    .addComponent(lockbtn))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void servicesprovidedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesprovidedbtnActionPerformed
        ServicesProvided sp=new ServicesProvided();//Displays provider Directory
    }//GEN-LAST:event_servicesprovidedbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        ProviderLogin pl=new ProviderLogin();//Logsout provider
        pl.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void lockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockbtnActionPerformed
        //Cancels this service
        UserCardSwipe usp=new UserCardSwipe(pronum);
    }//GEN-LAST:event_lockbtnActionPerformed

    private void bookservicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookservicebtnActionPerformed
        int sercode;//Takes Provider to the verify service page where he can view the summary and confirm the service.
        String date= servicedatatxt.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            sercode= Integer.parseInt(servicenametxt.getText());
            ResultSet rs= st.executeQuery("select * from provider_directory where Service_code="+sercode);
            if(rs.next()){
                if(rs.getInt("Provider_number")==pronum){
                    VerifyService vs= new VerifyService(pronum,memnum,sercode,date);
                    vs.setVisible(true);
                    setVisible(false);
                }
                else{
                    System.out.println(pronum+"here");
                }
            }
            else{
                System.out.println(pronum);
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }//GEN-LAST:event_bookservicebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProvideService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProvideService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProvideService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProvideService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookservicebtn;
    private javax.swing.JButton lockbtn;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextField servicedatatxt;
    private javax.swing.JLabel servicedatelbl;
    private javax.swing.JLabel servicenamelbl;
    private javax.swing.JTextField servicenametxt;
    private javax.swing.JButton servicesprovidedbtn;
    // End of variables declaration//GEN-END:variables
}
