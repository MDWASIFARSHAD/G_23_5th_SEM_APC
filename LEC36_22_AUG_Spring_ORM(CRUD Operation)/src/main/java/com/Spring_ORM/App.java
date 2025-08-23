package com.Spring_ORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import Dao.StudentDao;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
    	StudentDao studentdao=(StudentDao) app.getBean("studentdao");
         HibernateTemplate h=(HibernateTemplate) app.getBean("hibernateTemplate");
    	
//    	Student s= new Student();
//    	s.setSid(1);
//    	s.setName("wasif");
//    	
//    	studentdao.insert(s);
         
         
//        Student s1= h.get(Student.class, 2);
//        s1.setName("Harsh");
//        studentdao.update(s1);
         
//         Student s3=h.get(Student.class, 3);
//         studentdao.delete(s3);
         
         Student s4=studentdao.fetch();
         System.out.println(s4.getSid()+"  "+s4.getName());
         
         
         List<Student> s5= studentdao.fetchAll();
         for(Student s:s5)
         {
        	 System.out.println(s.getSid()+"  "+ s.getName());
         }
         
        
        
    	
    	
    	   
    	
    	
    }
}
