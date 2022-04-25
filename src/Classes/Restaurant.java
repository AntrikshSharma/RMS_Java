/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author mural
 */
public class Restaurant {
    String name, address, owner;
    public Restaurant(String name,String address,String owner)
    {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }
    String getName()
    {
        return this.name;
    }
    String getAddress()
    {
        return this.address;
    }
    String getOwner()
    {
        return this.owner;
    }
}
