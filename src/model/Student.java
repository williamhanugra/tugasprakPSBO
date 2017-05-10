/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author student
 */
public class Student {
    protected String rollNo;
    protected String name;
    protected Date birthDate;
   
    public String getRollNo() {
          return rollNo;
    }
   
    public void setRollNo(String rollNo) {
          this.rollNo = rollNo;
    }
   
    public String getName() {
          return name;
    }
   
    public void setName(String name) {
          this.name = name;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(Date tglLahir) {
        this.birthDate = tglLahir;
    }
}
