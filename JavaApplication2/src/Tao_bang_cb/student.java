/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tao_bang_cb;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author AD
 */
public class student  implements  Serializable{
    private String name, address, id,email,phone;
    private float mark;
    private Date date; //dd/mm/yyyy
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getId(){
        return id;
    } 
    public void setId(String id){
        this.id = id;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public float getMark(){
        return mark;
    }
    public void setMark(float mark){
        this.mark = mark;
    }
    
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
 
}
