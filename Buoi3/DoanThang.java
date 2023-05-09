package Buoi3;

import Buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;
	public DoanThang() {
		 d1 = new Diem();
		 d2 = new Diem();
	}
	public DoanThang(Diem d1a, Diem d2a) {
		d1 = new Diem(d1a);
		d2 = new Diem(d2a);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, bx);
		d2 = new Diem(ay, by);
	}
	public void nhap() {
		System.out.println("Nhap d1");
		d1.nhap();
		System.out.println("Nhap d2");
		d2.nhap();
	}
	public String toString() {
		return "["+d1+","+d2+"]";
	}
	public void in() {
		System.out.println("["+d1.toString()+","+d2.toString()+"]");
	}
	public void DoiDiem(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float khoangCach() {
		return d1.khoangCach(d2);
	}
	public float tinhGoc() {
		return (float)Math.toDegrees(Math.acos((Math.abs(d2.giaTriX()-d1.giaTriX()))/khoangCach()));
	}
}
