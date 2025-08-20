package com.Spring_Core_G23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring_Core_G_23_1.Student1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
//    	
//    	 Student s=(Student) app.getBean("student");
//    	 
//    	 
//    	 System.out.println(s.getCourse()  +" "+ s.getName()+" "+ s.getsId());
//    	 
//    	 
//    	Address a= (Address)app.getBean("address");
//   
//    	System.out.println(a.getStreet() +"   "+ a.getCity()  +"   "+ a.getState());
    	
    	ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
    	
//    	Address add =(Address) app.getBean("address");
    	
    	
    	Student1 s1 = (Student1) app.getBean("student1");
    	System.out.println(s1.getName()+"  "+s1.getsId()+"  "+s1.getCourse()+"   "+s1.getCourseAndTrainer());

    }
}
