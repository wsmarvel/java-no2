package num2;

import java.io.*;

public class EmployeeTest {
	
	public static void main(String args[]) {
		/*ʹ�ù�����������������*/
		Employee empOne = new Employee("��Ա1");
		Employee empTwo = new Employee("��Ա2");
		
		//��������������ĳ�Ա����
		empOne.emAge(20);
		empOne.emDesignation("��������Ա");
		empOne.emSalary(1000);
		empOne.printEmployee();
		
		empTwo.emAge(30);
		empTwo.emDesignation("�߼�����Ա");
		empTwo.emSalary(3000);
		empTwo.printEmployee();
		
	}
	
}
