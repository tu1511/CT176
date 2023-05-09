package Buoi3;

import Buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		AB.DoiDiem(5, 3);
		System.out.println("Toa do AB: "+AB);
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println("Toa do CD: "+CD.khoangCach());
		System.out.println("Goc CD voi truc hoanh: "+CD.tinhGoc()+"°");
	}
}
