package Buoi5;

import java.util.Scanner;

import Buoi2.Date;

public class HoaDon {
	private int so;
	private String tDe;
	private Date d;
	private KhachHang k;
	private ChiTiet c[];
	
	public HoaDon() {
		so = 1;
		tDe = new String();
		d = new Date();
		k = new KhachHang();
		c = new ChiTiet[50];
	}
	public HoaDon(HoaDon h) {
		so = h.so;
		tDe = new String(h.tDe);
		d = new Date(h.d);
		k = new KhachHang(h.k);
		c = new ChiTiet[50];
		for(int i = 0; i < h.c.length; i++) {
			if(h.c[i] == null) break;
			c[i] = new ChiTiet(h.c[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hoa don: ");
		so = sc.nextInt();
		System.out.print("Nhap tieu de hoa don: ");
		tDe = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap ngay lap hoa don: ");
		d.nhap();
		System.out.print("Nhap thong tin khach hang(0) hay khach hang VIP (1):");
		int a = sc.nextInt();
		if(a == 0) k = new KhachHang();
		else k = new KhachHangVIP();
		k.nhap();
		System.out.print("Nhap so chi tiet hoa don hang hoa: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			c[i] = new ChiTiet();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap chi tiet thu "+(i+1)+" : " );
			c[i].nhap();
		}
	}
	public void in() {
		System.out.println("Ma so hoa don: "+so+"\nTieu de hoa don: "+tDe+"\nNgay xuat: "+ d+ "\nThong tin khach hang: "+ k+"\n");
		System.out.print("STT\tTen san pham\tNSX\tSo luong\tDon Gia\tThanh tien\n");
		for(int i = 0; i <c.length;i++) {
			if(c[i] == null) break;
			System.out.print(c[i]+"\n");
		}
		System.out.print("Tong so tien: "+tTien()+"Cam on quy khach da su dung dich vu!");
	}
	public String toString() {
		String result = ("Ma so hoa don: "+so+"\nTieu de hoa don: "+tDe+"\nNgay xuat: "+ d+ "\nThong tin khach hang: "+ k+"\n");
		result += ("STT\tTen san pham\t\tNSX\tSo luong\tDon Gia\tThanh tien\n");
		for(int i = 0; i <c.length;i++) {
			if(c[i] == null) break;
			result +=(c[i]);
		}
		result +=("Tong so tien: "+tTien()+"\nCam on quy khach da su dung dich vu!");
		return result;
	}
	public long tTien() {
		long t= 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == null) break;
			t += c[i].tTien();
		}
		return (long)(t*(1.1 - k.layTLeGiam()));
	}
}
