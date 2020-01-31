package chocan;

import comp370.ProvideService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserCardSwipe extends javax.swing.JFrame {

    int provnum;
    public UserCardSwipe(int provnum) {
        this.provnum=provnum;
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        membertxt = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        providerLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Member Number");

        login.setText("Verify");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        providerLogout.setText("Logout");
        providerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(login)
                        .addGap(47, 47, 47)
                        .addComponent(resetbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(membertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(providerLogout)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(providerLogout)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(resetbtn))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        int memnum= Integer.parseInt(membertxt.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            //JOptionPane.showMessageDialog(rootPane, memnum);
            ResultSet rs= st.executeQuery("select * from members where mem_number="+memnum);
            if(rs.next()){
                if(rs.getString("mem_suspended").matches("False")){
                JOptionPane.showMessageDialog(rootPane,"Validated");}
                else{
                    int inp=JOptionPane.showOptionDialog(rootPane, "Member Verified", "Verificcation", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                    if(inp==JOptionPane.OK_OPTION){
                       // ProvideService ps = new ProvideService();
                        
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Member does not exist");
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {
        membertxt.setText("");
    }

    private void providerLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        ProviderLogin p=new ProviderLogin();
        p.setVisible(true);
        setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(UserCardSwipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserCardSwipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserCardSwipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserCardSwipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField membertxt;
    private javax.swing.JButton providerLogout;
    private javax.swing.JButton resetbtn;
}
