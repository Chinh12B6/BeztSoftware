package btlop1;
import java.util.*;
class student {

	int id;
	String name;
	//method
	void input () {
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap id:");
		id = objSc.nextInt();
		///
		objSc.nextLine();
		System.out.print("Nhap name:");
		name = objSc.nextLine();
	}
	
    void output() {
    	System.out.println("id " + "  " + id + "Name: " + "  " + name); 
    }
}

class stList {
	void input(student [] st, int n) {
		for (int i=0; i<n; i++) {
			st[i] = new student();
			System.out.println("Sinh vien thu " + (i + 1) + ":");
			st[i].input();
		}
	}
	void output(student[] st, int n) {
		System.out.println("Danh sach sinh vien");
		for (int i=0; i<n; i++) {
			st[i].output();
		}
	}
}
public class Test3 {
	public static void main(String [] args) {
		int n; 
		student[] listOfSt = new student[100];
		stList list = new stList();
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap so sv:");
		n= objSc.nextInt();
		list.input(listOfSt,  n);
		list.output(listOfSt, n);
	}
}