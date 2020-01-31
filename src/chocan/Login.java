package chocan;
import java.sql.*;
public class Login {
    String pronum,passwd;//Variables which will store the login credentials for this session. pronum= provider number, passwd= password.
    public Login(){

    }
    public void Signin(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("select * from members");
            if(rs.next()){
                System.out.println(rs.getString("mem_name"));
            }
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
