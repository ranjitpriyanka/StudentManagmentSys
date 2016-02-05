/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.sms.dao;

import com.leapforg.sms.entity.Student;
import java.util.List;

/**
 *
 * @author Priyanka
 */
public interface StudentDAO {
    //public abstract :interface
    
    void insert(Student s);
    void upadate(Student s);
    boolean delete(int id);
    Student getById(int id);
    List<Student> getAll();
}
