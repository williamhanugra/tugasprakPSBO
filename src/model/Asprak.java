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
public class Asprak extends Student {
    private String matkul;
    private Date jampraktikum;
    
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    
    public String getMatkul() {
        return this.matkul;
    }
    
    public void setJamPraktikum(Date jamprak) {
        this.jampraktikum = jamprak;
    }
    
    public Date getJamPraktikum() {
        return jampraktikum;
    }
} 
