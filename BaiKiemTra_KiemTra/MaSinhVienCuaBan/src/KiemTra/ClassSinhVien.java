/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra;

/**
 *
 * @author Admin
 */
public class ClassSinhVien {
    private String ID;
    private String Name;
    private String Age;

    public ClassSinhVien(String ID, String Name, String Age) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    
    
    
}
