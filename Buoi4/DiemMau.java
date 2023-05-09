package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class DiemMau extends Diem{
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x1, int y1, String mau1) {
		super(x1, y1);
		mau = new String(mau1);
	}
	public DiemMau(DiemMau dm) {
		super(dm);
		mau = new String(dm.mau);
	}
	public void hienThi() {
		super.hienThi();
		System.out.print(", voi mau: "+mau+"\n");
	}
	public void hienThi(String S) {
		System.out.println(S);
		hienThi();
	}
	public String toString() {
		return super.toString()+", voi mau: "+mau;
	}
	public String layMau() {
		return mau;
	}
	public void ganMau(String m) {
		mau = new String(m);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
	}
}
