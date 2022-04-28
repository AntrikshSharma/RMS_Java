package Classes;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends Person{
    public Admin(String username, String password){
        super(username, password);
    }
    
    public List getAll() {
        List<Admin> obj = new ArrayList<>();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rest";
        String userName = "root";
        String pass = "admin@123";
        try {
            conn = DriverManager.getConnection(url, userName, pass);
            String query = 
                    "SELECT * FROM rest.admins where username=\"" + getUsername() + "\"";
            
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            
            while( result.next() ){
                Admin admin;
                String username = result.getString(2);
                String password = result.getString(3);
                
                admin = new Admin(username, password);
                obj.add(admin);
            }
        }catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return obj;
    }
    
    public boolean isValid() throws SQLException {
        String username = getUsername();
        String password = getPassword();
        
        String url = "jdbc:mysql://localhost:3306/rest";
        String usr = "root";
        String dbPass = "admin@123";
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, usr, dbPass);
            String query = "select * from rest.admins where username=\"" + getUsername() + "\" and password=\"" + getPassword() + "\";";
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            
            while( result.next() ){
                String ussr = result.getString(2);
                String pass = result.getString(3);
                
                if (ussr.equals(getUsername()) && pass.equals(getPassword())) {
                    return true;
                }
            }
            
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return false;
    }
    public int save() { 
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rest";
        String userName = "root";
        String password = "admin@123";
        try{
            conn = DriverManager.getConnection(url, userName, password);
            
            String query = 
                    "insert into rest.admins(username, password) values(\"" + getUsername() + "\", \""  + getPassword() + "\");";
            
            Statement stm = conn.createStatement();

            stm.execute(query);
            
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public static void main(String args[]) {
        Admin admin = new Admin("Achyut", "admin12345");
        admin.save();
    }
}
