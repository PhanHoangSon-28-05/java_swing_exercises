/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KienHang;

import java.io.*;
/**
 *
 * @author SonHeo
 */
public class Inra {
    public static void main(String[] args) {
        FileDescriptor fis = null;
        ObjectInputStream ois = null;
        
        
        try {
        ObjectExampleWrite currenClass = new ObjectExampleWrite();
        
        String pName = currenClass.getClass().getPackage().getName();
        System.out.println(pName);
        
        String path = "./src/" + pName  + "/fileobject.dat";
            fis = new FileInputStream(path);
        } catch (Exception e) {
        }
    }
}
