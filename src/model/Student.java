package model;

public class Student {

	String name;
	String address;
	Payment payment;

	public Student(String name, String address, Payment payment) {
		super();
		this.name = name;
		this.address = address;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", payment=" + payment + "]";
	}

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
