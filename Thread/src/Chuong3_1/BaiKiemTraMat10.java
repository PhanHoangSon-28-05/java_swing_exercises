/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong3_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BaiKiemTraMat10 extends Thread{
    public static void main(String[] args) {
        Thread th1 = new Thread(){
            public void run(){
                for (int i = 65; i < 95; i++) {
                    System.err.println(i);
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BaiKiemTraMat10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        th1.start();
        
        Thread th2 = new Thread(){
            public void run(){
                for (int i = 65; i < 95; i++) {
                    System.err.println((char)i);
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BaiKiemTraMat10.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        th2.start();
    }
    
}
