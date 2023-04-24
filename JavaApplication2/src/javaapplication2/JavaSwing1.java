/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AD
 */
public class JavaSwing1 extends JFrame{
//    private JFrame frame;
    JButton button;
    
    public JavaSwing1(){
        creatAndShow();
    }
    public void creatAndShow(){
        button = new JButton("Nút");
//        frame = new JFrame("Phan Hoàng Sơn");
//        setSize(400,300);
        this.setLocationRelativeTo(null);//ra giữa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.setLayout(new FlowLayout());//căng hết lên trên
        this.pack();//căn vừa đủ khung chứa
        setVisible(true);
    }
    public static void main(String[] args) {
        new JavaSwing1();
    }
}
