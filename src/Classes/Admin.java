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

class Admin extends Person{
    public Admin(String username, String password){
        super(username, password);
    }
    
    public List getAll() {
        List<Admin> obj = new ArrayList<>();
        Connection conn = null;
        String url = "jdbc:mysql://localhostL3306/rest";
        String userName = "root";
        String pass = "admin@123";
        try {
            conn = DriverManager.getConnection(url, userName, pass);
            String query = 
                    "";
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return obj;
    }
}
