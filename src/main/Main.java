package main;

import java.util.ArrayList;
import java.util.List;

import model.*;

/* git master com os branchs: course e payment */

public class Main {

	public static void main(String[] args) {

		Payment payment = new Payment("958,25");

		Student student = new Student("Cláudia", "Santa Maria", payment);

		Course course = new Course("História");

		List<Student> listStudents = new ArrayList<>();
		listStudents.add(student);

		List<Course> listCourses = new ArrayList<>();
		listCourses.add(course);

		School school = new School("Faculdade IESB", listStudents, listCourses);

		System.out.println("Escola: " + school.getName());

		school.getCourses().forEach(couse -> System.out.println("Curso: " + course.getName()));

		school.getStudents()
				.forEach(st -> System.out.println(
						"Aluno: " + st.getName() 
						+ ", Endereço: " + st.getAddress()
						+ "\nPagamento: " + st.getPayment().getValue()));

	}

}
