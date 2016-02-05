/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.sms.entity;

/**
 *
 * @author Priyanka
 */
public class Student {
    private int id;
    private String firstname, lastname, email, contactNo;
    private boolean status;

    public Student() {
    }

    
    public Student(int id, String firstname, String lastname, String email, String contactNo, boolean status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contactNo = contactNo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", contactNo=" + contactNo + ", status=" + status + '}';
    }
    
}
