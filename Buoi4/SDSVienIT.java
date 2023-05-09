package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SDSVienIT {
	public static void main(String[] args) {
		SinhVien ds[];
		System.out.print("Nhap so sinh vien: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new SinhVien[n];
		int c;
		for(int i = 0; i < n; i++)
			ds[i] = new SinhVien();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
			ds[i].nhapThongTin();
			ds[i].nhapDiem();
		}
		for(SinhVien e: ds)
			System.out.println(e+", voi DiemTB: "+e.diemTB());
	}
}
