package com.Spring_core_java_G_23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        Address address = new Address();
        address.setStreet("Chitkara");
        address.setCity("Rajpura");
        address.setState("Punjab");
        return address;
    }

    @Bean
    public Student student() {
        Student s = new Student();
        s.setId(1);
        s.setName("Wasif");
        s.setCourse(Arrays.asList("Java", "python", "C++"));

        Map<String, String> courseTrainerMap = new HashMap<>();
        courseTrainerMap.put("Java", "Wasif");
        courseTrainerMap.put("Python", "Harsh");
        courseTrainerMap.put("C++", "Rohit");

        s.setCourseAndTrainer(courseTrainerMap);
//        s.setAdd(address()); // Injecting address bean

        return s;
    }
}
