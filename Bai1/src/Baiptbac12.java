package Bai1; 
import java.util.*;
import java.io.*;
public class Baiptbac12 {

	public static int nhapso(String str) {
		int a;
		Scanner objSc= new Scanner(System.in);
		System.out.println(str);
		a=objSc.nextInt();
		return a;
	}
	public static void pt1(int a,int b) {
		float x;
		if(a==0) {
			if(b==0)
				System.out.println("phuong trinh vo so nghiem");
			else
				System.out.println("phuong trinh vo nghiem ");
		}else {
			x=(float)-b/a;
			System.out.println("phuong trinh có nghiem la :"+x);
		}
			
	}
	public static void pt2(int a,int b,int c) {
		float denta,x1,x2;
		denta=b*b-4*a*c;
		if(denta==0) {
			x1=(float) -b/(2*a);
			System.out.println("phuong trinh co nghiem kep x="+x1);
		}
		if(denta>0) {
			x1=(float) (-b+Math.sqrt(denta))/(2*a);
			x2=(float) (-b-Math.sqrt(denta))/(2*a);
			System.out.println("phuong trinh co hai nghiem x1="+x1+"va x2="+x2);
		}
		if(denta<0)
			System.out.print("phuong trinh vo nghiem");
	}
	public static void main(String[] argvs) throws IOException{
		int a,b,c;
		char chon,y;
		Scanner objSc= new Scanner(System.in);
		do {
			a=nhapso("nhap so a :");
			b=nhapso("nhap so b :");
			c=nhapso("nhap so c :");
			System.out.println("1/giai phuong trinh bac 1\n2/giai phuong trinh bac 2\nhay chon 1 hoac 2:");
			chon= (char) System.in.read();
			switch(chon) {
			case '1':pt1(a,b);
					break;
			case '2':pt2(a,b,c);
					break;
			default :System.out.println("nhap sai r hay nhap lai nhe!!!!");
					break;
			}
			System.in.skip(chon);
			System.out.println("\nmuon tiep tuc ko(Y/N)");
			y= (char) System.in.read();
		}while(y=='y'||y=='Y');
	}
}


	}

}
