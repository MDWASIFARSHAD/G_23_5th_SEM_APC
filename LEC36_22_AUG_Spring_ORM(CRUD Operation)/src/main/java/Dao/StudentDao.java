package Dao;

import Entity.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;


public class StudentDao {
	
	private HibernateTemplate hibernatetemplate;
	
	@Transactional(propagation=Propagation.REQUIRED)
	 public void insert(Student student)
	 {
		 hibernatetemplate.save(student);
	 }
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(Student student)
	{
		hibernatetemplate.update(student);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Student student)
	{
		hibernatetemplate.delete(student);
	}
	
	
	public List<Student> fetchAll()
	{
		List<Student> s = hibernatetemplate.loadAll(Student.class);
		return s;
	}
	
	
	public Student fetch()
	{
	   Student s=	hibernatetemplate.get(Student.class, 1);
	   return s;
			   
	}
 	
	
	

}
