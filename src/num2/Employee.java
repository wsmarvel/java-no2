package num2;
import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	public Employee(String name) {
		this.name = name;
		
	}
	
	public void emAge(int emAge) {
		age = emAge;
	}
	
	public void emDesignation(String emDesignation) {
		designation = emDesignation;
	}
	
	public void emSalary(double emSalary) {
		salary = emSalary;
	}
	
	public void printEmployee() {
		System.out.println("雇员的名字是 "+ name);
		System.out.println("雇员的年龄是 "+ age);
		System.out.println("雇员的职位是 "+ designation);
		System.out.println("雇员的薪水是 "+ salary);
	}
}
