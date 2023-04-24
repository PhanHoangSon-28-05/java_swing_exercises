/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class DataValidator {
    public static void validateEmpty(JTextField field/*kiểm tra trường
            được chuyền vào*/, StringBuilder  sb, String errorMessage){/*Kiểm tra dữ liệu vào rỗng hay k*/
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        
        }else{
            field.setBackground(Color.WHITE);
        }
    }
    public static void validateEmpty(JPasswordField field/*kiểm tra trường
             mật khẩu được chuyền vào*/, StringBuilder  sb, String errorMessage){/*Kiểm tra dữ liệu vào rỗng hay k*/
        String password = new String(field.getPassword());
         if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        
        }else{
            field.setBackground(Color.WHITE);
        }
    }
}
