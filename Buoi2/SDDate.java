package Buoi2;

public class SDDate {

	public static void main(String[] args) {
		Date a = new Date(11, 2, 2023);
		a.HienThi();
		Date b = new Date();
		b.nhap();
		b.HienThi();
		System.out.println("ngay hom sau la: ");
		b.ngayHomSau().HienThi();
		System.out.println("Ngay khi con them 20 ngay la: ");
		b = b.congNgay(20);
		b.HienThi();
	}
}
