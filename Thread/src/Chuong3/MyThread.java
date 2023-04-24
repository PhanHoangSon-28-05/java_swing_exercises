/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3;

/**
 *
 * @author SonHeo
 */
public class MyThread extends Thread{
        public void run(){
            for (int i = 0; true ; i++) {
                System.err.println(i);
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        }
    }
//public class MyThread extends Thread{
//    public void run(){
//        for (int i = 0; true ; i++) {
//            System.err.println(i);
//                
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                break;
//            }
//        }
//    }
//    public static void main(String[] args) {
//         MyThread t1 = new  MyThread();
//        t1.start();
//        
//        MyThread t2 = new MyThread();
//        t2.start();
//    } 
//}
