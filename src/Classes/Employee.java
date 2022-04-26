/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author mural
 */
public class Employee extends User{
    String ECode;
    Employee(String e, String n, String u, String p)
    {
        ECode = e;
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
}
