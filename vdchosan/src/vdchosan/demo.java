package vdchosan;

import java.util.*;

//abstract class
abstract class person {
	int id;
	String name;

	// non-abstract method
	void input() {
		Scanner objSc = new Scanner(System.in);
		System.out.print("Id:");
		this.id = objSc.nextInt();
		objSc.nextLine();

		System.out.print("Name:");
		this.name = objSc.nextLine();
	}

	void output() {
		System.out.println("id " + this.id + "name: " + this.name);
	}

	// abstract method
	abstract void bonus();
}

class student extends person {
	int studId;
	float mark;

	// Cai dat abstract method cua lop cha
	void bonus() {
		if (mark >= 3.3)
			System.out.println("Thuong 5 trieu!");
		else {
			System.out.println("Khong co!");
		}
	}
}

class lecturer extends person {
	int lecId;
	int paper;

	// Cai dat abstract method cua lop cha
	void bonus() {
		if (paper >= 3)
			System.out.println("Thuong 15 trieu!");
		else {
			System.out.println("Khong co!");
		}
	}
}

public class demo {
	public static void main(String[] args) {
		student objSt = new student();
		objSt.input();
		objSt.output();
		objSt.bonus();

		lecturer objL = new lecturer();
		objL.input();
		objL.output();
		objL.bonus();
	}
}
