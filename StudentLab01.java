/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentlab01;

public class StudentLab01 {
    int id;
    String name;
    String email;
    double cgpa;
    String hometown;
   
    void display()
    {

     System.out.println("ID: "+id);
     System.out.println("Name: "+name);
     System.out.println("Email: "+email);
     System.out.println("CGPA: "+cgpa);
     System.out.println("Home Town: "+hometown);
     
    }
    public static void main(String[] args) {
        StudentLab01 sl=new StudentLab01();
        sl.id=211014025;
        sl.name="Adrita";
        sl.email="tasnim.jannat.cse@ulab.edu.bd";
        sl.cgpa=3.26;
        sl.hometown="Dhaka";
       
        StudentLab01 s2=new StudentLab01();
        s2.id=102;
        s2.name="Tamim";
        s2.email="tamim@gmail.com";
        s2.cgpa=3.45;
        s2.hometown="Khulna";
       
        sl.display();
       
        System.out.println("ID: "+s2.id);
        System.out.println("Name: "+s2.name);
        System.out.println("Email: "+s2.email);
        System.out.println("CGPA: "+s2.cgpa);
        System.out.println("Home Town: "+s2.hometown);
       
       
    }
   
   
}
