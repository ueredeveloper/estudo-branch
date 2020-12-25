package model;

import java.util.List;

public class School {

	// attributes
	// student name
	String name;
	// list with students
	List<Student> students;
	// list with courses
	List<Course> courses;

	// constructor
	public School(String name, List<Student> students, List<Course> courses) {
		super();
		this.name = name;
		this.students = students;
		this.courses = courses;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	// getters and setters

}
