
public class conggluan {
	public tamgiac() {
        a = 0;
        b = 0;
        c = 0
    }
    public tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
     public void nhap(Scanner sc) {
        System.out.print("\tNhap vao canh 1: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao canh 2: ");
        b = sc.nextDouble();
        System.out.print("\tNhap vao canh 3: ");
        c= sc.nextDouble();
    }
    double p = (a+b+c);
    System.out.print("Chu vi tam giac la:"+p);
    double p2 = p/2;
    double S = Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
    System.out.print("Dien tich tam giac la:"+S);
	

}
