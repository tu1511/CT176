package Buoi5;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SDHoaDon {
	public static void main(String[] args) {
		HoaDon ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hoa don: ");
		int n = sc.nextInt();
		ds = new HoaDon[n];
		for(int i = 0; i < n; i++)
			ds[i] = new HoaDon();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin hoa don thu "+(i+1)+": ");
			ds[i].nhap();
		}
		for(HoaDon e: ds)
				System.out.println(e);
	}
}
