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
		System.out.println("��Ա�������� "+ name);
		System.out.println("��Ա�������� "+ age);
		System.out.println("��Ա��ְλ�� "+ designation);
		System.out.println("��Ա��нˮ�� "+ salary);
	}
}
