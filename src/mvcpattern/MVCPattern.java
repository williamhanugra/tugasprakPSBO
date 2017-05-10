/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern;

import controller.StudentController;
import java.util.Date;
import model.Asprak;
import model.Student;
import view.StudentView;

/**
 *
 * @author student
 */
public class MVCPattern {

    /**
     * @param args the command line arguments
     */
    private static Asprak retriveAsprakFromDatabase(){
        Date tgl = new Date("02/15/1997");
        Date jam = new Date("05/10/2017 14:00");
        Asprak asp = new Asprak();
        asp.setName("William");
        asp.setRollNo("5");
        asp.setBirthDate(tgl);
        asp.setMatkul("Komputasi Numerik");
        asp.setJamPraktikum(jam);
        
        return asp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //fetch student record based on his roll no from the database
        Asprak model  = retriveAsprakFromDatabase();

      //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateAsprakView();

      //update model data
        controller.setStudentName("John");

        controller.updateAsprakView();
    }
    
}
