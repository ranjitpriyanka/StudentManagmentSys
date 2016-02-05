/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.sms.impl;

import com.leapforg.sms.dao.StudentDAO;
import com.leapforg.sms.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priyanka
 */
public class StudentDAOImpl implements StudentDAO{
    
    private List<Student> studentlist;
    
    public StudentDAOImpl(List<Student> studentList){
        this.studentlist=studentList;
    }
    
    /* public StudentDAOImpl(){
    studentlist=new ArrayList<>();
    }
    */
    @Override
    public void insert(Student s) {
    studentlist.add(s);
    }

    @Override
    public void upadate(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
    for(Student s:studentlist){
        if(s.getId()==id){
            studentlist.remove(s);
            return true;
        }
    }
    return false;
    }
    
    @Override
    public Student getById(int id) {
    for(Student s:studentlist){
        if(s.getId()==id){
            return s;
        }
    }  
    return null;
    }

    @Override
    public List<Student> getAll() {
        return studentlist;
    }
    
    
}
