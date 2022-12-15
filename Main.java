/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm2_qlsv;

import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Main {
   public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentMng studentManager = new StudentMng();
        String id  ;
        
 
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1" -> studentManager.add();
            
            case "2" -> {
                id = studentManager.inputId();
                studentManager.edit(id);
                }
            case "3" -> {
                id = studentManager.inputId();
                studentManager.delete(id);
                }
            case "4" -> studentManager.sortStudentByGPA();
            case "5" -> studentManager.sortStudentByName();
            //case "6" -> studentManager.sortStudentByGrade();
            case "7" -> studentManager.show();
            case "0" -> {
                System.out.println("exited!");
                exit = true;
                }
            default -> System.out.println("invalid! please choose action in below menu:");
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("|---------|Function|---------");
        System.out.println("| [1]. New Student.");
        System.out.println("| [2]. Edit Student (ID).");
        System.out.println("| [3]. Delete Student (ID).");
        System.out.println("| [4]. Student's GPA in order.");
        System.out.println("| [5]. Student's name in order.");
        System.out.println("| [6]. Student's Grade.");
        System.out.println("| [7]. Show student.");
        System.out.println("| [0]. Exit.");
        System.out.println("|-----------------------------");
        System.out.print("Function number: ");
    }
}
