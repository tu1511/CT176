package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String maSoSv, hoTen;
	private Date ngaySinh;
	private int n;
	private String mon[];
	private String diem[];
	private final int max = 40;

	public SinhVien(){
		maSoSv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		n = 0;
		mon = new String[max];
		diem = new String[max];
	}
	public SinhVien(SinhVien a){
		maSoSv = new String(a.maSoSv);
		hoTen = new String(a.hoTen);
		ngaySinh = new Date(a.ngaySinh);
		n = a.n;
		mon = new String[max];
		diem = new String[max];
		for(int i = 0; i < n; i++){
			mon[i] = new String(a.mon[i]);
			diem[i] = new String(a.diem[i]);
		}
	}
	public String getMS(){
		return maSoSv;
	}
	public String getHoTen(){
		return hoTen;
	}
	public String getTen(){
		return hoTen.substring(hoTen.lastIndexOf(" ")+1);
	}
	public void nhapThongTin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so sinh vien: ");
		maSoSv = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh.nhap();
	}
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hoc phan: ");
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			System.out.print("Nhap ten mon thu "+(i+1)+": ");
			mon[i] = sc.nextLine();
			System.out.print("Nhap diem mon hoc: ");
			diem[i] = sc.nextLine();
		}
	}
	public String toString(){
		String s = ("["+maSoSv+", "+hoTen +", "+ngaySinh);
		for(int i = 0; i < n; i++)
			s+=("; " + mon[i] + ": " + diem[i]);
		s+=("]");
		return s;
	}
	public float diemTB(){
		float tong = 0.0f;
		for(int i = 0; i < n; i++){
			if(diem[i].equals("A")) tong += 4.0f;
				else if(diem[i].equals("B+")) tong += 3.5f;
					else if(diem[i].equals("B")) tong += 3.0f;
						else if(diem[i].equals("C+")) tong += 2.5f;
							else if(diem[i].equals("C")) tong += 2.0f;
								else if(diem[i].equals("D+")) tong += 1.5f;
									else if(diem[i].equals("D")) tong += 1.0f;
										else if(diem[i].equals("F")) tong += 0.0f;
		}
		return tong/n;
	}
	public void themHP(String m, String d){
		if(n < max){
			mon[n] = new String(m);
			diem[n] = new String(d);
			n++;
		}
		else
			System.out.println("Danh sach da day!");
	}
	public void xoaHP(String m){
		int i =0;
		for(i = 0; i <n; i++)
			if(mon[i].equals(m))
				break;
		if(i < n){
			for(int j = 0; j < n-1; j++){
				mon[j] = mon[j+1];
				diem[j] = diem[j+1];
			}
			n--;
		}
	}
}