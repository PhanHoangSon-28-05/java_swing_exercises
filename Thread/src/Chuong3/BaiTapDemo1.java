/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SonHeo
 */

public class BaiTapDemo1 extends Thread{
     public void run(){
        for (int i = 0; true ; i++) {
            System.err.println("Con Ga");
                
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        BaiTapDemo1 t1 = new BaiTapDemo1();
        t1.start();
        
        MyThread t2 = new MyThread();
        t2.start();
    }   
}
