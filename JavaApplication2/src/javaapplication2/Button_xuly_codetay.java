/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author AD
 */
public class Button_xuly_codetay extends JFrame implements ActionListener{
    JButton okButton, exitButton, cancelButton;
    public Button_xuly_codetay(){
        creatAndshow();
    }
    private void creatAndshow() {
        okButton = new JButton("OK");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        
        setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
        okButton.setMnemonic(KeyEvent.VK_O);// phím tắt
        okButton.setToolTipText("Click vào nút ok để tiếp tục");
        
        this.add(exitButton);
        exitButton.setActionCommand("Exit");
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("Click vào nút Exit để dừng");
        
        
        this.add(cancelButton);
        cancelButton.setActionCommand("Cancel"); //kiểm tra cụng từ khóa có hay không;
        cancelButton.addActionListener(this); //bắt sự kiện, bắt lỗi
        cancelButton.setMnemonic(KeyEvent.VK_C);
        cancelButton.setToolTipText("Click vào nút Cancel để dừng");
        
        this.setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Button_xuly_codetay();
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane, "Bạn vừa nhắn nút ok");
        if("Exit".equals(e.getActionCommand()))
            System.exit(0);
        if("Cancel".equals(e.getActionCommand()))
            JOptionPane.showConfirmDialog(rootPane, "Ban muốn chắc muốn hủy bỏ không");
    }
}
