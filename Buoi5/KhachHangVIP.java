package Buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tLeGiam;
	
	public KhachHangVIP() {
		super();
		tLeGiam = 0.0f;
	}
	public KhachHangVIP(KhachHangVIP k) {
		super(k);
		tLeGiam = k.tLeGiam;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin khach hang: ");
		super.nhap();
		System.out.print("Nhap vao ti le giam: ");
		tLeGiam = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("\nTy le giam: "+tLeGiam);
	}
	public String toString() {
		return super.toString()+("\nTy le giam: "+tLeGiam);
	}
	public float layTLeGiam() {
		return tLeGiam;
	}
}
