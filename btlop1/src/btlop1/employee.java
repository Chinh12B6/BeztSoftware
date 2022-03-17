package btlop1;

import java.util.*;
class Regularemployee{
	int id;
	String name;
	float salary;
	float salaryGrading;
	float benefitGrading;
	void input(){
		Scanner Ob =new Scanner(System.in);
		System.out.print("Nhap Id: ");
		this.id = Ob.nextInt();
		System.out.print("Nhap Name: ");
		Ob.nextLine();
		this.name = Ob.nextLine();
		System.out.print("Nhap SalaryGrading: ");
		this.salaryGrading = Ob.nextFloat();
		System.out.print("Nhap BenefitGrading: ");
		this.benefitGrading = Ob.nextFloat();
		
	}
	void output() {
		System.out.println("Id:"+this.id+" | Name:"+this.name+" | Salary:"+calculateSalary());
		System.out.print("SalaryGrading:"+this.salaryGrading+" | BenefitGrading:"+this.benefitGrading);
	}
	float calculateSalary() {
		this.salary = 100*(1 + this.salaryGrading + benefitGrading);
		return salary;
	}
}
class employeeList{
	void inputEmployee(Regularemployee []a, int n) {
		for(int i=0;i<n;i++) {
			a[i] = new Regularemployee();
			a[i].calculateSalary();
			a[i].input();
		}
	}
	void outputEmployee(Regularemployee []a, int n) {
		for(int i=0;i<n;i++) {
			a[i].output();
			System.out.println("");
		}
	}
	void sort(Regularemployee []a, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].calculateSalary()>a[j].calculateSalary()) {
					Regularemployee t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
	}
	void maxSalary(Regularemployee []a, int n) {
		float max=0;
		for(int i=0;i<n;i++) {
			if(a[i].calculateSalary()>=max)
				max=a[i].calculateSalary();
		}
		for(int i=0;i<n;i++) {
			if(a[i].calculateSalary()==max)
				a[i].output();
		}
	}
}
public class employee {
public static void main(String[] args) {
	//Ques2
//	employee ob = new employee();
//	ob.input();
//	ob.output();
	//Ques3
	System.out.println("\nNhap so nhan vien");
	int n;
	Regularemployee [] a = new Regularemployee[100];
	Scanner Ob = new Scanner(System.in);
	n = Ob.nextInt();
	employeeList ObJ = new employeeList();
	System.out.println("\nNhap danh sach nhan vien");
	ObJ.inputEmployee(a, n);
	System.out.println("\nXuat danh sach nhan vien");
	ObJ.outputEmployee(a, n);
	System.out.println("\nSap xep tang dan luong nhan vien");
	ObJ.sort(a, n);
	ObJ.outputEmployee(a, n);
	System.out.println("\nNhan vien co luong cao nhat");
	ObJ.maxSalary(a, n);
}
}
