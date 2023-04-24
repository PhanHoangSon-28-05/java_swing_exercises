/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;


import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MessageDialogHelper {
    public static void showMessageDialog(Component parent,String content/*nội dung*/, String title/*Tiêu đề*/){
            JOptionPane.showMessageDialog(parent,content, title,
                    JOptionPane.INFORMATION_MESSAGE);
            
    }
    public static void showErrorDialog(Component parent,String content, String title){
            JOptionPane.showMessageDialog(parent, content, title,
                    JOptionPane.ERROR_MESSAGE);
            
    }
    public static int showConfirmDialog(Component parent,String content, String title){
            int chose = JOptionPane.showConfirmDialog(parent, content, title,
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE/*câu hỏi*/);
            return chose;
    }
}
