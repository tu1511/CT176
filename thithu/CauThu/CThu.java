package CauThu;

import java.util.Scanner;

public class CThu extends CNguoi{
	private int so;
	private String vtri, mua, clbo;
	private long bthang;
	
	public CThu() {
		super();
		so = 1;
		vtri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}
	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vtri = new String(ct.vtri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	} 
	public void nhap() {
		System.out.println("Nhap thong tin cau thu: ");
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ao: ");
		so = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vi tri : ");
		vtri = sc.nextLine();
		System.out.print("Nhap so ban thang: ");
		bthang = sc.nextLong();
		sc.nextLine();
		System.out.print("Nhap mua giai: ");
		mua = sc.nextLine();
		System.out.print("Nhap cau lac bo: ");
		clbo = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("So ao: "+so+"\nVi tri: "+vtri+"\nSO ban thang: "+bthang+"\nMua giai: "+mua +"\nCau lac bo: "+clbo);
	}
	public String toString() {
		return super.toString()+("So ao: "+so+"\nVi tri: "+vtri+"\nSO ban thang: "+bthang+"\nMua giai: "+mua +"\nCau lac bo: "+clbo);
	}
	public long tinhLuong() {
		long luongcb = 7000000, luong, thuong;
		if(vtri.equalsIgnoreCase("thu mon")) luongcb += 3000000;
		if(vtri.equalsIgnoreCase("hau ve")) luongcb += 4000000;
		if(vtri.equalsIgnoreCase("trung ve")) luongcb += 4500000;
		if(vtri.equalsIgnoreCase("tien ve")) luongcb += 5000000;
		if(vtri.equalsIgnoreCase("tien dao")) luongcb += 7000000;
		thuong = bthang * 500000;
		luong = (long)(luongcb + thuong -0.1*(luongcb+thuong));
		return luong;
	}
	public String layVTri() {
		return vtri;
	}
	public long layBThang() {
		return bthang;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong con nguoi/cau thu: ");
		int n = sc.nextInt();
		CNguoi ds[] = new CNguoi[n];
		for(int i = 0; i< n; i++) {
			System.out.println("Nhap thong tin nguoi thu "+(i+1)+": ");
			System.out.println("Nhap con nguoi(0) hay cau thu(1): ");
			int c = sc.nextInt();
			if(c == 0)
					ds[i] = new CNguoi();
			else
				ds[i] = new CThu();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin nguoi thu " +(i+1)+": ");
			ds[i].in();
		}
		System.out.println("Danh sach tien luong cua cac cau thu: ");
		for(int i = 0; i < n; i++) {
			if(ds[i] instanceof CThu) {
				System.out.println("Ho va ten: "+ds[i].layHTen()+", vi tri: "+ds[i].layVTri()+", luong: "+ds[i].tinhLuong());
			}
		}
		long sum1 = 0, sum2 = 0, sum3 = 0;
		System.out.println("Thong ke ban thang: ");
		for(int i = 0; i < n; i++) {
			if(ds[i] instanceof CThu) {
				if(ds[i].layTuoi() >=18 && ds[i].layTuoi() <= 24) {
					sum1 += ds[i].layBThang();
				}
				if(ds[i].layTuoi() >=25 && ds[i].layTuoi() <= 28) {
					sum2 += ds[i].layBThang();
				}
				if(ds[i].layTuoi() > 28) {
					sum3 += ds[i].layBThang();
				}
			}
		}
		System.out.println("So ban thang o do tuoi (18-24): "+sum1);
		System.out.println("So ban thang o do tuoi (25-28): "+sum2);
		System.out.println("So ban thang o do tuoi (> 28): "+sum3);
	}
}
