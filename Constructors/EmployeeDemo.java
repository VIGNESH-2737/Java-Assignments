//package com.vignesh.zohotask;

import java.util.*;


//package com.vignesh.zohotask;

public class EmployeeDemo {
	
	public static void main(String[] args) {
	Employee Vignesh = new Employee(1, "Vignesh", "Dhayalan", "dhayalvignesh@gmail.com", "6382740083",
			"ZSGS", "Trainee", 0, "6th-Feb-2025", "Active");
			
    Employee elon = new Employee(2, "Elon", "Musk", "elon.musk@tesla.com", "9876543210",
                "ZSGS", "Trainee", 1000000, "2004-04-01", "Active");

Employee sundar = new Employee(3, "Sundar", "Pichai", "sundar.pichai@google.com", "9876543211",
                "Zoho", "Trainee", 950000, "2015-10-02", "Active");

Employee satya = new Employee(4, "Satya", "Nadella", "satya.nadella@microsoft.com", "9876543212",
                "ZSGS", "Trainee", 900000, "2014-02-04", "Active");

Employee mark = new Employee(5, "Mark", "Zuckerberg", "mark.zuckerberg@meta.com", "9876543213",
                "Zoho", "Trainee", 850000, "2004-02-04", "Active");

Employee anne = new Employee(9, "Anne", "Hathaway", "anne.hathaway@hollywood.com", "9876543217",
                "ZSGS", "Trainee", 480000, "1999-05-03", "Active");

Employee deepika = new Employee(11, "Deepika", "Padukone", "deepika.p@bollywood.com", "9876543219",
                "Zoho", "Trainee", 600000, "2006-12-15", "Active");

                
    Employee.printAll();

	
	//System.out.println(Vignesh.toString());	 
}
}


public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String department;
	private String designation;
	private double salary;
	private String joiningDate;
	private String status;
	
	private static List<Employee> employeeList = new ArrayList<>();
	
	public Employee() {}
	
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			String department, String designation, double salary, String joiningDate, String status) {
		//super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.status = status;
		
		employeeList.add(this);
	}
	

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void printAll(){
	    for(Employee x: employeeList){
	        System.out.println(x);
	        System.out.println();
	    }
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + ", joiningDate=" + joiningDate + ", status=" + status + "]";
	}
}
