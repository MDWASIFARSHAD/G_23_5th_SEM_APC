package com.Hibernate_Project_G023;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Answer;
import Entity.Question;

public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
	       cf.configure("hiber.cfg.xml");
	       SessionFactory sf = cf.buildSessionFactory();
	       
	       Question q = new Question();
	       q.setqId(1);
	       q.setQuestion("What is Java");
	       
	       Answer a = new Answer();
	       a.setaId(101);
	       a.setAnswer("Java is programming language");
	       
	       q.setAnswer(a);
	       
	       
	       Session session = sf.openSession();
	       session.beginTransaction();
	
	       
	       session.save(a);
	       session.save(q);
	       session.getTransaction().commit();
	       session.close();
	       
	       
	}
	       

}
