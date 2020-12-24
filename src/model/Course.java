package model;

import java.util.List;

public class Course {
	
	String courseName;
	
	List<Student> courseStudents;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getCourseStudents() {
		return courseStudents;
	}

	public void setCourseStudents(List<Student> courseStudents) {
		this.courseStudents = courseStudents;
	}

	public Course(String courseName, List<Student> courseStudents) {
		super();
		this.courseName = courseName;
		this.courseStudents = courseStudents;
	}
	
	

}
