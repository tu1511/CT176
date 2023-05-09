package Buoi5;

import java.util.Scanner;

public class HangHoa {
	private int mSo;
	private String ten, nSXuat;
	public HangHoa() {
		mSo = 1;
		ten = new String();
		nSXuat = new String();
	}
	public HangHoa(HangHoa h) {
		mSo = h.mSo;
		ten = new String(h.ten);
		nSXuat = new String(h.nSXuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hang hoa: ");
		mSo = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.print("Nhap nam san xuat: ");
		nSXuat = sc.nextLine();
	}
	public void in() {
		System.out.print(+mSo + "\t"+ten+"\t\t"+nSXuat);
	}
	public String toString() {
		return (+mSo + "\t"+ten+"\t\t"+nSXuat);
	}
}
