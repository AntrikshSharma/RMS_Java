/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author mural
 */
class Admin extends User{
    Admin(String n, String u, String p)
    {
        Name = n;
        Username = u;
        Password = p;
    }
    int login()
    {
        String curruser, currpassword;
        curruser = this.getUserName();
        currpassword = this.getPassword();
        /*
        Check if username and password exists.
        */
        return 0;
    }
    int createAdmin(String newname, String newuser, String newpass)
    {
        String curruser, currpassword;
        curruser = this.getUserName();
        currpassword = this.getPassword();
        /*
        Insert into database.
        */
        return 0;
    }
    int removeAdmin(String user)
    {
        String curruser, currpassword;
        curruser = this.getUserName();
        currpassword = this.getPassword();
        /*
        Remove from database.
        */
        return 0;
    }
    int createEmployee(String newcode, String newname, String newuser, String newpass)
    {
        String curruser, currpassword;
        curruser = this.getUserName();
        currpassword = this.getPassword();
        /*
        Insert into database.
        */
        return 0;
    }
    int removeEmployee(String user)
    {
        String curruser, currpassword;
        curruser = this.getUserName();
        currpassword = this.getPassword();
        /*
        Remove from database.
        */
        return 0;
    }
}
