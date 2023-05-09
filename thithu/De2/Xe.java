package De2;

import java.util.Scanner;

public class Xe {
	private Dco d;
	private String so, ten;
	private long gia;
	private char tthai;
	
	public Xe() {
		d = new Dco();
		so = new String();
		ten = new String();
		gia = 0;
		tthai = 'C';
	}
	public Xe(Xe x) {
		d = new Dco(x.d);
		so = new String(x.so);
		ten = new String(x.ten);
		gia = x.gia;
		tthai = x.tthai;
	}
	public long phiTBa() {
		return (long)(gia*10/100);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap bien so xe: ");
		so = sc.nextLine();
		System.out.print("Nhap ten chu xe: ");
		ten = sc.nextLine();
		System.out.print("Nhap gia tien: ");
		gia = sc.nextLong();
		System.out.print("Nhap trang thai cua xe(C or K): ");
		tthai = sc.next().charAt(0);
		System.out.println("Nhap thong tin dong co: ");
		d.nhap();
	}
	public void in() {
		System.out.println("Bien so xe: "+so+"\nTen chu xe: "+ten+"\nGia tien: "+gia+"VND");
		if(tthai == 'C')
			System.out.println("Xe duoc phep luu hanh");
		else
			System.out.println("Xe khong duoc phep luu hanh");
		System.out.println("Thong tin dong co: ");
		d.in();
	}
	public long getGia() {
		return gia;
	}
	public char gettthai() {
		return tthai;
	}
	public int getThang() {
		return 0;
	}
	public int getNam() {
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe: ");
		int m = sc.nextInt();
		Xe ds[] = new Xe[m];
		for(int i = 0; i < m ; i++)
			ds[i] = new Xe();
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap thong tin xe thu "+(i+1)+": ");
			ds[i].nhap();
		}
		System.out.println("Thong tin tat ca cac xe:");
		for(int i = 0; i < m ; i++) {
			System.out.println("Thong tin xe thu "+(i+1)+": ");
			ds[i].in();
			System.out.println("Phi truoc ba: "+ds[i].phiTBa()+" VND");
		}
		System.out.println("Thong tin xe bi huy hoac thu hoi: ");
		for(int i = 0; i < m; i++) {
			if(ds[i].getGia() < 10000000 && ds[i].gettthai() == 'K') {
				System.out.println("Thong tin xe thu "+(i+1)+": ");
				ds[i].in();
			}
		}
		System.out.println("---------------------------------");
		float tong = 0.0f;
		for(int i = 0; i < m; i++) {
			if(ds[i].d.getThang() < 10 && ds[i].d.getNam() == 2000)
				tong+=ds[i].phiTBa();
		}
		System.out.print("Tong phi truoc ba: "+tong);
	}
}
