/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KienHang;


import java.io.*;
import KienHang.Stock;
/**
 *
 * @author SonHeo
 */
public class ObjectExampleWrite {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ObjectExampleWrite currenClass = new ObjectExampleWrite();
        
        String pName = currenClass.getClass().getPackage().getName();
        System.out.println(pName);
        
        String path = "./src/" + pName  + "/fileobject.dat";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stocks = {new Stock(1000, "CD ROM", 100.00, 20),
        new Stock(1002, "DRAW", 75.00, 30),
        new Stock(1003, "P4 Processor", 300.00, 100),
        new Stock(1004, "Canon jet", 80.00, 10),
        new Stock(1005, "HP Scanner", 75.00, 90)
        };
        oos.writeObject(stocks);
        oos.close();
    }
}
