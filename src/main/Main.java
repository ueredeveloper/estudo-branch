package main;

import models.Student;

public class Main {

	public static void main(String[] args) {

		Student st = new Student("Jos�", "Rua dos Pinheiros");
		
		System.out.println("Nome: " + st.getName() + " Endere: " + st.getAddress());

	}

}
