package com.Hibernate_Project_G023;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Hello;
import Entity.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cf = new Configuration();
       cf.configure("hiber.cfg.xml");
       SessionFactory sf = cf.buildSessionFactory();
       
       Student student = new Student(1,"wasif","6000");
       
       Hello h = new Hello("chitkara");
       
       
       Session s = sf.openSession();
       s.beginTransaction();
//       s.save(student);
       s.save(s);
       
      Student s1= s.get(Student.class, 1);
      System.out.println(s1.getRollNo()+"  "+s1.getName()+"  "+ s1.getStudentSalary());
       s.getTransaction().commit();
       s.close();
       
    }
}
