package btlop1;
import java.util.*;

public class baitap2 {

	public static void nhapmang(int a[], int n) {
		Scanner objSc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap so " + (i + 1) + " : ");
			a[i] = objSc.nextInt();
		}
	}

	public static void xuatmang(int a[], int n) {
		System.out.print("\nMang vua nhap : ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void minmax(int a[], int n) {
		int min = 0; int p = 0;
        int max = 0; int l = 0;				
        for (int i=0; i<=n; i++) {
        	if(min > a[i]) {min = a[i];  p = i ;;};
        	if(max < a[i]) {max = a[i];  l = i ;;};
        }
        System.out.println("Gia tri nho nhat la:" + min +" o vi tri so " + p );
        System.out.println("Gia tri lon nhat la:" + max +" o vi tri so " + l );
		
	}
	public static int tong(int a[], int n) {
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = s + a[i];
		}
		return s;
	}
	public static int nt(int n) {
		int dem = 0;
		for (int i = 1; i <= n ; i++) {
			if (n % i == 0)
				dem++;
		}
		if (dem == 2)
			return 1;
		else
			return 0;
	}

	public static void xuatnt(int a[], int n) {
		int k = 0;
		int t = 0;
		System.out.print("\nCac so nt la : ");
		for (int i = 0; i < n; i++) {
			if (nt(a[i]) == 1) {
				System.out.print(a[i] + " ");
				t = t + a[i];
				k++;
			}
		}
		System.out.print("\nTong so nt = " + t);
		System.out.print("\nTong cac so khong phai nt = " + (tong(a, n) - t));
		if (k == 0)
			System.out.print("\nKhong co so nguyen to trong mang");
	}
	public static int hoanhao(int a) {
		int k = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0)
				k = k + i;
		}
		if (k == a)
			return 1;
		else
			return 0;
	}
	public static void sapxephh(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(hoanhao(a[i])==0&&hoanhao(a[j])==1){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	}
	public static int ktrascp(int a) {
		for(int i=0 ; i<a ;i++) {
			if(i*i == a)
				return 1;
		}
		return 0;
	}
	public static void xoascp(int[] a, int n) {
		for(int i=0; i<n-1 ;i++) {
			for(int j=i+1; j<=n ; j++)
			if(ktrascp(a[i])==1) {
				a[i] = a[j];
				n--;	
			}
		}
		System.out.print("\nMang sau khi xoa so chinh phuong: ");
		xuatmang(a,n);
	}
	public static void sochinhphuong(int[] a, int n) {
		System.out.print("Cac so chinh phuong la: ");
		for(int i=0; i<n-1 ;i++) {
			for(int j=i+1; j<=n ; j++)
			if(ktrascp(a[i])==1) {
				System.out.print(a[i]);
			}
		}}
	public static void main(String[] args) {
		int[] a = new int[100];
		int n;
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang : ");
		n = objSc.nextInt();
		nhapmang(a, n);
		xuatmang(a, n);
		minmax(a,n);
		xuatnt(a, n);
		hoanhao(n);
		sapxephh(a, n);
		xoascp(a, n);
		sochinhphuong(a, n);
	}
}