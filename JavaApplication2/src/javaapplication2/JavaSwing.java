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
public class JavaSwing {
    private JFrame frame;
    JButton button;
    
    public JavaSwing(){
        creatAndShow();
    }
    public void creatAndShow(){
        button = new JButton("Nút");
        frame = new JFrame("Phan Hoàng Sơn");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);//ra giữa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setLayout(new FlowLayout());//căng hết lên trên
        frame.pack();//căn vừa đủ khung chứa
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JavaSwing();
    }
}
