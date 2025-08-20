package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_details")
public class Student {
	@Id
	@Column(name = "Student_rollNo")
	private int rollNo;
	
	private Hello h;
	
	public Student(int rollNo, Hello h, String name, String studentSalary) {
		super();
		this.rollNo = rollNo;
		this.h = h;
		this.name = name;
		this.studentSalary = studentSalary;
	}

	public Hello getH() {
		return h;
	}

	public void setH(Hello h) {
		this.h = h;
	}

	@Column(name = "Student_name")
	private String name;
	
	@Column(name = "student_salary")
	private String studentSalary;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String studentSalary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.studentSalary = studentSalary;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentSalary() {
		return studentSalary;
	}

	public void setStudentSalary(String studentSalary) {
		this.studentSalary = studentSalary;
	}
	

}
