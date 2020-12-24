package main;

import java.util.ArrayList;
import java.util.List;

import models.Course;
import models.Payment;
import models.Student;

/* git master com os branchs: course e payment */

public class Main {

	public static void main(String[] args) {

		Student st = new Student("José", "Rua dos Pinheiros");

		List<Student> listStudents = new ArrayList<>();
		
		listStudents.add(st);
		
		
		Course cr = new Course("Matemática", listStudents );
		
		Payment pay = new Payment("3000" , st);
		
		
		System.out.println(cr.getCourseName());
		
		listStudents.forEach( student -> { System.out.println(student.getName());});
		
		System.out.println("Pagamento: " + pay.getValue() + " do estudante: " + pay.getStudent().getName());


	}

}
