package payment;

import models.Student;

public class Payment {
	
	String value;
	
	Student student;
	
	public Payment(String value, Student student) {
		super();
		this.value = value;
		this.student = student;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
