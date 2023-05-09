package Buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		A.hienThi();
		Diem B = new Diem();
		Diem C = new Diem();
		B.nhap();
		B.hienThi();
		C.doiDiem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		System.out.println("Khoang cach tu B den tam 0: "+B.khoangCach());
		System.out.println("Khoang cach tu A den B: "+A.khoangCach(B));
	}
}
