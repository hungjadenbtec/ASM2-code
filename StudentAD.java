/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm2_qlsv;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author welcome
 */
public class StudentAD {
   private static final String STUDENT_FILE = "student.txt";
 
    /**
     * save list student to file
     * 
     * @param studentList: list student to save
     */
    public void write(List<Student> studentList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(STUDENT_FILE));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
 
    /**
     * read list student from file
     * 
     * @return list student
     */
    public List<Student> read() {
        List<Student> studentList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(STUDENT_FILE));
            ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return studentList;
    }
 
    /**
     * close input stream
     * 
     * @param is: input stream
     */
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
 
    /**
     * close output stream
     * 
     * @param os: output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
            }
        }
    }
}
