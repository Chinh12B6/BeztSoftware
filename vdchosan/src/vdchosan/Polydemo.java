package vdchosan;

class shape {
	void draw() {
		System.out.println("Ve hinh!");
	}
}

class rectangle extends shape {
	// method overriding de cai dat polymorphism
	void draw() {
		System.out.println("Ve hinh chu nhat!");
	}
}

class square extends shape {
	// method overriding de cai dat polymorphism
	void draw() {
		System.out.println("Ve hinh vuong!");
	}
}

public class Polydemo {

	public static void main(String[] args) {
		//polymorphism
		shape objS ;
		objS = new rectangle();
		objS.draw();
		objS = new square();
		objS.draw();
	}
}

