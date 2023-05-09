package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SVienIT extends SinhVien{
	private String taikhoan, matkhau, email;
	public SVienIT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SVienIT(SVienIT d) {
		super(d);
		taikhoan = new String(d.taikhoan);
		matkhau = new String(d.matkhau);
		email = new String(d.email);
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khhoan: ");
		taikhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}
	public String toString() {
		return super.toString()+", "+taikhoan+", "+email;
	}
	public String layTaiKhoan() {
		return taikhoan;
	}
	public String layEmail() {
		return email;
	}
	public void doiMauKhau(String newpass) {
		matkhau = new String(newpass);
	}
}
