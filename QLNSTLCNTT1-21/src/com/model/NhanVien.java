/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author SonHeo
 */
public class NhanVien {
    String id;
    String first;
    String last;
    int age;

    public NhanVien() {
    }

    public NhanVien(String id, String first, String last, int age) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    @Override
    public String toString(){
        
        return String.format("ID: %s, Firstname: %s, Lastname: %s, Age: %d",
                id,first,last,age);      
    }
}