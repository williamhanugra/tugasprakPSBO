/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.Asprak;
import model.Student;
import view.StudentView;

/**
 *
 * @author student
 */
public class StudentController {
    private Asprak model;
    private StudentView view;

    public StudentController(Asprak model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);		
    }

    public String getStudentName(){
        return model.getName();		
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);		
    }

    public String getStudentRollNo(){
        return model.getRollNo();		
    }
    
    public Date getStudentBirthDate() {
        return model.getBirthDate();
    }
    
    public void setStudentBirthDate(Date tglLahir) {
        model.setBirthDate(tglLahir);
    }

    /*public void updateView(){				
        view.printStudentDetails(model);
    }*/
    
    //Just For Asprak
    public void setAsprakMatkul(String matkul) {
        model.setMatkul(matkul);
    }
    
    public Date getAsprakJamPraktikum() {
       return model.getJamPraktikum();
    }
    
    public void updateAsprakView() {
        view.printAsprakDetails(model);
    }
}
