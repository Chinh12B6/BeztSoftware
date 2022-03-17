package vdchosan;

import java.io.*;
import java.util.*;

class Employee{
    String ID, name;
    float salary;
    
    Employee() {
    	this.ID = "";
    	this.name = "";
    	this.salary = 0;
    }
    
    public float calculateSalary() {
    	return 0;
    }
    
    void input() {
    	Scanner objSc = new Scanner(System.in);
    	System.out.print("Nhap ID:");
    	ID = objSc.nextLine();
    	
    	System.out.print("Nhap name:");
    	name = objSc.nextLine();
    	
    	System.out.print("Nhap luong:");
    	salary = objSc.nextFloat();
    }
    
    void output() {
    	System.out.println("Id:" + ID);
    	System.out.println("Name:" + name);
    	System.out.println("Salary:" + salary);
    }
}

class RegularEmployee extends Employee {
	float salaryGrading, benefitGrading;
	
	RegularEmployee() {
		this.salaryGrading = 0;
		this.benefitGrading= 0;
	}
	
	public float calculateSalary() {
		salary = 1000000 * (1 + salaryGrading + benefitGrading);
		return salary;
	}
	void input() {
		super.input();
	    Scanner objSc = new Scanner(System.in);
	    
	    System.out.print("Nhap salaryGrading:");
		salaryGrading = objSc.nextFloat();
		
		System.out.print("nhap benefitGrading:");
		benefitGrading = objSc.nextFloat();
	}
}

class ContractStaff extends Employee{
	Float wage, workday, excessHoursGrading;
	
	ContractStaff(){
		this.wage = (float) 0;
		this.workday = (float) 0;
		this.excessHoursGrading = (float) 0;
	}
	void input() {
		super.input();
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap wage:");
		wage = objSc.nextFloat();
		
		System.out.print("Nhap workday:");
		workday = objSc.nextFloat();
		
		System.out.print("nhap excessHoursGrading:");
		excessHoursGrading = objSc.nextFloat();
	}
	public float calculateSalary() {
		salary = wage * workday * (1 + excessHoursGrading);
		return salary;
	}
}
class employeeList {
    Employee empList[] = new Employee[100];
    int n=0;
    char chon, loai;
    
    void inputEmployee() throws IOException {
    	do {
    		System.out.println("Bien che hay hop dong (B/H)?");
    		loai = (char) System.in.read();
    		if (loai == 'B' || loai == 'b')
    			empList[n] = new RegularEmployee();
    		else empList[n] = new ContractStaff();
    		System.in.skip(loai);
    		empList[n++].input();
    		System.out.println("Tiep tuc (C/K)?");
    		chon = (char) System.in.read();
    		System.in.skip(chon);
    		if ((n == 100) || (chon == 'K') || (chon == 'k')) break;
    	} while (true);
    	}
     void outputEmployee() {
    	 for (int i = 0; i < n; i++) {
    		 System.out.println("ID " + empList[i].ID);
    		 System.out.println("Luong " + empList[i].salary);
    	 }
}
}
public class employee{
	public static void main(String[] args) throws IOException {
		employeeList objEmp = new employeeList();
		objEmp.inputEmployee();
		objEmp.outputEmployee();
	}}

