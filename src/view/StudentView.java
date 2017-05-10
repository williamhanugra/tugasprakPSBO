/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Asprak;
import model.Student;

/**
 *
 * @author student
 */
public class StudentView {
    public void printStudentDetails(Student murid){
        System.out.println("Student: ");
        System.out.println("Name: " + murid.getName());
        System.out.println("Roll No: " + murid.getRollNo());
        System.out.println("Tanggal Lahir: " + murid.getBirthDate());
    }
    
    public void printAsprakDetails(Asprak aspr) {
        System.out.println("Asisten Praktikum: ");
        System.out.println("Name: " + aspr.getName());
        System.out.println("Roll No: " + aspr.getRollNo());
        System.out.println("Tanggal Lahir: " + aspr.getBirthDate());
        System.out.println("Mata Kuliah: " + aspr.getMatkul());
        System.out.println("Jam Praktikum: " + aspr.getJamPraktikum());
    }
}
