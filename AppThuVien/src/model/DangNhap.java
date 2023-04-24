/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Dao.*;

/**
 *
 * @author AD
 */
public class DangNhap {
    private String Username,Pass,Confirm;

    public DangNhap() {
    }

    public DangNhap(String Username, String Pass, String Confirm) {
        this.Username = Username;
        this.Pass = Pass;
        this.Confirm = Confirm;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getConfirm() {
        return Confirm;
    }

    public void setConfirm(String Confirm) {
        this.Confirm = Confirm;
    }
    
}
