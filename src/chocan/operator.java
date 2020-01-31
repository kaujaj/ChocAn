/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocan;

/**
 *
 * @author Kaustubh Jaju
 */
import java.sql.*;
public class operator {
    Connection con;
    Statement st;
    public operator(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/comp370","KJ","1996");
            st= con.createStatement();
        }
        catch(Exception e){
            
        }
    }
    protected void add_member(){//Add a new member
        try{
            st.execute("insert into members values(");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    protected void modify_member(){//Modify member Details
        try{
            st.executeUpdate("update members set"+"where mem_number=");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    protected void remove_member(){//remove a member
        try{
            st.execute("delete * from members where mem_number=");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    protected void add_provider(){//add a provider
        try{
            st.execute("insert into provider values(");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    protected void modify_provider(){//modify provider details
        try{
            st.executeUpdate("update provider set"+"where provider_num=");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    protected void remove_provider(){//remove a provider
        try{
            st.execute("delete * from provider where provider_num=");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
