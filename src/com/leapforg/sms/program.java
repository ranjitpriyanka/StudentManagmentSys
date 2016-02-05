/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.sms;
import com.leapforg.sms.dao.StudentDAO;
import com.leapforg.sms.entity.Student;
import com.leapforg.sms.impl.StudentDAOImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author Priyanka
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAO studentDAO=new StudentDAOImpl(new ArrayList<>());

        //StudentDAO studentDAO=new StudentDAOImpl(new Vector<>());
        //StudentDAO studentDAO=new StudentDAOImpl();        

        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("1. Add Student");
            System.out.println("2.Show All Student");
            System.out.println("3.Search by id");
            System.out.println("4.Exit");
            System.out.println("Enter your choice 1-4");
        
        switch(input.nextInt()){
            case 1:
                while(true){
                Student student=new Student();
                System.out.println("enter id");
                student.setId(input.nextInt());
                
                System.out.println("enter FirstNAme");
                student.setFirstname(input.next());
                
                System.out.println("enter LatName");
                student.setLastname(input.next());
                
                System.out.println("enter email");
                student.setEmail(input.next());
                
                System.out.println("Conatctno");
                student.setContactNo(input.next());
                
                System.out.println("enter status");
                student.setStatus(input.nextBoolean());
                studentDAO.insert(student);
        
                    System.out.println("Do you want to continue?");
                    if(input.next().equalsIgnoreCase("n")){
                        break;
                    }
                }  
                
            case 2:
                /* studentDAO.getAll().forEach((s -> {
                System.out.println(s);
                }));
                System.out.println("Press Any key to continue");
                
                input.next();*/
                
                studentDAO.getAll().forEach((s->{
                    System.out.println(s);
                }));
                System.out.println("Prss Any key to continue");
                input.next();          
                break;
            case 3:
                
                break;
            case 4:
                System.exit(0);
                break;
                
                
        }
            
        }
        
/**
 
         
// TODO code application logic here
    //Student std=new Student(1, "Arun", "XYZ","CYS@gmail.com","6999999", true);
    
    //Student[] stdlist=new Student[10];
    
    List<Student> studentlist=new ArrayList<Student>();
    studentlist.add(new Student(1, "Arun", "XYZ","CYS@gmail.com","6999999", true));
    studentlist.add(new Student(2, "Arun", "XYZ","CYS@gmail.com","6999999", true));

    
    //System.out.println("length of array"+stdlist.length);
    System.out.println("lngth of generic collection" + studentlist.size());
    
    //System.out.println(studentlist.get(1));
    
    /**Student s=studentlist.get(1);
    if(s!=null){
        System.out.println(s.toString());
    }
    */
    //System.out.println(studentlist.get(1).getFirstname());
    
    //studentlist.remove(0);
    //System.out.println("lngth of generic collection" + studentlist.size());
    
    /**for(int i=0; i<studentlist.size(); i++){
        System.out.println(studentlist.get(i));
    }
       */       
    //System.out.println(std);
    
 /*   for(Student s:studentlist){
        System.out.println(s.getFirstname());
    }
    /**studentlist.forEach(s->){
        System.out.println(s);
}*/
    
  
 }
}
