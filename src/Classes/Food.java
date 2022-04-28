package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Food implements Item {
    private String name;
    private float price;
    
    public Food (String n, float p){
        name = n;
        price = p;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public int save() { 
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rest";
        String userName = "root";
        String password = "admin@123";
        try{
            conn = DriverManager.getConnection(url, userName, password);
            
            String query = 
                    "insert into rest.food_items(type, price, name) values(\"Food\", " + this.price + ", \""  + this.name + "\");";
            
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
    
 public List getAll() {
        List<Food> obj = new ArrayList<>();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rest";
        String userName = "root";
        String password = "admin@123";
        try{
            conn = DriverManager.getConnection(url, userName, password);
            
            String query = 
                    "select * from rest.food_items where type=\"Food\";";
            
            Statement stm = conn.createStatement();
            
            ResultSet result = stm.executeQuery(query);
            
            while ( result.next() ) {
                Food bev = new Food(result.getString(4), Float.parseFloat(result.getString(3)));
                obj.add(bev);
            }
            
//            stm.execute(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Food.class.getName()).log(Level.SEVERE, null, ex);
            }
            return obj;
        }
    }

}
