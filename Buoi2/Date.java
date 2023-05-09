package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 2023;
	}
	public Date(int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public String toString() {
		return (ngay+"/"+thang+"/"+nam);
	}
	public void HienThi() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe())
				System.out.println("Ban da nhap sai\nMoi nhap la!");
		}while(!hopLe());
	}
	public boolean hopLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31};
		boolean h = false;
		if(((nam%4 == 0) && (nam%100!=0) )|| (nam %400 == 0))
			max[2] = 29;
		if(ngay > 0 && ngay <= max[thang] && thang > 0 && thang < 13 && nam > 0)
			h = true;
		return h;			
	}
	public Date ngayHomSau() {
		Date n = new Date(ngay, thang, nam);
		n.ngay++;;
		if(!n.hopLe()) {
			n.ngay = 1;
			n.thang++;
			if(!n.hopLe()) {
				n.thang = 1;
				n.nam++;
			}
		}
		return n;
	}
	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam);
		for(int i = 0; i < n; i++)
			d = d.ngayHomSau();
		return d;
	}
	public int getNgay() {
		return ngay;		
	}
	public int getThang() {
		return thang;
	}
	public int getNam() {
		return nam;
	}
}
