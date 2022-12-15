/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm2_qlsv;

import java.io.Serializable;

/**
 *
 * @author welcome
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private byte age;
    private String address;
    private float gpa;
    private String pga;
    
    
    public Student() {
    }
 
    public Student(String id, String name, byte age, 
            String address, float gpa, String pga) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
        this.pga = pga;
    }
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public byte getAge() {
        return age;
    }
 
    public void setAge(byte age) {
        this.age = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public float getGpa() {
        return gpa;
    }
 
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getPga() {
        return pga;
    }

    public void setPga(String pga) {
        this.pga = pga;
    }
    
}
