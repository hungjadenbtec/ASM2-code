/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm2_qlsv;

import java.util.Comparator;
/**
 *
 * @author welcome
 */
public class StudentAP implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
