package Buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		a.nhapThongTin();
		a.themHP("LTHDT", "B+");
		System.out.println("Thong tin sinh vien: "+a);
		a.xoaHP("LTHDT");
		System.out.println("Thong tin sinh vien: "+a);
		SinhVien b = new SinhVien(a);
		System.out.println("Thong tin sinh vien: "+b);
		System.out.print("Nhap so sinh vien: ");
		int m = sc.nextInt();
		SinhVien ds[] = new SinhVien[m];
		for(int i = 0; i < m; i++)
			ds[i] = new SinhVien();
		for(int i = 0; i <m; i++){
			System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
			ds[i].nhapThongTin();
			System.out.println("Nhap diem mon hoc: ");
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach sinh vien vua nhap: ");
		for(SinhVien s: ds){
			System.out.println(s+" voi diem trung binh la: "+s.diemTB());
		}
		System.out.println("Danh sach sinh vien bi canh cao hoc vu: ");
		for(SinhVien S: ds){
			if(S.diemTB() < 1)
				System.out.println(S.getMS()+" - "+S.getHoTen());
		}
		float max = ds[0].diemTB();
		SinhVien S = ds[0];
		for(int i = 1; i < m; i++){
			if(max < ds[i].diemTB()){
				max = ds[i].diemTB();
				S = ds[i];
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat: "+S.getHoTen()+" voi diemTB: "+max);
		System.out.println("Danh sach sinh vien duoc sap xep theo ten: ");
		for(int i = 0; i < m-1; i++)
			for(int j = i+ 1; j < m; j++)
				if(ds[i].getTen().compareTo(ds[j].getTen()) > 0) {
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
		for(int i = 0; i < m; i++)
			System.out.println(ds[i].getTen());
		
		
	}
}