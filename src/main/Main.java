package main;

import java.util.ArrayList;
import java.util.List;

import model.*;

/* git master com os branchs: course e payment */

public class Main {

  public static void main(String[] args) {

    Student student = new Student ("Cláudia", "Santa Maria");
    Course course = new Course ("História");
    
    List<Student> listStudents = new ArrayList<>();
      listStudents.add(student);
     
    List<Course> listCourses = new ArrayList<>();
      listCourses.add(course);
    
    School school = new School (listStudents, listCourses);
    
    
    school.getCourses().forEach(couse -> 
      System.out.println(course.getCourseName())); 

  }

}
