package com.Spring_Core_G_23_1;

import java.util.List;
import java.util.Map;

public class Student1 {
	
	private int sId;
	private String name;
	private List<String> course;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Map<String, String> getCourseAndTrainer() {
		return courseAndTrainer;
	}
	public void setCourseAndTrainer(Map<String, String> courseAndTrainer) {
		this.courseAndTrainer = courseAndTrainer;
	}
	private Map<String,String> courseAndTrainer;

}
