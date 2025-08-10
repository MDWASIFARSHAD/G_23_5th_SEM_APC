package com.Spring_core_java_G_23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student s = context.getBean(Student.class);

        System.out.println(s.getId() + "  " + s.getName() + "  " + s.getCourse() + "  " + s.getCourseAndTrainer());
//        System.out.println(s.getAdd().getCity());
    }
}
