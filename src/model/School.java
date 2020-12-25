package model;

import java.util.List;

public class School {
  
  List<Student> students;
  List<Course> courses;
  
  //constructor 
  public School(List<Student> students, List<Course> courses) {
    super();
    this.students = students;
    this.courses = courses;
  }

  //get set courses 
  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }
  
  // get set students 
  public List<Student> getStudents() {
    return students ;
  }

  public void setStudents(List<Student> courseStudents) {
    this.students = students;
  }

}
