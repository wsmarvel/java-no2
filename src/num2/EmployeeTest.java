package num2;

import java.io.*;

public class EmployeeTest {
	
	public static void main(String args[]) {
		/*使用构造器创建两个对象*/
		Employee empOne = new Employee("雇员1");
		Employee empTwo = new Employee("雇员2");
		
		//调用这两个对象的成员方法
		empOne.emAge(20);
		empOne.emDesignation("初级程序员");
		empOne.emSalary(1000);
		empOne.printEmployee();
		
		empTwo.emAge(30);
		empTwo.emDesignation("高级程序员");
		empTwo.emSalary(3000);
		empTwo.printEmployee();
		
	}
	
}
