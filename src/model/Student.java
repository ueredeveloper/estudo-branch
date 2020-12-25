package model;

public class Student {

  String name;
  String address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Student(String name, String address) {
    super();
    this.name = name;
    this.address = address;
  }

}
