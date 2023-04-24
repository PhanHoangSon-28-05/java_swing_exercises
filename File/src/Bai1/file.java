/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.*;

/**
 *
 * @author SonHeo
 */
public class file {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        file currenClass = new file();
        
        String pName = currenClass.getClass().getPackage().getName();
        System.out.println(pName);
        
        String path = "./src/" + pName  + "/file1.dat";
        FileOutputStream fos = new FileOutputStream(path);
        String text =  "Con ga le te nay thi ai oi";
        byte[] textAsByte = text.getBytes();
        fos.write(textAsByte);

        
        FileInputStream fis = new FileInputStream(path);
        int c;
        while((c = fis.read()) != -1){
            System.err.print((char) c);
        }
        fis.close();
    }
}
