/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KienHang;

import java.io.Serializable;

/**
 *
 * @author SonHeo
 */
public class Stock implements Serializable{
    private int id;
    private  String desc;
    private double  price;
    private int quanlity;

    public Stock(int id, String desc, double price, int quanlity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quanlity = quanlity;
    }
    
    public String Tótring(){
        return (id+" "+desc+" "+price+" "+quanlity);
    }
}
