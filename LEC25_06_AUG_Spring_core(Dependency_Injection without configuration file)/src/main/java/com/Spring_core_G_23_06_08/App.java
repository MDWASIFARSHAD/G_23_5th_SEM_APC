package com.Spring_core_G_23_06_08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */



@ComponentScan("com.Spring_core_G_23_06_08")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(App.class);
        Student s = (Student) app.getBean(Student.class);
        s.setId(2);
        s.setName("wasif");
        System.out.println(s.getId());
        System.out.println(s.getName());
        
                  
    }
}
