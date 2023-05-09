package Buoi5;

import java.util.Scanner;

public class KhachHang {
	private String id, hTen, dChi;
	
	public KhachHang() {
		id = new String();
		hTen = new String();
		dChi = new String();
	}
	public KhachHang(KhachHang k) {
		id = new String(k.id);
		hTen = new String(k.hTen);
		dChi = new String(k.dChi);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id khach hang: ");
		id = sc.nextLine();
		System.out.print("Nhap ho ten khach hang: ");
		hTen = sc.nextLine();
		System.out.print("Nhap dia chi khach hang: ");
		dChi = sc.nextLine();
	}
	public void in() {
		System.out.println("\nMSKH: " + id +"\nHo va ten: "+ hTen +"\nDia chi: "+ dChi);
	}
	public String toString() {
		return ("\nMSKH: " + id +"\nHo va ten: "+ hTen +"\nDia chi: "+ dChi);
	}
	public float layTLeGiam() {
		return 0;
	}
}
