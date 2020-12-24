package main;

import java.util.ArrayList;
import java.util.List;

import course.Course;
import models.Student;

public class Main {

	public static void main(String[] args) {

		Student st = new Student("José", "Rua dos Pinheiros");

		List<Student> listStudents = new ArrayList<>();
		
		listStudents.add(st);
		
		
		Course cr = new Course("Matemática", listStudents );
		
		
		System.out.println(cr.getCourseName());
		
		listStudents.forEach( student -> { System.out.println(student.getName());});


	}

}
