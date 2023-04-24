/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong3_1;

/**
 *
 * @author Admin
 */
public class Customer {
    int TaiKhoan = 1000;
    public synchronized void withdraw(int m){
        System.out.println("Bạn đang rút tiền");
        if (TaiKhoan < m) {
            System.err.println("Không đủ tiền để rút");
            try {
                wait();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        TaiKhoan = TaiKhoan - m;
        System.err.println("Bạn đã rút tiền thành công  !!!");
    }
    synchronized void deposit(int m){
        System.err.println("Bạn đang rút tiền ...");
        TaiKhoan = TaiKhoan + m;
        System.err.println("Nạp tiền thành công !!!");
        notify();
    }
    public static void main(String[] args) {
        final Customer c = new Customer();
        Thread th1 = new Thread(){
            public void run(){
                c.withdraw(1500);
            }
        };
        th1.start();
        Thread th2 = new Thread(){
            public  void run(){
                c.deposit(2000);
            }
        };
        th2.start();
    }
}
